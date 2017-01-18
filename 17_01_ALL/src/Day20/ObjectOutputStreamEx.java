package Day20;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class ObjectOutputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ObjectOutputStream oos = null;
		try{
			
			//메모리에 생성된 객체를 직렬화 해서 스트림을 통해
			//기록할 수 있는 ObjectOutputStream 객체 생성
			
			oos = new ObjectOutputStream(new FileOutputStream("c:/비둘기/obj.sav"));
			
			//ObjcetOutputStream을 통해서 직렬화된 파일로 저장될 Data 객체 생성
			//Data클래스는 반드시 Serializable로 구현되어 있어야함
			Data data = new Data();
			data.setNo(33);
			data.setName("홍길동");
			data.setEmail("hong@naver.com");
			
			//ObjectOutputStream을 객체를 직렬화 해서 스트림을 통해
			//저장 할 수 있는 writeObject메소드를 활용한다.
			
			oos.writeObject(data);
			
			
		}catch(FileNotFoundException fe){
			fe.printStackTrace();
		}catch(IOException io){
			io.printStackTrace();
		}
		finally{
			try{
				if(oos !=null) oos.close(); 
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
	}

}
