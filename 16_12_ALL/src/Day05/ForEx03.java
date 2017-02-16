package Day05;

import java.util.Scanner;

public class ForEx03 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int fact ;
	System.out.println("원하는 수를 입력");
	fact = sc.nextInt();
	int result = 1;
	for(int i=fact;i>=1;i--){
		result *= i;
	}
	System.out.println(result);
}
}
