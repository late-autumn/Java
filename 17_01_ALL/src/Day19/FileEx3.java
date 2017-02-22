package Day19;
import java.io.*;

public class FileEx3 {
public static void main(String[] args)throws IOException {

	//파일과 경로 설정 하는법
	String file_name = "fileIO.txt";
	String file_folder = "c:/비둘기";
	
	
	//파일 생성
	File f1 = new File("c:/비둘기/newFile.txt");
	//빈 파일이 만들어짐
	if(f1.exists()){
		System.out.println("파일의 이름:"+f1.getName());
	}
	else{
		if(f1.createNewFile()){
			System.out.println("새로운 파일 생성");
		}
	}
	//폴더 생성
	
	File f2 = new File("c:/workspace/pk");
	
	if(!f2.exists()){
		f2.mkdirs();
	}
	else{
		System.out.println("폴더 이름:"+f2.getPath());
	}
	
	/*//파일 혹은 폴더 삭제
	
	File f3 = new File("c:/workspace/newFile.txt");
	if(f3.exists()){
		f3.delete();
	}
	File f4 = new File("c:/workspace/pk");
	if(f4.exists()){
		f4.delete();
	}*/
	
	//파일 혹은 폴더 이름 변경
	
	File src = new File("c:/비둘기/newFile.txt");
	//원본 파일
	
	File des = new File("c:/비둘기/dest.txt");
	File des2 = new File("c:/비둘기/dest2.txt");
	
	if(src.exists()){
		des.renameTo(des);
		des.renameTo(des2);
	}
	//폴더 목록의 출력
	if(f2.isDirectory()){
		String dir[] = f2.list();
		for(String sss:dir){
			System.out.println("dir:"+sss);
		}
	}
	
	
	
}
}
