package Day17;

import java.util.Random;
import java.util.Scanner;

public class Test7 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Random r = new Random();
	
	int com = r.nextInt(3)+1; // 1,2,3
	int user ;
	String[] str = {"����","����","��"};

	do{
		System.out.println("1:���� 2:���� 3: �� �߿� �Է�:");
		user = sc.nextInt();
		
	}while(user <1 ||user >3);
	//�߰� ��� ��Ȳ
	System.out.println("���� :"+str[user-1]);
	System.out.println("��ǻ��:"+str[com-1]);
	
	//�º�ó�� ��� ���
	String result;
	result = "���º�";
	if((user==1 && com ==3)||(user==2 && com ==1) ||(user ==3 && com ==2))
		result = "���� �¸�";
	if((user==1 && com ==2)||(user==2 && com ==3) ||(user ==3 && com ==1))
		result = "��ǻ�� �¸�";

	System.out.println(result);
}
}
