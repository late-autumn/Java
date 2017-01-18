package Day20;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) {
		
		FileReader reader = null;
		try{
			//���Ϸκ��� �ѹ��� ������ �о� �� �� �ִ� FileReader��ü ����
			reader = new FileReader("c:/��ѱ�/song.txt");
			
			//��Ʈ���� ���ؼ� �о���� ���� ������ �� �ִ� ���� ���� �� �ʱ�ȭ
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
