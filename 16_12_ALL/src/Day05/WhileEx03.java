package Day05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class WhileEx03 {
public static void main(String[] args)throws IOException {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int menu = 0;
	

	
	 do{
		 System.out.println("�޴��� �Է����ּ���");
		 System.out.println("1.ȸ������");
		 System.out.println("2.ȸ����ȸ");
		 System.out.println("3.ȸ��Ż��");
		 System.out.println("0.�� ��");
			
		 menu = Integer.parseInt(br.readLine());
		 //����� ��Ÿ���� �ؿ�
		//menu = System.in.read()-48;
		//System.in.read();
		//System.in.read(); 
	 }while(menu!=1 && menu!=2 && menu!=3 &&menu!=0);
	 
	 System.out.println("������ �޴���"+menu+"�Դϴ�.");
	 
}
}
