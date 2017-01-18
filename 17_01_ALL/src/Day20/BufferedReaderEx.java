package Day20;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.*;
public class BufferedReaderEx {

	
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		InputStreamReader ist = null;
		BufferedReader br = null;
		
		try{
			
			fis =new FileInputStream("c:/비둘기/hello.txt");
			ist = new InputStreamReader(fis);
			br = new BufferedReader(ist);
			//한 라인씩 읽어들인 문자열을 저장할 변수 선언
			
		String str = null;
			//readline() 개행문자를 만나면 개행 문자 이전까지의 문자열을 반환하고 
			//스트림의 끝에 도달하면 null을 반환함
		while((str=br.readLine())!=null){
			
			System.out.println(str);
		}
		}catch(FileNotFoundException fe){
			fe.printStackTrace();
		}catch(IOException ie){
			ie.printStackTrace();
		}
		finally{
			try{
			if(br != null) br.close();
			}catch(Exception e){
				e.printStackTrace();
			}
			try{
			if(ist != null) ist.close();
			}catch(Exception e){
				e.printStackTrace();
			}
			try{
			if(fis != null) fis.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
	}
}
