package Day12_Machine;

public class OriginalCoffee {
	
	Stock st=new Stock();
	
	/*
	 * menu() : 사용자로부터 돈을 받고 난 뒤 커피 선택권을 주고 사용자가 그만두기 원할때까지 
	 */
	
	void menu(int n){
		
		//사용자가 입력을 정상적으로 했을 경우 계속 반복
		if(n>=1 && n<=5)
			n -= 1; //선택한 번호가 1~5사이라면 in에 1빼서 넣고 반복문을 빠져나감
		if(Attribute.deposit < Attribute.price[n])
		{
			
			System.out.println("금액이 부족합니다.");
			
		}
		else
		{
			//선택된 커피에 해당하는 재료를 소진함
			
			String str=st.drop(n);
			
			if(Stock.a==true)
			{
				//주문에 대한 결과 출력(제품)
				Attribute.deposit -= Attribute.price[n];
				Attribute.frequency[n]++;
				//사용 빈도 수를 늘림
				System.out.print(str);
				
			}
			else
				System.out.print(str);
			System.out.println();
			
		}
	}
}
