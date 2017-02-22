package Day22;

import java.util.Scanner;

public class Exam2_Method implements Exam2_Function {

	Scanner sc = new Scanner(System.in);
	Exam2_VO[] VO;
	@Override
	public void inset() {
		// TODO Auto-generated method stub
		int input;
				
		do{
			System.out.print("인원 수 입력:");
			input = sc.nextInt();
			
			VO = new Exam2_VO[input];
	
			for(int i=0; i<VO.length;i++){
				VO[i]= new Exam2_VO();
				System.out.printf("%d 번째 학생의 학번 이름 입력(공백구분):",(i+1));
				VO[i].hak = sc.nextInt();
				VO[i].name = sc.next();
				System.out.print("국어 영어 수학 점수 입력(공백구분):");
				for(int j=0; j<VO[i].subject.length;j++){
					VO[i].subject[j] = sc.nextInt();
					//sc.nextLine();
				}
			}
		
		}while(input<1|| input>100);

	}

	@Override
	public void result() {
		// TODO Auto-generated method stub
		for(int i=0; i<VO.length;i++){
		for(int j=0; j<VO[i].subject.length;j++){
			VO[i].sum += VO[i].subject[j];
			VO[i].avg = VO[i].sum/3;
			
			if(VO[i].subject[j]>90){
				VO[i].scor[j] = "수";
			}
			else if(VO[i].subject[j]>80){
				VO[i].scor[j] = "우";
			}
			else if(VO[i].subject[j]>70){
				VO[i].scor[j] = "미";
			}
			else if(VO[i].subject[j]>60){
				VO[i].scor[j] = "양";
			}
			else{
				VO[i].scor[j] = "가";
			}
				
			}
		}
		
		
		

	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		for(int i=0; i<VO.length;i++){
			System.out.print(VO[i].hak+" "+VO[i].name);
			for(int j=0; j<VO[i].subject.length;j++){
				System.out.print(VO[i].subject[j]+" ");

			}
			System.out.println(VO[i].sum+" "+VO[i].avg);

		}
		for(int i=0; i<VO.length;i++){
			for(int j=0; j<VO[i].subject.length;j++){
			System.out.print(" "+VO[i].scor[j]+" ");
			}
		}

	}

}
