package Day05;

public class ContinueEx01 {
public static void main(String[] args) {
	
	for(int i=0;i<=20;i++)
	{
		if(i%2==0)continue; //홀수 일때만 출력 , 짝수일땐 계속 진행 시킨다.
		
		System.out.print(i+" ");
	}
	
	
}
}
