package Day12_Machine;

import java.util.*;

//재고 관리를 해주는 클래스
public class Stock {
	
	Scanner sc=new Scanner(System.in);
	static boolean a;
	
	//재료당 최대 2개씩 이용할 수 있는 취향 커피의 재고를 확인하는 메서드
	
	boolean stockTest(){
		
		a=true;
		
		for(int i=0; i<5; i++){
			
			a = Attribute.amount[i] >= 2;
			if(a == false)
				return a;

		}
		
		return a;
	}
	
	
	// 재료가 정해져 있는 오리지날 랜덤커피의 재고를 확인하는 메서드
	// 매개변수 in은 커피의 번호
	
	boolean stockTest(int in){
		
		for(int i=0; i<Attribute.mat_amou[in].length; i++){
			
			if(Attribute.amount[i]>=Attribute.mat_amou[in][i])
				a=true;
			else{
				a=false;
				return a;
			}
			
		}
	
		return a;	
		
		}
		
	//drop을 할때 stockTest 메서드를 통해 재고를 확인하고
	//재고가 있을때와 없을때의 리턴을 다르게함
		
	String drop(int in){
		
		 if(stockTest(in)==false)
			 return "죄송합니다. 재료가 없습니다. 관리자에게 문의 바람!!!";
		 
		 else
		 {
			 
			 for(int i=0; i<Attribute.mat_amou[in].length; i++)
				 Attribute.amount[i] -= Attribute.mat_amou[in][i];
			 
		 }
		 
		 return Attribute.coffee[in]+"커피가 나왔어요 맛있게 드세요^^";
		
	}
	
	
	void choice(){
		
		int[] sel = {0,0,0,0,0,1};
		System.out.println("각 재료는 2개까지 가능합니다.");
		
		for(int i=0; i<Attribute.amount.length-1; i++)
		{
			
			System.out.printf("%s:",Attribute.material[i]);
			sel[i]=sc.nextInt();
			
			if(sel[i]>2)
			{
				
				System.out.println(Attribute.material[i]+"재료가 2개 넘습니다.");
				System.out.println("다시 선택하세요 !!");
				System.out.println();
				
				i--;
				continue;
				
			}else
			{
				
				Attribute.amount[i] -= sel[i];
				
			}
			
			Attribute.amount[5] -= sel[5];
			
		}
		
		
		
	}
	
		
	}
	
	
	
	
	
	
	
	


