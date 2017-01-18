package Day19;

import java.io.*;

public class DataOutputStreamEx {
	public static void main(String[] args) {
		
	
	/*/
	 * DataOutputStream은 기본 자료형 타입 그대로 스트림을 통해서 기록 할 수 있다.
	 * DataOutputStream은 1차 스트림이 아니기 대문에 다른 스트림을 이용해서
	 * 특정 디바이스와 연결할 수 있음.
	 */
		
		DataOutputStream dos = null;
		FileOutputStream fos = null;
	
	try {
		//DataOutputStream과 연결할 FileOutputStream객체 생성
		fos = new FileOutputStream("c:/비둘기/t2.sav");
		//기본 자료형 타입을 유지한채 기록 할 수 있는 DataOutputStream객체 생성
		dos = new DataOutputStream(fos);
		
		int i =10;
		double d = 3.14;
		String s = "안녕히~ 또 오해영";
		
		//DataOutputStream은 기본자료형 별로 write()메소드가 존재함
		
		dos.writeInt(i);
		dos.writeDouble(d);
		dos.writeUTF(s);

		
		
	}catch(FileNotFoundException fe){
			fe.printStackTrace();
		}
		catch(IOException ie){
			ie.printStackTrace();
		}
		finally{
			try{
				if(fos!=null){
					fos.close();
				}
			}catch(Exception e){
				e.printStackTrace();
			}
			try{
				if(dos!=null){
					dos.close();
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	
	
	}	
}
