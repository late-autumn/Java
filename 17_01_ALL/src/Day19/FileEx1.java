package Day19;
import java.io.File;


public class FileEx1 {
public static void main(String[] args) {
	
	File f = new File("c:/workspace/aa.txt");
	System.out.println("��������:"+f.isFile());
	System.out.println("���丮����:"+f.isDirectory());
	System.out.println("�����:"+f.getPath());
	System.out.println("������:"+f.getAbsolutePath());

	System.out.println("������ �̸�:"+f.getName());
	System.out.println("������ ����:"+f.length());
	
	System.out.println("���� ���� ���� ��¥:"+f.lastModified());
	
	
	
}
}
