package Day12_Machine;

import java.util.*;
/*************************
*import java.util.Scanner;
*import java.util.Random;
*************************/

public class RandomCoffee {

	Scanner sc=new Scanner(System.in);
	
	void menu(){
		
		Stock st = new Stock();
		Random ran = new Random(); //���� ��ü ����
		
		
		int random = ran.nextInt(5);
		int e;
		String str;
		str = st.drop(random);
		if(Stock.a == true)
		{
			Attribute.deposit -= Attribute.price[5];
			System.out.printf("�ֹ��Ͻ� ���� Ŀ�� %s�� ���ҽ��ϴ�.\n",Attribute.coffee[random]);
			System.out.println();
			Attribute.frequency[5]++;			
		}
		else
		{
			System.out.printf(str);
		}
		
		
	}
	
	
}
