package day22_0723;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		
	
	ServerSocket serverSocket = null;
	try {
	serverSocket = new ServerSocket(7777);
	System.out.println("[Server]"+getTime()+"서버가 준비되었습니다.");
	}catch(IOException e) {
		e.printStackTrace();
	}
	while(true) {
		try {
			System.out.println("[Server]"+getTime()+"연결요청을 기다립니다.");
			// 서버소켓은 클라이언트의 연결요청이 올 때까지 실행을 멈추고 계속 기다린다.
			// 클라이언트의 연결요청이 오면 클라이언트 소켓과 통신할 새로운 소켓을 생성한다.
			Socket socket = serverSocket.accept();
			System.out.println("[Server]"+getTime()+socket.getInetAddress()+"로 부터 연결요청이 들어왔습니다.");
			
			// 소켓의 출력스트림을 얻는다.
			OutputStream out = socket.getOutputStream();
			DataOutputStream dos = new DataOutputStream(out);
			
			// 원격 소켓(remote socket)에 데이터를 보낸다.
			dos.writeUTF("[Notice] Test Message1 from Server.");
			System.out.println("[Server]"+getTime()+"데이터를 전송했습니다.");
			
			
			// 스트림과 소켓을 닫아준다.
			dos.close();
			socket.close();
		}catch(IOException e) {
			e.printStackTrace();
		}	
		
	}//while
	
	try {
		String serverIp ="127.0.0.1";
		System.out.println("[Client] 서버에 연결 중입니다. 서버 IP : "+serverIp);
		
		// 소켓을 생성하여 연결을 요청한다.
		Socket socket = new Socket(serverIp,7777);
		
		// 소켓의 입력스트림을 얻는다.
		InputStream in = socket.getInputStream();
		DataInputStream dis = new DataInputStream(in);
		
		// 소켓으로 부터 받은 데이터를 출력한다
		System.out.println("[Client] 서버로부터 받은 메시지 : "+dis.readUTF());
		System.out.println("[Client] 연결을 종료합니다. ");
		
		//스트림과 소켓 닫기
		dis.close();
		socket.close();
		System.out.println("[Client] 연결이 종료되었습니다. ");
		
		
	}catch(ConnectException ce) {
		ce.printStackTrace();
	}catch(IOException ie) {
		ie.printStackTrace();
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	}
}
