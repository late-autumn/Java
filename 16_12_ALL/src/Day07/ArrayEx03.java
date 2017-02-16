package Day07;
import java.util.Scanner;
public class ArrayEx03 {
public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int input ;
	do{
		System.out.print("메뉴를 입력해주세요:");
		System.out.print("콜라-1, 사이다-2, 마운틴듀-3, 초코송이-4, 에이스-5, 웨하스-6(0 종료)");
		input = sc.nextInt();
		
		switch(input)
		{
		case 0:
			System.exit(0);
			break;
		case 1:
			System.out.print("콜라");
			break;
		case 2:
			System.out.print("사이다");
			break;
		case 3:
			System.out.print("마운틴듀");
			break;
		case 4:
			System.out.print("초코송이");
			break;
		case 5:
			System.out.print("에이스");
			break;
		case 6:
			System.out.print("웨하스");
			break;
			default:
				System.out.print("선택하신 상품이 없습니다.");
		}
		System.out.println();
		
	}while(input!=0);
	
}
}
