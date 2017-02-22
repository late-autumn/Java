package Day19;

import java.io.*;
public class FileCopyEx2 {


	//byte[] 을 이용해서 복사 
	public static void main(String[] args) {
		System.out.println("파일복사 시작");
		
		long start = System.currentTimeMillis();
		//시스템에서 제공하는 현재 시각
		
		FileInputStream src = null;		//파일 원본
		
		FileOutputStream dest = null;	//복사된 파일
		

		try{

			//원본파일을 읽기위한 FileInputStream 객체 생성
			src = new FileInputStream(new File("c:/비둘기/win.zip"));
			
			//복사본 파일을 생성하기위한 fileoutputsteam 객체 생성
			dest = new FileOutputStream(new File("c:/비둘기/win_dest.zip"));
	
			//임시저장소에 저장된 data의 전체 개수를 저장할 변수 선언
			int length = 0;
			
			//임시 저장소로 사용될 byte[] 배열 선언
			byte[] buffer = new byte [1024*8];	//배열의 크기는 8byte
			
			//배열의 크기는 8Kbyte
			
			//inputStream을 통해서 읽어들인 data를 임시저장소에 
			//쌓아 저장하고 저장된 data의 개수를 length에 저장함
			
			while((length = src.read(buffer))!= -1)
			{
				//OutputStream을 통해서 임시저장소에 쌓여있는 Data를 length 만큼 파일에 기록함
				dest.write(buffer, 0, length);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(dest!=null){
					dest.close();
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		long end = System.currentTimeMillis();
		long copyTime = (end - start)/1000;
		System.out.println("복사하는데 걸린시간:"+copyTime+"초");
		
	}
}
