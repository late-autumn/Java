package NT_Day2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class UnicastServer {

	
	public UnicastServer() {
		// TODO Auto-generated constructor stub
		ServerSocket server = null;
		
		try{
			//���� ���� ���� 
			server = new ServerSocket(5000);
			
		}catch(IOException io){
			System.out.println("�ش� ��Ʈ�� �����ϴ�.");
			System.exit(0);
		}
		
		try{
			
			while(true){
				System.out.println("Server Ready...");
				//Ŭ���̾�Ʈ�� �����û�� �����Ǹ�
				//�ش� Ŭ���̾�Ʈ�� ����� Socket�� ������.
				Socket socket = server.accept();
				
				//Ŭ���̾�Ʈ�� �޼����� �ۼ����� UnicastSeverThread ����
				//UnicastServerThread ������ Socket�� ������ 
				
				UnicastServerThread thread = new UnicastServerThread(socket);
				
				thread.start();
				
			}
		}catch(IOException io){
			io.printStackTrace();
		}
	
	}
	
	
	
	
	public static void main(String[] args) {
		
		new UnicastServer();
		
	}
}
