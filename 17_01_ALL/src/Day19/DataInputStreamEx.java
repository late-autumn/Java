package Day19;

import java.io.*;

public class DataInputStreamEx {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try{
			fis = new FileInputStream("c:/��ѱ�/t2.sav");
			dis = new DataInputStream(fis);
			
			//DataInputStream�� �⺻ �ڷ����� ������ä�� ����� 
			//���� �о� ���� �� �ִ�read()�޼ҵ尡 ������
			//�о� ���϶� �ݵ�� ����� ������� �о�帲
			
			int i = dis.readInt();
			double b= dis.readDouble();
			String s= dis.readUTF();
			
			System.out.println("i��:"+i);
			System.out.println("i��:"+b);
			System.out.println("i��:"+s);
			
		}catch(FileNotFoundException fe){
			fe.printStackTrace();
		}
		catch(IOException ie){
			ie.printStackTrace();
		}
		finally{
			try{
				if(fis!=null){
					fis.close();
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		try{
			if(dis!=null){
				dis.close();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
		
		
	
}
