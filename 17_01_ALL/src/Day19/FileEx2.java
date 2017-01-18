package Day19;

import java.io.*;

public class FileEx2 {
public static void main(String[] args) {
	
	File dire = new File("C:/");
	
	if(dire.exists()){
		if(dire.isDirectory()){
			//현재 폴더내의 모든 파일 폴더 이름 얻기
			String[] file_name = dire.list();
			
			for(String ss: file_name){
				System.out.println("파일 이름:"+ss);
			}
		}
	}
	
}
}
