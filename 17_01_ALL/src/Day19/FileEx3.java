package Day19;
import java.io.*;

public class FileEx3 {
public static void main(String[] args)throws IOException {

	//���ϰ� ��� ���� �ϴ¹�
	String file_name = "fileIO.txt";
	String file_folder = "c:/��ѱ�";
	
	
	//���� ����
	File f1 = new File("c:/��ѱ�/newFile.txt");
	//�� ������ �������
	if(f1.exists()){
		System.out.println("������ �̸�:"+f1.getName());
	}
	else{
		if(f1.createNewFile()){
			System.out.println("���ο� ���� ����");
		}
	}
	//���� ����
	
	File f2 = new File("c:/workspace/pk");
	
	if(!f2.exists()){
		f2.mkdirs();
	}
	else{
		System.out.println("���� �̸�:"+f2.getPath());
	}
	
	/*//���� Ȥ�� ���� ����
	
	File f3 = new File("c:/workspace/newFile.txt");
	if(f3.exists()){
		f3.delete();
	}
	File f4 = new File("c:/workspace/pk");
	if(f4.exists()){
		f4.delete();
	}*/
	
	//���� Ȥ�� ���� �̸� ����
	
	File src = new File("c:/��ѱ�/newFile.txt");
	//���� ����
	
	File des = new File("c:/��ѱ�/dest.txt");
	File des2 = new File("c:/��ѱ�/dest2.txt");
	
	if(src.exists()){
		des.renameTo(des);
		des.renameTo(des2);
	}
	//���� ����� ���
	if(f2.isDirectory()){
		String dir[] = f2.list();
		for(String sss:dir){
			System.out.println("dir:"+sss);
		}
	}
	
	
	
}
}
