package NT_Day3;
//����ڰ� �Է��� �޼����� ������ �����Ѵ�.
//���� ��Ʈ��ȣ : 3000

import java.io.*;
import java.net.*;

public class MultiClient {


	private Socket socket;				//������ ����� Socket 
	
	private BufferedReader in;			//������ ���� �޼����� �о���� ��Ʈ��
	
	private PrintWriter out;			//������ �޼����� ������ ��Ʈ��
	
	private BufferedReader keyboard;	//Ű����� �Է³����� �о���� ��Ʈ��
	
	
	public MultiClient() {

		try{
			socket = new Socket("localhost", 3000);
			System.out.println("Server Connection Success.....");
			
	         //��Ʈ������
	         keyboard = new BufferedReader(new InputStreamReader(System.in));
	         out = new PrintWriter(socket.getOutputStream(), true);
	         in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			//������ ������ �޼����� �о���� �б����� Thread ���� 
			//MultiSeverThread �����ÿ� ������ �����ϴ� �޼����� �о���� �� �ִ� ��Ʈ���� ���� 

	         MultiClientThread t = new MultiClientThread(in);
	         t.start();
	         //Ű����� �Է��� ������ �о�ͼ� ������ ����
	         while(true)
	         {
	            String text = keyboard.readLine();
	            out.println(text);
	         }
	         
	      }catch(UnknownHostException e){
	         e.printStackTrace();
	      }catch(IOException io){
	         io.printStackTrace();
	      }
	      
	   }

	   public static void main(String[] args) {
	      // TODO Auto-generated method stub
		   

		   new MultiClient();

	   }
}