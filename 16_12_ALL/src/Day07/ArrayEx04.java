package Day07;

public class ArrayEx04 {
public static void main(String[] args) {
	
	
	//����� �� �Ǵٸ� ���
	/*
	 * int num =3;
	
	 for(int i=2; i<9;i+=num)
	{
		for(int j=1;j<=9;j++)
		{
			for(int dan=1;dan<=num;dan++)
			{
				
	  			if(i+k=9)
				{
					System.out.print((i+k)+"*"+j+"="+(i+k)*j+"=t");
				}

			}
			System.out.println();
		}
		System.out.println();
	}
	*/
	//���� �� ��
	 for(int i=2; i<9;i+=4)
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
	}
}
}
