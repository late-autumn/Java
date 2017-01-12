package Day02;
//문자열 입력받기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class InputEx3 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		String name;
		String age;
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		//또 다른 입력법 스캐너
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력:");
		name = br.readLine();
		System.out.print("나이 입력 :");
		age = br.readLine();
		
		System.out.println("이름은 "+name+"입니다. 나이는 "+age+"살 입니다.");
	
	}

}
