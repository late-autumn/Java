package Day05;

import java.util.Scanner;

public class ForEx04 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int num ;
	
	System.out.println("숫자를 입력하세요:");
	num = sc.nextInt();
	for(int i=1;i<=num;i++){
		System.out.print((i*3)+" ");
	}
	
	
	
}
}
