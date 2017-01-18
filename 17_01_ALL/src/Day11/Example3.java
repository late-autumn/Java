package Day11;

import java.util.Scanner;

public class Example3 {
	
	Scanner sc = new Scanner(System.in);
	int InputNum = 0 ;
	int InputNum2 = 0;
	int result = 0;
	char CAL ;
	void input()
	{
		System.out.println("첫번째 정수와 두번째 정수를 입력하세요:");
		InputNum = sc.nextInt();
		InputNum2 = sc.nextInt();
		System.out.print("원하는 사칙 연산을 입력하세요:");
		CAL = sc.next().charAt(0);
	}
	
	void cal()
	{
		switch(CAL)
		{
		case '+':
			result = InputNum+InputNum2;
			System.out.println("덧셈을 하였습니다");
			break;
		case '-':
			result = InputNum-InputNum2;
			System.out.println("뺄셈을 하였습니다");
			break;
		case '*':
			result = InputNum*InputNum2;
			System.out.println("곱셈을 하였습니다");
			break;
		case '/':
			result = InputNum/InputNum2;
			System.out.println("나눗셈을 하였습니다");
			break;
			default:
				System.out.println("입력 오류");
		}
	}
	void print()
	{
		System.out.println("결과는 :"+result);
	}
	
}
