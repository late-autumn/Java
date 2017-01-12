package Day05;

import java.util.Scanner;
public class Exam05 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int menu;
	int InputNum, Result=0;
	int StartNum=1;
	
	do{
		//메뉴 구성
		System.out.println("1.정수의 합");
		System.out.println("2.짝수의 합");
		System.out.println("3.홀수의 합");
		System.out.println("4.종 료");
		System.out.print("선택==>");
		menu = sc.nextInt();
		System.out.println();
		if(menu==4)System.exit(0);
	}
	while(menu<1||menu>4);

	do{
		System.out.println("원하는 수 입력하세요:");
		InputNum = sc.nextInt();
	}while(InputNum<1||InputNum>1000);
	
	//메뉴 처리하는 부분, 조건문 사용 
		if(menu ==1){
			for(int i=1;i<=InputNum;i++)
			{
				Result += i;
			}
			System.out.println("1번 합계 출력:"+Result);
		}
		else if(menu ==2)
		{
			for(int i=2;i<=InputNum;i+=2)
			{
				Result+=i;
			}
			System.out.println("2번 짝수 합계 출력:"+Result);
		}
			
		else if(menu==3)
		{
			for(int i=1;i<=InputNum;i+=2)
			{
				Result +=i;
			}
			System.out.println("3번 홀수 합계 출력:"+Result);
		}



	
			
		
	

 }
}
