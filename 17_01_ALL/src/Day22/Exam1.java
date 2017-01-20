package Day22;

import java.util.*;

import Day11.Record;

class RecordEx{
	
	String name;
	int sco;
	
}

class Grade{
	
	RecordEx[] rec;					//���ڵ� Ŭ������ ���� ������ ����
	int n;							//�ο��� ���� ����
	
	Scanner sc = new Scanner(System.in);
	
	//�ο����� �Է� ���� �޼ҵ� ����
	
	void set(){
		
		do{
			System.out.print("�ο� �� �Է�(1~100):");
			n = sc.nextInt();
			sc.nextLine();
		}while(n<1||n>100);
		
		rec = new RecordEx[n];
		
	}
	
	void input(){					//�̸��� ������ �Է¹޴´�. 
		
		for(int i=0; i<rec.length;i++){
			
		rec[i]= new RecordEx();
		System.out.println("�̸��� �Է����ּ���:");
		rec[i].name = sc.nextLine();
		System.out.println("������ �Է����ּ���:");
		rec[i].sco = sc.nextInt();
		sc.nextLine();
		}
		int pass = 0;
		RecordEx temp = new RecordEx();
		boolean flag;
		
		do{
			flag = false;
			pass++;
			
			for(int i=0; i<rec.length-pass;i++){
				if(rec[i].sco<rec[i+1].sco){
				temp = rec[i];
				rec[i] = rec[i+1];
				rec[i+1] = temp;
				
				flag = true;
			}
			
			}
			
		}while(flag);
		
	}//end method
	
	
	void print(){
		
		System.out.println();
		System.out.println("----------------------");
		
		for(int i=0; i<rec.length;i++){
			System.out.printf("%4d �� %5s %4d\n",i+1,rec[i].name,rec[i].sco);
		}
		
		
		
		System.out.println("----------------------");
	}
	
}


public class Exam1 {

	public static void main(String[] args) {
		
		Grade g = new Grade();
		g.set();
		g.input();
		g.print();
	}
}
