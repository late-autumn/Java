package Day05;

import java.util.Scanner;

public class ForEx02 {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	int n1, n2;
	
	for(; ;){
		System.out.print("�ΰ��� ������ �Է� �ϼ���:");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		System.out.println("�μ��� ����"+(n1+n2));
		if(n1 ==0 || n2 ==0)
		break;
	}
	
	
	}
}