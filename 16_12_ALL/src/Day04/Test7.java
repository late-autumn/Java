package Day04;
//1���� 100���� �� ��� for, while, do while
public class Test7 {
public static void main(String[] args) {
	
	int result1 = 0;
	int result2 = 0;
	int result3 = 0;
	int result4 = 0;
	int result5 = 0;
	int result6 = 0;
	/*for(int i=1;i<=100;i++){
		result1 +=i;
	}
	System.out.println("for�� ��� = "+result1);
	
	int j=1;
	while(j<=100){
		result2 +=j;
		j++;
	}
	System.out.println("while�� ��� = "+result2);
	
	int k=1;
	do{
	 result3+=k;
	 k++;
	}while(k<=100);
		System.out.println("do~while ��� ="+result3);
	*/
	
	//for���� ������ ��Ÿ�� 
	int v, sum =0;
	int even =0;
	int old = 0;
	for(v =0;v<=100;v++)
	{
		if(v%2==0)
			even+=v;
		else
			old+=v;
	}
	sum = even+old;
	System.out.println("¦���� �հ� :"+even);
	System.out.println("Ȧ���� �հ�:"+old);
	System.out.println("���հ�:"+sum);
	
	
	//�̰� �׳� C��Ÿ�� ����Ÿ�� 
	int j=1;
	while(j<=100){
		result3 +=j;
		j+=2;
	}
	int j2=2;
	while(j2<=100){
		result4 +=j2;
		j2+=2;
	}
	System.out.println("while�� ¦�� �� ��� = "+result4);
	System.out.println("while�� Ȧ�� �� ��� = "+result3);
	System.out.println("while�� ���� ��� = "+(result3+result4));

	int k=1;
	do{
	 result5+=k;
	 k+=2;
	}while(k<=100);
	
	int k2=0;
	do{
	 result6+=k2;
	 k2+=2;
	}while(k2<=100);
		System.out.println("do~while ¦�� �� ��� ="+result6);	
		System.out.println("do~while Ȧ�� �� ��� ="+result5);
		System.out.println("do~while �� �� ��� ="+(result5+result6));

		
		
 }
}
