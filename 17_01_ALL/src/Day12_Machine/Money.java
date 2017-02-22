package Day12_Machine;

import java.util.Scanner;

import org.w3c.dom.Attr;

//각각의 커피 판매 및 관리자 모드의 입,출금 담당클래스 
public class Money {

	Scanner sc = new Scanner(System.in);
	//각각의 클래스 커피호출
	RandomCoffee cof1 = new RandomCoffee(); 	 
	OriginalCoffee cof2 = new OriginalCoffee();
	TesteCoffee cof3 = new TesteCoffee();
	
	//입금과 출금을 처리하는 메소드 정의
	public void inmoney(){
		
		Admin ad = new Admin();
		
		System.out.print("금액을 넣어 주세요(공백구분):");
		System.out.println("현재 잔액: "+Attribute.deposit);
		
		//최소금액 확인하여 선택 부분 지원
		if(Attribute.deposit<1000)
		{
			System.out.print("100원[1] 500원[2] 1000원[3] 5000원[4] 반환[5]:");
		}
		else{
			System.out.print("100원[1] 500원[2] 1000원[3] 5000원[4] 반환 [5] ★ 선택[6]:");
		}
		int input = sc.nextInt();
		if(input ==1)
		{
		Attribute.deposit += 100;	//현재 금액증가
		Attribute.money[1][0]++;	//머신에 동전 개수 증가
		}
		else if(input ==2)
		{
			Attribute.deposit += 500;
			Attribute.money[1][1]++;
		}
		else if(input ==3)
		{
			Attribute.deposit += 1000;
			Attribute.money[1][2]++;
		}
		else if(input ==4)
		{
			Attribute.deposit += 5000;
			Attribute.money[1][3]++;
		}
		else if(input ==5)
		{
			outmoney();
		}
		else if(input ==6)
		{
			//금액이 부족할 경우 다시 입력 받기
			if(Attribute.deposit<1000)
			{
				System.out.print("금액이 부족합니다.");
			}
			else
			{
				System.out.print("메뉴를 선택하세요:");
				input = sc.nextInt();
				if(input>=1 && input <=5)
					cof2.menu(input);
				else if(input == 6 && Attribute.deposit>=2500)//랜덤 커피
					cof1.menu();
				else if(input == 7 && Attribute.deposit>=3000)//취향 커피
					cof3.menu();
			}
		}
		else if(input ==1234)//관리자 확인
		{
			ad.admin();
		}
		System.out.println();
	}//end inmoney()
	
	public void outmoney()
	{
		boolean flag = true;
		int[] num = new int[4];
		int won = Attribute.deposit;
		
		for(int i =Attribute.money[1].length-1;i>=0;i--)
		{
			if(Attribute.deposit / Attribute.money[0][i] < Attribute.money[1][i]
				&& Attribute.money[1][i] !=0)
			{
				num[i] = Attribute.deposit / Attribute.money[0][i];
				Attribute.deposit -=(num[i]*Attribute.money[0][i]);
			}
			else
			{
				if(i==0)
				{
					Attribute.deposit =0;
					System.out.println("미 처리된 금액 : "+won);
					System.out.println("관리자에게 문의 바랍니다.");
					System.out.println("010-123-1234");
					System.out.println("잔돈 처리가 완료 되었으면 아무키나 누르세요");
					flag = true;
					sc.next();
				}
			}
		}//for문종료 
		
		if(flag)
		{
			Attribute.deposit = 0;
			for(int i=0; i<num.length;i++)
			{
				Attribute.money[1][i]-= num[i];
			}
			System.out.println("잔돈 반환이 완료 되었습니다.[반환금액:"+won+"원");
		}
	}//end outmoney()
	
	
	
}
