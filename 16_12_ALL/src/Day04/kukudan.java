package Day04;
//������ �������� 
import java.io.IOException;
public class kukudan {
public static void main(String[] args)throws IOException {
	
	/* �⺻ ������
	System.out.print("�ܼ��� �Է��Ͻÿ�:");
	int dan = System.in.read()-48;
	for(int i=1; i<=9;i++)
	{
		System.out.printf("%d * %d = %d \n",dan,i,dan*i);
	}
*/	  
	//���η� ������ �ϴ� ������
/*	for(int i=2;i<=9;i++)
	{
		for(int j=1;j<=9;j++)
		{
			System.out.printf("%d * %d = %d \t",i,j,i*j);
		}
		System.out.println();
	}*/
	
	//���η� ������ �ϴ� ������ 
	for(int i=1;i<=9;i++)
	{
		for(int j=2;j<=9;j++)
		{
			System.out.printf("%d * %d = %d \t",j,i,i*j);
		}
		System.out.println();
	}
	
	
	/* ���� for�� ������
	 * for(int i=2; i<9;i+=4)
	{
		for(int j=1;j<=9;j++)
		{
			for(int dan=i;dan<=i+3;dan++)
			{
				System.out.printf("%d * %d = %d \t",dan,j,dan*j);
			}
			System.out.println();
		}
		System.out.println();
	}*/
}
	
	
}
