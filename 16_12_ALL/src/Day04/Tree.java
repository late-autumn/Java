package Day04;

public class Tree {
public static void main(String[] args) {
	
	for(int i=1; i<=4;i++)
	{
		for(int j=10;j>=i;j--)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=i*2-1;k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
	for(int i=1; i<=6;i++)
	{
		for(int j=10;j>=i+1;j--)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=i*2+1;k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	for(int i=1; i<=9;i++)
	{
		for(int j=10;j>=i+2;j--)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=i*2+3;k++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	for(int i=0;i<3;i++)
	{
	System.out.print("        *****");
	System.out.println();
	}

}
}
