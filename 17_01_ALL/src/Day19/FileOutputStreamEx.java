package Day19;

import java.io.*;

public class FileOutputStreamEx {
public static void main(String[] args) {
	
	FileOutputStream fos = null;
	
	try{
		fos = new FileOutputStream("c:\\비둘기\\조팝나무.txt");
		String message = "나는 세상에서 가장 쎈 나무야 ";
		
		fos.write(message.getBytes());
		fos.close();
		System.out.println("이거 실행한다.");
		
		
	}catch(FileNotFoundException fe){
		fe.getStackTrace();
	}catch(IOException ie){
		ie.getStackTrace();
	}finally{
		try {
			if(fos!= null){
				System.out.println("두번째꺼야");
				fos.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
}
}
