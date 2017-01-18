package Day20;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
public class ObjectInputStreamEx {

	public static void main(String[] args) {
		
		ObjectInputStream ois = null;
		
		try{
			//파일에 저장된 객체를 읽어 오기 위해 
			//ObjectInputStream 객체 생성
			ois = new ObjectInputStream(new FileInputStream("c:/비둘기/obj.sav"));
			
			//ObjectInputStream은 스트림으로 부터 
			//읽어들인 직렬화된 객체를 역 직렬화해서 객체를 생성할 수 있다.
			//역 직렬화 할때 필요한 클래스 파일 찾지 못하는 경우가 있다.
			Data data = (Data)ois.readObject();
			System.out.println("번호:"+data.getNo());
			System.out.println("이름:"+data.getName());
			System.out.println("이메일:"+data.getEmail());
		}catch(ClassNotFoundException ce){
			ce.getMessage();
		}catch(FileNotFoundException fe){
			fe.getStackTrace();
		}catch(IOException ie){
			ie.getMessage();
		}
		finally{
			try{
				if(ois!=null) ois.close();
			}catch(Exception e){
				e.getMessage();
			}
		}
		
		
		
	}
}
