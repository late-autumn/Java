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
			//���Ͽ� ����� ��ü�� �о� ���� ���� 
			//ObjectInputStream ��ü ����
			ois = new ObjectInputStream(new FileInputStream("c:/��ѱ�/obj.sav"));
			
			//ObjectInputStream�� ��Ʈ������ ���� 
			//�о���� ����ȭ�� ��ü�� �� ����ȭ�ؼ� ��ü�� ������ �� �ִ�.
			//�� ����ȭ �Ҷ� �ʿ��� Ŭ���� ���� ã�� ���ϴ� ��찡 �ִ�.
			Data data = (Data)ois.readObject();
			System.out.println("��ȣ:"+data.getNo());
			System.out.println("�̸�:"+data.getName());
			System.out.println("�̸���:"+data.getEmail());
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
