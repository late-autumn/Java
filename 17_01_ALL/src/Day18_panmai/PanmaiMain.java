package Day18_panmai;

import java.util.*;

public class PanmaiMain {
	
	private Panmai p = new panmaiImpl();
	Scanner sc = new Scanner(System.in);
	
	public void product(){
		//상품 등록 화면
		char ch;
		
		while(true){
			
			System.out.println("[상품 등록 화면]");
			System.out.println("----------------");
			System.out.println("  1.상품 등록");
			System.out.println("  2.수량 등록");
			System.out.println("  3.상품 리스트");
			System.out.println("  4.상품코드 검색");
			System.out.println("  5.복귀");
			
			System.out.println("----------------");
			System.out.print("선택 ==> ");
			ch = sc.next().charAt(0);
		
			switch(ch)
			{ 
			case '1': p.insertProduct(); break;
			case '2': p.insertQuantity(); break;
			case '3': p.listProduct(); break;
			case '4': p.searchProduct(); break;
			case '5': System.out.println(); return;
				
			}//end switch
			
		}//end while		
		
	}//end method
	
	public void sale(){
		//상품 판매 화면
		char ch;
		
		while(true){
			System.out.println("[상품 판매 화면]");
			System.out.println("----------------");
			System.out.println("  1.상품 판매");
			System.out.println("  2.판매현황 리스트");
			System.out.println("  3.판매현황 검색");
			System.out.println("  4.복귀");
			System.out.println("----------------");
			System.out.print("선택 ==> ");
			ch = sc.next().charAt(0);
			switch(ch)
			{
			case '1': p.insertSale(); break;
			case '2': p.listSale(); break;
			case '3': p.searchProduct(); break;
			case '4': System.out.println(); return;
			}//end switch
			
		}//end while
		
	}//end method
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch;
		PanmaiMain pp = new PanmaiMain();
		while(true){
			System.out.println("  [메인메뉴]");
			System.out.println("----------------");
			System.out.println("  1.상품등록");
			System.out.println("  2.상품판매");
			System.out.println("  3.종료");
			System.out.println("----------------");
			System.out.print("선택 ==> ");
			ch = sc.next().charAt(0);
			switch(ch){
			case '1': pp.product(); break;
			case '2': pp.sale(); break;
			case '3': System.exit(0);		
			
			}//end switch
		}//end while
		
	
	}

}
