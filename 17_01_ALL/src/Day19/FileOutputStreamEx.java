package Day19;

import java.io.*;

public class FileOutputStreamEx {
public static void main(String[] args) {
	
	FileOutputStream fos = null;
	
	try{
		fos = new FileOutputStream("c:\\��ѱ�\\���˳���.txt");
		String message = "���� ���󿡼� ���� �� ������ ";
		
		fos.write(message.getBytes());
		fos.close();
		System.out.println("�̰� �����Ѵ�.");
		
		
	}catch(FileNotFoundException fe){
		fe.getStackTrace();
	}catch(IOException ie){
		ie.getStackTrace();
	}finally{
		try {
			if(fos!= null){
				System.out.println("�ι�°����");
				fos.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
}
}
