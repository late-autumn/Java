package Day19;

import java.io.*;

public class FileEx2 {
public static void main(String[] args) {
	
	File dire = new File("C:/");
	
	if(dire.exists()){
		if(dire.isDirectory()){
			//���� �������� ��� ���� ���� �̸� ���
			String[] file_name = dire.list();
			
			for(String ss: file_name){
				System.out.println("���� �̸�:"+ss);
			}
		}
	}
	
}
}
