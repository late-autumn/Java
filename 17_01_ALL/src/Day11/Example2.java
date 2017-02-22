package Day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example2 {
	

	int InputNum = 0;
	int Sum = 0;

	void Input()throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1~1000까지의 숫자를 입력하세요:");
		InputNum = Integer.parseInt(br.readLine());

		if(InputNum<1 || InputNum>1000)
		{
			System.out.println("잘못 입력하셨습니다 . 다시입력하세요");
			Input();
		}
	

	}
	void add()
	{
		for(int i=1; i<=InputNum;i++)
		{
			Sum += i;
		}
	}
	void display()
	{
		System.out.println("입력하신 값은 : "+InputNum+"입니다.");
		System.out.println("1부터의 총 합은:"+Sum+"입니다.");
	}

	
}
