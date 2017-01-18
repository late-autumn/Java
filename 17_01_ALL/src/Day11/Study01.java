package Day11;

import java.util.Scanner;

public class Study01 {
public static void main(String[] args) {
	int input;
	Scanner sc = new Scanner(System.in);
	do{
	System.out.println("숫자 입력하시오:");
	input = sc.nextInt();
	
	int tmp = input/2+1;
	int Change =0;
	int k;
	for(int i=1; i<=input*2-1; i++)
	{
		if(i<=input)
		Change++;
		else Change--;
		for(int j=1;j<input*2-Change;j++)
		{
			System.out.print(" ");
		}
		for(k=1; k<2;k++){
			System.out.print("*");
		}
		for(int l=2;l<=Change*2-1;l++)
		{
			if(l!=2)
			System.out.print(" ");
		}
		for(int m=1;m<Change;m++)
		{
			if(m<2)
			System.out.print("*");
		}
		System.out.println();
	}
	}while(input!=0);
}
}
