package Day22;

import java.io.IOException;

public class Map_Sung_Main {

	public static void main(String[] args)throws IOException {
		
		char ch;
		Map_Sung_Method sung = new Map_Sung_Method();
		System.out.println("���� ó��");
		while(true){
			do{
				System.out.print("1.�Է�:");
				System.out.print("2.����:");
				System.out.print("3.�̸��˻�:");
				System.out.print("4.����:");
				System.out.print("5.��ü ���:");
				System.out.print("6.�հ�� ��ü���:");
				System.out.print("7.����:");
				
				System.out.print("�޴�����:");
				ch = (char)System.in.read();
				System.in.skip(2);
				
				
			}while(ch<'1'||ch>'7');
			
			switch(ch){
			
			case '1': sung.insert(); break;
			case '2': sung.update(); break;
			case '3': sung.search(); break;
			case '4': sung.delete(); break;
			case '5': sung.writeAll(); break;
			case '6': sung.writeSort(); break;
			case '7': System.exit(0); break;
			
			}//end switch
		}
	}
}
