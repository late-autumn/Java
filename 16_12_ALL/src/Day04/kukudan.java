package Day04;
//구구단 종류별로 
import java.io.IOException;
public class kukudan {
public static void main(String[] args)throws IOException {
	
	/* 기본 구구단
	System.out.print("단수를 입력하시오:");
	int dan = System.in.read()-48;
	for(int i=1; i<=9;i++)
	{
		System.out.printf("%d * %d = %d \n",dan,i,dan*i);
	}
*/	  
	//가로로 나오게 하는 구구단
/*	for(int i=2;i<=9;i++)
	{
		for(int j=1;j<=9;j++)
		{
			System.out.printf("%d * %d = %d \t",i,j,i*j);
		}
		System.out.println();
	}*/
	
	//세로로 나오게 하는 구구단 
	for(int i=1;i<=9;i++)
	{
		for(int j=2;j<=9;j++)
		{
			System.out.printf("%d * %d = %d \t",j,i,i*j);
		}
		System.out.println();
	}
	
	
	/* 삼중 for문 구구단
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
