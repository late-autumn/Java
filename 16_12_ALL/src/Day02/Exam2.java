package Day02;

import java.io.IOException;

public class Exam2 {
	public static void main(String[] args)throws IOException {
		
		System.out.println("산술 연산자를 입력하세요('+','-','*','/','%'):");
		char Input = (char)System.in.read();
		System.out.println(Input =='+' || Input == '-' || Input == '*' || Input == '/' || Input =='%' ?
				"'"+Input+"'는 산술 연산자입니다." : "'" +Input+"'는 산술 연산자가 아닙니다");
	}
}
