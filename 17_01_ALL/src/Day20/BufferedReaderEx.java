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
			
			fis =new FileInputStream("c:/��ѱ�/hello.txt");
			ist = new InputStreamReader(fis);
			br = new BufferedReader(ist);
			//�� ���ξ� �о���� ���ڿ��� ������ ���� ����
			
		String str = null;
			//readline() ���๮�ڸ� ������ ���� ���� ���������� ���ڿ��� ��ȯ�ϰ� 
			//��Ʈ���� ���� �����ϸ� null�� ��ȯ��
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
