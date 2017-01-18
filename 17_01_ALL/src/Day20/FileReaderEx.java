package Day20;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) {
		
		FileReader reader = null;
		try{
			//파일로부터 한문자 단위로 읽어 올 수 있는 FileReader객체 생성
			reader = new FileReader("c:/비둘기/song.txt");
			
			//스트림을 통해서 읽어들인 값을 저장할 수 있는 변수 선언 및 초기화
			int readValue = 0;
			
			while((readValue = reader.read())!= -1){
				System.out.print((char)readValue);
			}
			
			
			
		}catch(FileNotFoundException fe){
			fe.getMessage();
			
		}catch(IOException ie){
			ie.printStackTrace();
		}
		finally{
			try{
				if(reader!=null)
				{
					reader.close();
				}
			}catch(Exception e){
				e.getMessage();
			}
		}
	}
}
