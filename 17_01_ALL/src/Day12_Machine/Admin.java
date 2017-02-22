package Day12_Machine;

import java.util.*;

public class Admin {
	
	Scanner sc = new Scanner(System.in);

	public void admin(){
		
		//관리자모드를 종료 시킬 값
		boolean flag = true;
		
		//메뉴 선택할 수 있는 변수
		int in;
		
		//객체 생성

		
		do //관리자모드 반복 수행을 위한 반복문
		{
			
			//현재 재고량, 총금액 및 메뉴안내
			System.out.println();
			System.out.println();
			
			System.out.println("현재 재고량");
			System.out.println("    물    원두    우유    설탕    초코    컵");
			for(int n : Attribute.amount)
				System.out.printf("%8d",n);
			
			System.out.println();
			
			System.out.println("금고 금액:"+Attribute.money());
			System.out.println();
			System.out.println();
			System.out.println("돈 회수(1), 반환금입금(2), 재료채우기(3), 판매량&순위(4), 종료(5)");
			System.out.print("메뉴선택[다른 숫자 입력시 관리자 모드 종료]:");
			in=sc.nextInt();
			
			//메뉴선택을 위한 switch case문 사용
			switch(in)
			{
			
			case 1: outmoney(); break;
			case 2: inmoney(); break;
			case 3: inamount(); break;
			case 4: frequency(); break;
			case 5: exit(); break;
			default: flag=false; break;
		}
		}while(flag);
	}//end admin()
	
	
	//재료 추가를 위한 메서드
	
	public void inamount(){
		

		//재료추가 안내 및 값입력
		System.out.println("추가할 재료를 물, 원두, 우유, 설탕, 초코, 종이컵 수량 순서로 입력[공백구분]");
		
		
		for(int i=0; i<Attribute.amount.length; i++){
			
			Attribute.amount[i]+=sc.nextInt();
			
		}
		//추가 이후 재료 총 개수
		
		for(int i=0; i<Attribute.amount.length; i++){
			
			System.out.println(Attribute.material[i]+":"+Attribute.amount[i]+"개");
			
		}
		
		System.out.println("위와 같이 재료가 추가 와료 되었습니다.");
		System.out.println();
		System.out.println("관리자 메뉴로 이동하려면 아무키나 누르세요!!!");
		sc.next();
		
		
	}//end inamount
	
	
	//입금
	void inmoney(){
		
		//moneyname 클래스 변수 출력 및 안내 문구 출력
		for(String s : Attribute.moneyname){
			System.out.printf("%s",s);
		}
		System.out.print(" 순서대로 반환금 입력[공백 구분]: ");
		
		//각 금액별로 공백구분하여 입력
		for(int i=0; i<Attribute.money[0].length; i++)
		{
			Attribute.money[1][i] += sc.nextInt();
		}	
			System.out.println();
			System.out.println("아래와 같이 반환금을 입력하였습니다.");
			System.out.println();
			
		//현재 각 금액별로 개수
		for(int i=0; i<Attribute.money[0].length; i++)
		{
				
				System.out.printf("%5s:%d2개\n", Attribute.moneyname[i],Attribute.money[1][i]);
				
		}
			
		System.out.println("총액:"+Attribute.money());
		System.out.println();
		System.out.println("관리자 메뉴로 이동하려면 아무키나 누르세요!!!");
		sc.next();
		
		
	}//end inmoney()
	
	
	//출금
	public void outmoney(){

		int mon = Attribute.money();
		
		//현재 각 금액별로 개수 출력 및 각 동전 개수 0대입
		for(int i=0; i<Attribute.money[0].length; i++)
		{
			
			System.out.print(Attribute.moneyname[i]+":"+Attribute.money[1][i]+"개");
			
			if(i != Attribute.money[1].length-1)
				System.out.print(", ");
			Attribute.money[1][i] = 0;
			
		}
		
		System.out.println();
		Attribute.deposit = 0;
	
		//현재 총 금액을 출력하여 환수금 출력
		System.out.println("환수금:"+mon+"입니다.");
		System.out.println();
		System.out.println("관리자 메뉴로 이동하려면 아무키나 누르세요!!!");
		sc.next();
		
	}
	
	
	//판매량과 순위를 구하는 메서드
	void frequency(){
		
		int temp;
		
		//순위를 나타내는 배열
		int[] num = {1,1,1,1,1,1,1};
		
		//각 메뉴들을 순위별로 출력하는 배열
		int[] sort={0,1,2,3,4,5,6};
		
		//각 메뉴의 판매량을 비교하여 자신보다 판매량이 많은 메뉴가 있으면 1씩 순위를 떨어뜨림
		for(int i=0; i<Attribute.frequency.length-1; i++)
		{
			
			for(int j=i; j<Attribute.frequency.length;j++)
			{
				if(Attribute.frequency[i]<Attribute.frequency[j])
					num[i]++;
				else if(Attribute.frequency[i]>Attribute.frequency[j])
					num[j]++;
				
			}
			
		}
		
		//순위변수 기준으로 num변수와 sort변수를 오름차순으로 정렬
		
		for(int i=0; i<num.length-1; i++){
			
			for(int j=i; j<num.length; j++){
				
				if(num[i]>num[j])
				{
					
					temp = num[i];
					num[i]=num[j];
					num[j]=temp;
					
					temp=sort[i];
					sort[i]=sort[j];
					sort[j]=temp;
					
				}
				
			}
			
		}
		
		//각 메뉴를 출력 순위대로 (i의 순서가 아닌 sort[i] 순서대로 출력)
		System.out.println("메뉴별 순위");
		System.out.println("    메뉴     판매량     순위");
		
		for(int i=0; i<Attribute.frequency.length;i++)
		{
			
			if(sort[i]!=0 && sort[i] != 4)
				System.out.println("   ");
			System.out.printf("");
			System.out.printf("%5s%8d%6d위\n",Attribute.coffee[sort[i]],Attribute.frequency[sort[i]],num[i]);
			
		}
		
		System.out.println();
		
	}
	
	
	
	
	
	
	//금액 관련 메서드 inmoney outmoney
	void exit(){
		
		
		System.out.println("(((((   판매끝   )))))");
		System.exit(0);
		
		
	}
	
	
	
	
	
	

}
