package Day02;

import java.io.IOException;

public class InputEx2 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		//숫자 하나 입력 받을때
		
		int num1;
		int num2;
		
		System.out.print("첫번째 숫자:");
		num1 = System.in.read()-48;
		System.in.read();
		System.in.read();
		
		System.out.print("두번째 숫자:");
		num2 = System.in.read()-'0';
		
		System.out.println("두 수중 큰 수 :"+(num1>num2?num1:num2)+"가 더 큽니다");
		
		
	}

}
