package Day20;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {
		
		
		Scanner scan = null;
		try{
			//��ĳ�� ��ü�� ����
			scan = new Scanner(new File("c:/��ѱ�/song.txt"));
			
			while(scan.hasNext()){
				System.out.printf("��ĵ:%s \n",scan.next());
			}
			scan.close();
		}catch(FileNotFoundException fe)
		{
			fe.getMessage();
		}catch(IOException ie){
			ie.getMessage();
		}finally{
			try{
				if(scan!=null) scan.close();
			}
			catch(Exception e){ e.getMessage();
			}
			}
		}	

}
