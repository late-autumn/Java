package Day22;

import java.util.*;

import Day11.Record;

class RecordEx{
	
	String name;
	int sco;
	
}

class Grade{
	
	RecordEx[] rec;					//레코드 클래스를 참조 변수로 선언
	int n;							//인원수 변수 정의
	
	Scanner sc = new Scanner(System.in);
	
	//인원수를 입력 받을 메소드 정의
	
	void set(){
		
		do{
			System.out.print("인원 수 입력(1~100):");
			n = sc.nextInt();
			sc.nextLine();
		}while(n<1||n>100);
		
		rec = new RecordEx[n];
		
	}
	
	void input(){					//이름과 성적을 입력받는다. 
		
		for(int i=0; i<rec.length;i++){
			
		rec[i]= new RecordEx();
		System.out.println("이름을 입력해주세요:");
		rec[i].name = sc.nextLine();
		System.out.println("성적을 입력해주세요:");
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
			System.out.printf("%4d 등 %5s %4d\n",i+1,rec[i].name,rec[i].sco);
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
