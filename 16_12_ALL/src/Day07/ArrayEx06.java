package Day07;

public class ArrayEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*/
		 * 문제 5]

		2차원 배열을 이용하여 다음과 같이 결과를 출력하시오 

	      1 2 3 4 5
	      2 3 4 5 6
	      3 4 5 6 7
	      4 5 6 7 8
	      5 6 7 8 9  
		
		 */
/*		int a = 1;
		int [][]box = new int[5][5];

		for(int i=0;i<box.length;i++)
		{
	
			for(int j=0;j<box.length;j++)
			{
//				box[i][j] = (i+1)+j;
				box[i][j] = a;
				a++;
			}
			a = a-(box.length-1);
		}
		System.out.println();
		for(int i=0;i<box.length;i++)
		{
			for(int j=0;j<box.length;j++)
			{
				System.out.print(box[i][j]);
			}
			System.out.println();
		}*/
		
		//=================================================
		
		int[][]arr = new int[5][5];
		for(int i=0,n=1;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=n;
				n++;
			}
			n= i+2;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
		
		
	}

}
