package Day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2 {

	int value;
	Test2(int value)
	{
		this.value = value;
	}
	
public static void Change(Test2 a,Test2 b)
{
	int t;
	t = a.value;
	a.value =b.value;
	b.value= t;

}
public static void main(String[] args)throws IOException {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int Num1 , Num2, Num3;
	int temp;
	Test2 a1 = new Test2(21);
	Test2 a2 = new Test2(8);
	Test2 a3 = new Test2(14);
	
	System.out.print("ù��° ���� :");
	Num1 = Integer.parseInt(br.readLine());
	System.out.print("�ι�° ���� :");
	Num2 = Integer.parseInt(br.readLine());
	System.out.print("����° ���� :");
	Num3 = Integer.parseInt(br.readLine());
	

//	Change(a1, a2);
//	Change(a2,a3);
//	System.out.println("������ ���� :"+a1.value+","+a2.value+","+a3.value);

/*	if(Num1>Num2){
		temp = Num1;
		Num1 = Num2;
		Num2 = temp;
		
	}
	if(Num1>Num3){
			temp = Num1;
			Num1 =Num3;
			Num3 =temp;
		}
	if(Num2>Num3){
			temp = Num2;
			Num2 =Num3;
			Num3 =temp;
		}
	*/
	// XOR ������� ����
	if(Num1>Num2){
	Num1 = Num1^Num2;
	Num2 = Num2^Num1;
	Num1 = Num1^Num2;
	}
	if(Num1>Num3){
		Num1 = Num1^Num3;
		Num3 = Num3^Num1;
		Num1 = Num1^Num3;
	}
	if(Num2>Num3){
		Num2 = Num2^Num3;
		Num3 = Num3^Num2;
		Num2 = Num2^Num3;
	}

	System.out.println("���İ�� :"+Num1+","+Num2+","+Num3);

	
	 
}
}
