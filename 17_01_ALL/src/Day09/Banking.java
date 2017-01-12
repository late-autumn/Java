package Day09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Banking {
public static void main(String[] args)throws IOException {
		Account na = new Account("홍길동");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int input;
		int money;
		String strWork;
		int switchInt = 0;

		do{
			System.out.println("메뉴를 입력해주세요.");
			System.out.println("===============");
			System.out.println("1번 입금");
			System.out.println("2번 출금");
			System.out.println("3번 조회");
			System.out.println("0번 종료");
			System.out.println("===============");
			strWork = br.readLine();
		if(strWork!=null)
		{
			switchInt = Integer.parseInt(strWork);
		}
		else
		{
			System.out.println("작업 내용을 입력하지 않으셨습니다.");
			System.exit(0);
		}
		
		//switch문 시작
		switch(switchInt)
		{
		case 1:
			System.out.println("입금 하실 금액을 입력하세요 :");
			System.out.println("===============");
			money = sc.nextInt();
			na.deposit(money);
			break;
		case 2:
			System.out.println("출금하실 금액을 입력하세요:");
			System.out.println("===============");
			money = sc.nextInt();
			na.withdraw(money);
			break;
		case 3:
			System.out.println("잔액 조회 입니다.");
			System.out.println("===============");
			na.display();
			break;
		case 0:
			System.out.println("종료 서비스 입니다.");
			System.exit(0);
			default:
				System.out.println("잘못 누르셨습니다.0에서 3 사이의 숫자를 눌러주세요");

		}//end switch문
		
		}while(!strWork.equals(0));

		
	
}
}
