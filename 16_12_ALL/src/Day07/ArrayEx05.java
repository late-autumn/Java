package Day07;

public class ArrayEx05 {
public static void main(String[] args) {
	
	/*      *        *
	 *      **      **
	 *      ***    ***
	 *      ****  ****
	 *      **********
	 *      ****  ****
	 *      ***    ***
	 *      **      **
	 *      *        *
	 */
	
	int MAX = 10;
	int bnk = 0 ;
	int tmp = MAX/2;
	
	for(int i=0;i<=MAX;i++)
	{
		if(i<=tmp)
		{
			bnk++;
		}
		else
		{
			bnk--;
		}

		for(int j=1;j<=bnk;j++)
		{
			System.out.print("*");
		}

		for(int k=MAX;k>=bnk*2-1;k--)
		{
			System.out.print(" ");
		}
		
		for(int j=1;j<=bnk;j++)
		{
			System.out.print("*");
		}
		
		System.out.println();
	}
}
}
