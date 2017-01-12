package Day04;
//1부터 100까지 합 찍기 for, while, do while
public class Test7 {
public static void main(String[] args) {
	
	int result1 = 0;
	int result2 = 0;
	int result3 = 0;
	int result4 = 0;
	int result5 = 0;
	int result6 = 0;
	/*for(int i=1;i<=100;i++){
		result1 +=i;
	}
	System.out.println("for문 결과 = "+result1);
	
	int j=1;
	while(j<=100){
		result2 +=j;
		j++;
	}
	System.out.println("while문 결과 = "+result2);
	
	int k=1;
	do{
	 result3+=k;
	 k++;
	}while(k<=100);
		System.out.println("do~while 결과 ="+result3);
	*/
	
	//for문은 강사팀 스타일 
	int v, sum =0;
	int even =0;
	int old = 0;
	for(v =0;v<=100;v++)
	{
		if(v%2==0)
			even+=v;
		else
			old+=v;
	}
	sum = even+old;
	System.out.println("짝수의 합계 :"+even);
	System.out.println("홀수의 합계:"+old);
	System.out.println("총합계:"+sum);
	
	
	//이건 그냥 C스타일 내스타일 
	int j=1;
	while(j<=100){
		result3 +=j;
		j+=2;
	}
	int j2=2;
	while(j2<=100){
		result4 +=j2;
		j2+=2;
	}
	System.out.println("while문 짝수 합 결과 = "+result4);
	System.out.println("while문 홀수 합 결과 = "+result3);
	System.out.println("while문 총합 결과 = "+(result3+result4));

	int k=1;
	do{
	 result5+=k;
	 k+=2;
	}while(k<=100);
	
	int k2=0;
	do{
	 result6+=k2;
	 k2+=2;
	}while(k2<=100);
		System.out.println("do~while 짝수 합 결과 ="+result6);	
		System.out.println("do~while 홀수 합 결과 ="+result5);
		System.out.println("do~while 총 합 결과 ="+(result5+result6));

		
		
 }
}
