package Day05;

import java.util.Scanner;

public class Exam06 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int s,n,num;
	char ch; // y,n을 입력할 변수 
	while(true)
	{
		do{
			System.out.println("원하는 수 입력:");
			num = sc.nextInt();
			//원하는 수 입력
		}while(1>num ||num>1000);
		
		s = 0;
		for(n=1;n<=num;n++)
		{
			s+=n;
		}
		System.out.println("1에서부터"+num+"까지의 누적 총합은 ="+s);
		System.out.println("계속 하시겠습니까? y or n");
		ch = sc.next().charAt(0);
		if(ch!='Y'&&ch!='y')
		break;
	}
	
}
}
