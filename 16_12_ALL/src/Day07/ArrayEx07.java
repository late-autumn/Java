package Day07;

public class ArrayEx07 {
public static void main(String[] args) {
	/*
	 *  ㄹ 모양으로 출력하기 
	 *  1  2  3  4  5  
	 *  10 9  8  7  6  
	 *  11 12 13 14 15
	*/

	int [][]arr = new int [5][5];

	int a =1;

	for(int i=0;i<arr.length;i++)
	{
		if(i%2==0)
		{
			for(int j=0; j<arr[i].length;j++)
			{
				arr[i][j] = a;
				a++;
			}
		}
		else
		{
			for(int j=arr[i].length-1; j>=0;j--)
			{
				arr[i][j] = a;
				a++;
			}
		}
	}
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0; j<arr.length;j++)
		{
			System.out.print(arr[i][j]+"\t");
		}
		System.out.println();
	}
	
	
   
 


	
	
}
}
