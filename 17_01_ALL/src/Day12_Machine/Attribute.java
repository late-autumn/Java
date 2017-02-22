package Day12_Machine;

public class Attribute {
	
	
	//커피의 이름과 그에 해당하는 가격(price)
	final static String[] coffee = {"아메리카노","카페라떼","초코라떼","카페모카", "에스프레소", "랜덤커피", "취향커피"};
	
	
	//커피가격
	final static int[] price={1500, 2000, 2000, 2500, 1000, 2500, 3000};
	static int[] frequency = {0,0,0,0,0,0,0};
	
	
	//각각의 재료와 수량
	final static String[] material={"물", "원두", "우유", "설탕", "초코", "종이컵"};
	static int[] amount = {100, 100, 100, 100, 100, 10};
	
	
	//각각의 커피 레시피
	static int[][] mat_amou={
			
			{4,1,0,0,0,1},{0,1,3,1,0,1},
			{0,0,3,1,1,1},{2,1,0,1,1,1},{1,2,0,0,0,1}};
	
	
	//돈에 대한 금액과 그에 해당하는 수량
	final static String[] moneyname={"100원","500원","1000원","5000원"};
	static int[][] money = {{100,500,1000,5000},{10,10,10,0}};
	
	
	//자판기가 가지고 있는 총 금액
	static int deposit = 0;
	
	static int money(){
		
		int totmoney = 0;
		for(int i=0;i<money[0].length;i++)
			totmoney += (money[0][i]*money[1][i]);
		
		return totmoney;
		
	}


	
	
	
	
	
	
	
	

}
