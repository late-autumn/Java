package Day19;
import java.io.File;


public class FileEx1 {
public static void main(String[] args) {
	
	File f = new File("c:/workspace/aa.txt");
	System.out.println("파일인지:"+f.isFile());
	System.out.println("디렉토리인지:"+f.isDirectory());
	System.out.println("상대경로:"+f.getPath());
	System.out.println("절대경로:"+f.getAbsolutePath());

	System.out.println("파일의 이름:"+f.getName());
	System.out.println("파일의 길이:"+f.length());
	
	System.out.println("파일 최종 수정 날짜:"+f.lastModified());
	
	
	
}
}
