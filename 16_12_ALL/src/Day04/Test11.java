package Day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Test11 {
public static void main(String[] args)throws IOException {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int input;
	int i=2;
	System.out.print("���ڸ� �Է��ϼ���:");
	input = Integer.parseInt(br.readLine());
	boolean flag = true;
	while(i<input)
	{
		if(input % i==0) flag = false;  //�Ҽ� �ƴ�
		i++;
	}
	if(flag && input!=1){
			System.out.println(input+"�� �Ҽ��Դϴ�.");
	}
	else{
			System.out.println("�Ҽ��� �ƴմϴ�.");
	}

		

}
}
