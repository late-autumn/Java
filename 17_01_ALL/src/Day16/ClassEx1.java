package Day16;

import java.util.Scanner;

//클래스와 인스턴스

//사각형 클래스 설계
/*
 * 사각형의 넓이와 둘레 계산 클래스로 표현
 * 클래스 : 사각형
 * 클래스의 속성 : 가로, 세로, (넓이, 둘레, 무게, 색깔, 재질...)
 * 클래스의 기능 : 넓이 계산 , 둘레계산, 가로/세로입력 결과 출력
 * 
 * 객체의 구성 : 데이터(속성,상태)+기능(행위)
 * 클래스의 구성 : 멤버필드(변수) + 메소드
 * 
 */

public class ClassEx1 {
	Scanner sc = new Scanner(System.in);

	int x,y , input;
	

	void menu()
	{
		do{
		System.out.println("가로 값을 입력하세요 :");
		x = sc.nextInt();
		System.out.println("세로 값을 입력하세요:");
		y = sc.nextInt();
		System.out.println("원하시는 계산 종류를 입력하세요: [1] 넓이계산 [2] 둘레계산 [3]가로/세로 입력 결과 출력");
		input = sc.nextInt();
		switch(input)
		{
		case 1:
			cal(x,y);
			break;
		case 2:
			cal2(x,y);
			break;
		case 3:
			System.out.println("가로/세로 입력 결과입니다."+x+","+y);
			
			break;
			
		}
		}while(true);
		
	}
	void cal(int a, int b)
	{
		int sum = a*b;
		System.out.println("넓이 ="+sum);
	}
	void cal2(int a, int b)
	{
		int sum = (a+b)*2;
		System.out.println("둘레 ="+sum);
	}
	
	
	
	public static void main(String[] args) {
		ClassEx1 ex = new ClassEx1();
		ex.menu();
		
		
	}

}
