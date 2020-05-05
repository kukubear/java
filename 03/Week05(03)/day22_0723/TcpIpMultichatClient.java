package day22_0723;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;
import java.util.Scanner;

import day22_0723.TcpIpMultichatClient.ClientSender.ClientReceiver;

public class TcpIpMultichatClient {
	public static void main(String[] args) {
		String chatName = "Juyeon";
		try {
			String serverIp = "192.168.0.25"
					;

			// 소켓을 생성하여 연결을 요청한다.

			Socket socket = new Socket(serverIp, 7777);
			System.out.println("서버에 연결되었습니다.");
			Thread sender = new Thread(new ClientSender(socket, chatName));
			Thread receiver = new Thread(new ClientReceiver(socket));

			sender.start();
			receiver.start();
		} catch (ConnectException ce) {
			ce.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

//서버에 chat문장 전달하는 Thread
	static class ClientSender extends Thread {
		Socket socket;
		DataOutputStream out;
		String name;

		ClientSender(Socket socket, String name) {
			this.socket = socket;
			try {
				out = new DataOutputStream(socket.getOutputStream());
				this.name = name;
			} catch (Exception e) {

			}
		}

		public void run() {
			// 대화를 입력
			Scanner scan = new Scanner(System.in);
			try {
				if (out != null) {
					out.writeUTF(name);
				}

				while (out != null) {
					out.writeUTF("[ " + name + " ]" + scan.nextLine());
				}
			} catch (IOException e) {

			}
		}

		static class ClientReceiver extends Thread {
			Socket socket;
			DataInputStream in;

		ClientReceiver(Socket socket){
		this.socket = socket;
		try {
			in = new DataInputStream(socket.getInputStream());
		}catch(IOException e) {
			
		}
		}
		
		public void run() {
			while(in!=null) {
				try {
					System.out.println(in.readUTF());
				}catch(IOException e) {
					
				}
			}
			
			
		}
		}
	}
}
