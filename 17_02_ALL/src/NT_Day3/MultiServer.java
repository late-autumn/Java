package NT_Day3;
/* MultiServer : ��� Ŭ���̾�Ʈ�� �����û�� �޾Ƽ� Socket�� �����ϰ�
 * Socket�� �����ϱ� ���� Thread�� �����Ѵ�.
 * ������ ������ ��ü�� Collection���� �����Ѵ�.
 */
import java.net.*;
import java.io.*;
import java.util.*;

public class MultiServer {

	/*
	 * Ư�� Ŭ���̾�Ʈ�� ���� �޼����� ��� Ŭ���̾�Ʈ���� �����ϱ� ����
	 * Ŭ���̾�Ʈ�� �޼��� �ۼ��� �� �� �ִ� ����� ���� MultiServerThread��ü��
	 * ������ �ڷᱸ���� ������.
	 */
	
	private ArrayList<MultiServerThread> clientList  = new ArrayList<>();
	private ServerSocket server = null;
	
	public MultiServer() {
		//???? �� ��Ʈ��ȣ�� Ŭ���̾�Ʈ�� ���� ȿû�� ��ٸ����ִ� ���� ���� ����
		try{
		server = new ServerSocket(3000);
		System.out.println("���� ���۵�.....");
		
		while(true){
			//Ŭ���̾�Ʈ�� ���� ��û�� ����ϰ� �ִٰ� ���� ��û�� 
			//�����Ǹ� �ش� Ŭ���̾�Ʈ�� ��� �� �� �ִ� ������ ���� ��ȯ�Ѵ�.
			
			Socket socket = server.accept();
			
			//�������κ��� IP�ּҿ� ȣ��Ʈ���� ������ �ִ� InetAddress ��ü ��� 
			InetAddress ip = socket.getInetAddress();
			
			//InetAddress ��ü�� ���� IP�ּ� ���
			String ipAddress = ip.getHostAddress();
			
			System.out.println(ipAddress+"����");
			
			/* Client�� �ۼ��� �� �� �ִ� ����� ���� 
			  MultiServerThread�� �����ϰ� �ִ� clientList��
			  �ش� Ŭ���̾�Ʈ�� ����� Socket��ü�� �����ؼ�
			  MultiServerThread ��ü�� �����Ѵ�.
			 */
			
			MultiServerThread t = new MultiServerThread(clientList,socket);
			
			t.start();
			
			
			//������ MultiServerThread��ü�� clientList�� ������
			clientList.add(t);
			
		}
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		  new MultiServer();
	}
}
