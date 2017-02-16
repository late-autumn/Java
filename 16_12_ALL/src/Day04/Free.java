package Day04;

public class Free {
public static void main(String[] args) {
	

	/*int MAX = 5;
	int tmp = MAX/2+1;
	int Change =4;
	
	for(int i=1; i<=MAX; i++)
	{
		if(i<=tmp) Change--;
		else Change++;
		
		for(int j=1;j<=tmp-Change;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=Change*2-1;k++)
		{
			System.out.print("*");   
		}
		System.out.println();
	}*/
	
	for(int i=1; i<=5;i++)
	{
		for(int j=5;j>=i;j--)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=i*2-1;k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
	

}
}
