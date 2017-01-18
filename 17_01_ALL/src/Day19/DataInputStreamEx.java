package Day19;

import java.io.*;

public class DataInputStreamEx {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try{
			fis = new FileInputStream("c:/비둘기/t2.sav");
			dis = new DataInputStream(fis);
			
			//DataInputStream은 기본 자료형을 유지한채로 저장된 
			//값을 읽어 들일 수 있는read()메소드가 존재함
			//읽어 들일때 반드시 기록한 순서대로 읽어드림
			
			int i = dis.readInt();
			double b= dis.readDouble();
			String s= dis.readUTF();
			
			System.out.println("i값:"+i);
			System.out.println("i값:"+b);
			System.out.println("i값:"+s);
			
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
