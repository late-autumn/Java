package Day18_panmai;

import java.util.*;

public class PanmaiMain {
	
	private Panmai p = new panmaiImpl();
	Scanner sc = new Scanner(System.in);
	
	public void product(){
		//��ǰ ��� ȭ��
		char ch;
		
		while(true){
			
			System.out.println("[��ǰ ��� ȭ��]");
			System.out.println("----------------");
			System.out.println("  1.��ǰ ���");
			System.out.println("  2.���� ���");
			System.out.println("  3.��ǰ ����Ʈ");
			System.out.println("  4.��ǰ�ڵ� �˻�");
			System.out.println("  5.����");
			
			System.out.println("----------------");
			System.out.print("���� ==> ");
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
		//��ǰ �Ǹ� ȭ��
		char ch;
		
		while(true){
			System.out.println("[��ǰ �Ǹ� ȭ��]");
			System.out.println("----------------");
			System.out.println("  1.��ǰ �Ǹ�");
			System.out.println("  2.�Ǹ���Ȳ ����Ʈ");
			System.out.println("  3.�Ǹ���Ȳ �˻�");
			System.out.println("  4.����");
			System.out.println("----------------");
			System.out.print("���� ==> ");
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
			System.out.println("  [���θ޴�]");
			System.out.println("----------------");
			System.out.println("  1.��ǰ���");
			System.out.println("  2.��ǰ�Ǹ�");
			System.out.println("  3.����");
			System.out.println("----------------");
			System.out.print("���� ==> ");
			ch = sc.next().charAt(0);
			switch(ch){
			case '1': pp.product(); break;
			case '2': pp.sale(); break;
			case '3': System.exit(0);		
			
			}//end switch
		}//end while
		
	
	}

}
