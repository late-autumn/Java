package Day12_Machine;


//메뉴를 선택할 수 있는 클래스
public class Menu {
	
	Money mon = new Money(); //Money 객체(인스턴스) 생성
	
	void Menu(){
	//메뉴의 생성자 함수 이용
		
		char valid = 'x'; 	//제품출력 상태를 알리는 변수

		do
		{
			//자판기의 기본모양
			System.out.println("==============================");
			System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥♥♥MENU♥♥♥♥♥♥♥♥♥♥♥♥");
			System.out.println("==============================");

			System.out.println("ㅣ      <메뉴>\t\t  <가격>  <가능>    ㅣ");
			
			for(int i=0; i<Attribute.coffee.length;i++){
				
				//입금금액에 커피 구매가 가능한지 확인
				if(Attribute.deposit >= Attribute.price[i])
					valid = 'o';
				else
					valid = 'x';
				
			System.out.printf("ㅣ   %6s[%d]\t%5d원\t\b\b(%c)\t    ㅣ\n",Attribute.coffee[i],(i+1),Attribute.price[i],valid);
				
			}
			
			
			System.out.println();
			
			mon.inmoney();
			
		}while(true);
		
		
		
		
	}
	

}
