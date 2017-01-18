package Day19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyEx1 {
	
	//byte �� �̿��ؼ� ���� 
	public static void main(String[] args) {
		System.out.println("���Ϻ��� ����");
		
		long start = System.currentTimeMillis();
		//�ý��ۿ��� �����ϴ� ���� �ð�
		
		FileInputStream src = null;		//���� ����
		
		FileOutputStream dest = null;	//����� ����
		
		try{
			//���������� �б����� FileInputStream ��ü ����
			src = new FileInputStream(new File("c:/��ѱ�/src.zip"));
			
			//���纻 ������ �����ϱ����� fileoutputsteam ��ü ����
			dest = new FileOutputStream(new File("c:/��ѱ�/dest.zip"));
			
			//FileinputStream�� ���ؼ� �о���� ���� ������ ���� ����
			int readValue = 0;
			
			//FileInputStream�� read()�޼ҵ带 ���ؼ� �о���� ���� readValue������ ����
			while((readValue=src.read())!=-1){
				
				//readValue�� ����Ȱ��� FileOutputStream�� write()�޼ҵ带 ���ؼ� ���Ͽ����
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
		System.out.println("�����ϴµ� �ɸ��ð�:"+copyTime+"��");
		
	}

}
