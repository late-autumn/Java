package Day12_Machine;

public class Attribute {
	
	
	//Ŀ���� �̸��� �׿� �ش��ϴ� ����(price)
	final static String[] coffee = {"�Ƹ޸�ī��","ī���","���ڶ�","ī���ī", "����������", "����Ŀ��", "����Ŀ��"};
	
	
	//Ŀ�ǰ���
	final static int[] price={1500, 2000, 2000, 2500, 1000, 2500, 3000};
	static int[] frequency = {0,0,0,0,0,0,0};
	
	
	//������ ���� ����
	final static String[] material={"��", "����", "����", "����", "����", "������"};
	static int[] amount = {100, 100, 100, 100, 100, 10};
	
	
	//������ Ŀ�� ������
	static int[][] mat_amou={
			
			{4,1,0,0,0,1},{0,1,3,1,0,1},
			{0,0,3,1,1,1},{2,1,0,1,1,1},{1,2,0,0,0,1}};
	
	
	//���� ���� �ݾװ� �׿� �ش��ϴ� ����
	final static String[] moneyname={"100��","500��","1000��","5000��"};
	static int[][] money = {{100,500,1000,5000},{10,10,10,0}};
	
	
	//���ǱⰡ ������ �ִ� �� �ݾ�
	static int deposit = 0;
	
	static int money(){
		
		int totmoney = 0;
		for(int i=0;i<money[0].length;i++)
			totmoney += (money[0][i]*money[1][i]);
		
		return totmoney;
		
	}


	
	
	
	
	
	
	
	

}
