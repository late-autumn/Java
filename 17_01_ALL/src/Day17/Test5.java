package Day17;


import java.util.Random;
import java.util.Scanner;

public class Test5 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int input_num=0;
	int min =0, max=0;
	System.out.println("�Է¹ް� ���� ������ ������ �����ּ���:");
	input_num = sc.nextInt();
	int[] array = new int [input_num];
	
	for(int i=0; i<array.length;i++){
		array[i] = (int) (Math.random()*100);	//������ ������ 100���� �Ѵ�.
			System.out.println("�Է� �� : "+array[i]);
	}

	for(int i=0; i<array.length-1;i++){

		if(array[i]>array[i+1])
			max = array[i];
		else
			min = array[i];
	}
	System.out.println("�ּ� �� :"+min +"�ִ밪:"+max);


	
	
}
}
