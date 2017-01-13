package Day17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Calculate {
	Scanner sc = new Scanner(System.in);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int input1, input2;
	char input4;
	int result = 0;

	public void input(){
		try{

		System.out.println("첫번째 정수를 입력하세요 :");
		input1 = sc.nextInt();
		System.out.println("두번째 정수를 입력하세요 :");
		input2 = sc.nextInt();
		System.out.println("원하는 사칙 연산을 눌러주세요: [+]  [-]  [*]  [/]  [0] 종료");
		input4 = (char)br.read();
		cal();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	public void cal() {

		switch (input4) {
		case '+':
			result = input1 + input2;
			print();
			break;
		case '-':
			result = input1 - input2;
			print();
			break;
		case '*':
			result = input1 * input2;
			print();
			break;
		case '/':
			result = input1 / input2;
			print();
			break;
		case 0:
			System.out.println("시스템을 종료합니다.");
			System.exit(0);
			break;
		}


	}

	public void print() {
		System.out.println("결과는 :" + result + "입니다");
	}

}
