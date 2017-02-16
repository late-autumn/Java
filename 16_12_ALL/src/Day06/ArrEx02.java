package Day06;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class ArrEx02 {
public static void main(String[] args)throws IOException {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Scanner sc = new Scanner(System.in);
	
	String[] Name = new String[3];
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

		switch((int)(sub[i][sub[i].length-3]/5)/10)
		{
		case 9:
			Grade = 'A';
			break;
		case 8:
			Grade = 'B';
			break;
		case 7:
			Grade = 'C';
			break;
		case 6:
			Grade = 'D';
			break;
		case 5:
			Grade = 'F';
			break;
			default:
				System.out.println("잘못됨");
		}
	
	
	}
}
}

