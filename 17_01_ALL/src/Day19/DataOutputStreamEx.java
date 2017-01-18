package Day19;

import java.io.*;

public class DataOutputStreamEx {
	public static void main(String[] args) {
		
	
	/*/
	 * DataOutputStream�� �⺻ �ڷ��� Ÿ�� �״�� ��Ʈ���� ���ؼ� ��� �� �� �ִ�.
	 * DataOutputStream�� 1�� ��Ʈ���� �ƴϱ� �빮�� �ٸ� ��Ʈ���� �̿��ؼ�
	 * Ư�� ����̽��� ������ �� ����.
	 */
		
		DataOutputStream dos = null;
		FileOutputStream fos = null;
	
	try {
		//DataOutputStream�� ������ FileOutputStream��ü ����
		fos = new FileOutputStream("c:/��ѱ�/t2.sav");
		//�⺻ �ڷ��� Ÿ���� ������ä ��� �� �� �ִ� DataOutputStream��ü ����
		dos = new DataOutputStream(fos);
		
		int i =10;
		double d = 3.14;
		String s = "�ȳ���~ �� ���ؿ�";
		
		//DataOutputStream�� �⺻�ڷ��� ���� write()�޼ҵ尡 ������
		
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
