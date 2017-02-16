package Day03;
/*
문제 1)
사용자로부터 임의의 정수를 입력받아 사칙연산 및 나머지 연산을 구하는 프로그램을 구현하시오

실행예) 
   첫번째 정수 : 10
   두번째 정수 : 20

  실행 결과
    10 + 2 = 12
    10 - 2 = 10
    10 * 2 = 20
    10 / 2 = 5
 */
import java.util.Scanner;
public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int Temp1, Temp2;

		System.out.print("첫번째 정수:");
		Temp1 = sc.nextInt();
		
		System.out.print("두번째 정수:");
		Temp2 = sc.nextInt();
		System.out.println();
		System.out.println();
		System.out.printf("%d + %d = %d \n", Temp1,Temp2,(Temp1+Temp2));
		System.out.printf("%d - %d = %d \n", Temp1,Temp2,(Temp1-Temp2));
		System.out.printf("%d * %d = %d \n", Temp1,Temp2,(Temp1*Temp2));
		System.out.printf("%d / %d = %d \n", Temp1,Temp2,(Temp1/Temp2));
		System.out.printf("%d %% %d = %d \n",Temp1,Temp2,(Temp1%Temp2));

	}

}
