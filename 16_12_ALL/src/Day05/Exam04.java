package Day05;
import java.util.Scanner;
public class Exam04 {
public static void main(String[] args) {
	

	Scanner sc = new Scanner(System.in);
	
	//���� ���� �� �ΰ��� �Ǽ� �ʱ�ȭ
	float Num, result;
	Num = result = 0.0f;
	//ī��Ʈ ���� ����� �ʱ�ȭ
	int Count=0;
	
	for(; ;)
	{
		result+=Num;
		System.out.println("������ �Է��ϼ���:");
		Num = sc.nextFloat();
		
		if(Num<0){
		Num *= -1;
		result += Num;
		}
		Count++;
		System.out.println("����� ="+(result));
	}

	
	}	
	
}
