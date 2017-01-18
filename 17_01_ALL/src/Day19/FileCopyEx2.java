package Day19;

import java.io.*;
public class FileCopyEx2 {


	//byte[] �� �̿��ؼ� ���� 
	public static void main(String[] args) {
		System.out.println("���Ϻ��� ����");
		
		long start = System.currentTimeMillis();
		//�ý��ۿ��� �����ϴ� ���� �ð�
		
		FileInputStream src = null;		//���� ����
		
		FileOutputStream dest = null;	//����� ����
		

		try{

			//���������� �б����� FileInputStream ��ü ����
			src = new FileInputStream(new File("c:/��ѱ�/win.zip"));
			
			//���纻 ������ �����ϱ����� fileoutputsteam ��ü ����
			dest = new FileOutputStream(new File("c:/��ѱ�/win_dest.zip"));
	
			//�ӽ�����ҿ� ����� data�� ��ü ������ ������ ���� ����
			int length = 0;
			
			//�ӽ� ����ҷ� ���� byte[] �迭 ����
			byte[] buffer = new byte [1024*8];	//�迭�� ũ��� 8byte
			
			//�迭�� ũ��� 8Kbyte
			
			//inputStream�� ���ؼ� �о���� data�� �ӽ�����ҿ� 
			//�׾� �����ϰ� ����� data�� ������ length�� ������
			
			while((length = src.read(buffer))!= -1)
			{
				//OutputStream�� ���ؼ� �ӽ�����ҿ� �׿��ִ� Data�� length ��ŭ ���Ͽ� �����
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
		System.out.println("�����ϴµ� �ɸ��ð�:"+copyTime+"��");
		
	}
}
