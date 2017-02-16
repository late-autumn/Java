package Day06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class ArrEx01 {
public static void main(String[] args)throws IOException {
	Scanner sc = new Scanner(System.in);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	/* 엑셀 성적표를 가지고  프로그램을 짜시오.
	 *  국어 영어 수학 사회 과학 총점 평균 석차를 구하시오 
	 */
	
	char ch[] = new char[4];		//배열 선언 및 초기화
	
	ch[0] = 'J';
	ch[1] = 'A';
	ch[2] = 'V';
	ch[3] = 'A';
	
	//내용을 출력은 무조건 for문.
	for(int i=0; i<ch.length;i++)
	{
		System.out.println(ch[i]);
	}
	for(char aa:ch)  // 정수로 하려면 int로 변경만 해주면 된다.
	{
		System.out.println("aa="+aa);
	}
	
/*	
	int [][] a ; //2차원 배열 선언
	int i =5, j = 5;
	a= new int[i][j];
*/	
	int [][] b;
	b= new int[2][3];
	b[0][0] = 100;
	for(int i=0;i<b.length;i++)  //바깥쪽
	{
		for(int j=0;j<b.length;j++) //안쪽
			System.out.println(b[i][j]);
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	/*String[] Name = new String[3];
	String[] SubName = {"국어","영어","수학","사회","과학","총합","등수","학점"};
	int[][] sub = new int[Name.length][SubName.length];
	char Grade ;
	
	for(int i=0;i<sub.length;i++)
	{		
		System.out.print("이름을 입력하세요 :");
		Name[i] = sc.nextLine();
		br.readLine();
		for(int j=0;j<sub[i].length-3;j++)
		{
			System.out.print(SubName[j]+"성적을을 입력하세요 :");
			sub[i][j] = sc.nextInt();
			sub[i][sub[i].length-3]+=sub[i][j];
		}
		System.out.println();
	}
	
	for(int i=0; i<sub.length;i++)
	{
		for(int j=0;j<sub.length;j++)
		{
			if(sub[i][sub[i].length-3]<sub[j][sub[j].length-3])
			{
				sub[i][sub[i].length-2]++;
			}
		}
	}
	
	for(int i=0;i<sub.length;i++)
	{
		for(int j=0; j<sub[i].length;j++)
		{
		//	System.out.print(Name[i]+" "+SubName[j]+"="+sub[i][sub[i].length]);
			System.out.print("\t");
		}

		switch((int)(sub[i][sub[i].length-3]/5))
		{
		case 90:
			Grade = 'A';
			break;
		case 80:
			Grade = 'B';
			break;
		case 70:
			Grade = 'C';
			break;
		case 60:
			Grade = 'D';
			break;
		case 50:
			Grade = 'F';
			break;
			default:
				System.out.println("잘못됨");

		
	}*/

	
	
	

	
	
	
	/*String name [] =new String[num];
	 * String[][]subject = new String[num][];
	 * int[][]jumsu =new int[num][];
	 * dobule[]avg =new double[num];
	 * int rank[] = new int[num];
	 * 
	 */

	
	}
}
