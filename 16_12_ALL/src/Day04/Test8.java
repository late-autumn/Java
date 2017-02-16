package Day04;

public class Test8 {
public static void main(String[] args) {
	
	int res =0;
		
	int i=1;
	while(i<=100)
	{
		res+=i;
		if(i%10==0)
			System.out.println("1부터 "+i+"까지합계"+res);
		i++;
	}
}
}
