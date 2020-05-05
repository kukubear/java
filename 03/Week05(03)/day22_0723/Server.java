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
	System.out.println("[Server]"+getTime()+"������ �غ�Ǿ����ϴ�.");
	}catch(IOException e) {
		e.printStackTrace();
	}
	while(true) {
		try {
			System.out.println("[Server]"+getTime()+"�����û�� ��ٸ��ϴ�.");
			// ���������� Ŭ���̾�Ʈ�� �����û�� �� ������ ������ ���߰� ��� ��ٸ���.
			// Ŭ���̾�Ʈ�� �����û�� ���� Ŭ���̾�Ʈ ���ϰ� ����� ���ο� ������ �����Ѵ�.
			Socket socket = serverSocket.accept();
			System.out.println("[Server]"+getTime()+socket.getInetAddress()+"�� ���� �����û�� ���Խ��ϴ�.");
			
			// ������ ��½�Ʈ���� ��´�.
			OutputStream out = socket.getOutputStream();
			DataOutputStream dos = new DataOutputStream(out);
			
			// ���� ����(remote socket)�� �����͸� ������.
			dos.writeUTF("[Notice] Test Message1 from Server.");
			System.out.println("[Server]"+getTime()+"�����͸� �����߽��ϴ�.");
			
			
			// ��Ʈ���� ������ �ݾ��ش�.
			dos.close();
			socket.close();
		}catch(IOException e) {
			e.printStackTrace();
		}	
		
	}//while
	
	try {
		String serverIp ="127.0.0.1";
		System.out.println("[Client] ������ ���� ���Դϴ�. ���� IP : "+serverIp);
		
		// ������ �����Ͽ� ������ ��û�Ѵ�.
		Socket socket = new Socket(serverIp,7777);
		
		// ������ �Է½�Ʈ���� ��´�.
		InputStream in = socket.getInputStream();
		DataInputStream dis = new DataInputStream(in);
		
		// �������� ���� ���� �����͸� ����Ѵ�
		System.out.println("[Client] �����κ��� ���� �޽��� : "+dis.readUTF());
		System.out.println("[Client] ������ �����մϴ�. ");
		
		//��Ʈ���� ���� �ݱ�
		dis.close();
		socket.close();
		System.out.println("[Client] ������ ����Ǿ����ϴ�. ");
		
		
	}catch(ConnectException ce) {
		ce.printStackTrace();
	}catch(IOException ie) {
		ie.printStackTrace();
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	}
}
