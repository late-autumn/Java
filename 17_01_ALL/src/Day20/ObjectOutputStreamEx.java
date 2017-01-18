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
			
			//�޸𸮿� ������ ��ü�� ����ȭ �ؼ� ��Ʈ���� ����
			//����� �� �ִ� ObjectOutputStream ��ü ����
			
			oos = new ObjectOutputStream(new FileOutputStream("c:/��ѱ�/obj.sav"));
			
			//ObjcetOutputStream�� ���ؼ� ����ȭ�� ���Ϸ� ����� Data ��ü ����
			//DataŬ������ �ݵ�� Serializable�� �����Ǿ� �־����
			Data data = new Data();
			data.setNo(33);
			data.setName("ȫ�浿");
			data.setEmail("hong@naver.com");
			
			//ObjectOutputStream�� ��ü�� ����ȭ �ؼ� ��Ʈ���� ����
			//���� �� �� �ִ� writeObject�޼ҵ带 Ȱ���Ѵ�.
			
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
