package Day12_Machine;

public class TesteCoffee {

	Stock st = new Stock();
	
	void menu(){
		
		//stocktest() 메소드를 통해 재료의 재고를 확인하고 
		//재고에 따라 if문 실행
		if(st.stockTest()){
			//재고가 있다면 choice()메소드를 이용하여 취향 커피 실행
			st.choice();
			
			//커피 선택이 끝나면 가격을 빼고 카운터를 셈
			Attribute.deposit -= Attribute.price[6];
			System.out.println("주문하신 커피가 나왔습니다.");
			System.out.println();
			Attribute.frequency[6]++;			
		}
		else{
			//재고가 없다면 choice메소드를 실행하지 않는다.
			System.out.println("죄송합니다. 재고가 없습니다. 관리자에게 문의하세요");
			System.out.println();
		}
	}
	
}
