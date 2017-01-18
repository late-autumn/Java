package Day19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyEx1 {
	
	//byte 을 이용해서 복사 
	public static void main(String[] args) {
		System.out.println("파일복사 시작");
		
		long start = System.currentTimeMillis();
		//시스템에서 제공하는 현재 시각
		
		FileInputStream src = null;		//파일 원본
		
		FileOutputStream dest = null;	//복사된 파일
		
		try{
			//원본파일을 읽기위한 FileInputStream 객체 생성
			src = new FileInputStream(new File("c:/비둘기/src.zip"));
			
			//복사본 파일을 생성하기위한 fileoutputsteam 객체 생성
			dest = new FileOutputStream(new File("c:/비둘기/dest.zip"));
			
			//FileinputStream을 통해서 읽어들인 값을 저장할 변수 선언
			int readValue = 0;
			
			//FileInputStream의 read()메소드를 통해서 읽어들인 값을 readValue변수에 저장
			while((readValue=src.read())!=-1){
				
				//readValue에 저장된값을 FileOutputStream의 write()메소드를 통해서 파일에기록
				dest.write(readValue);
				
				
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
