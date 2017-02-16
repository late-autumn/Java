package Day07;

public class ArrayEx01 {
public static void main(String[] args) {
	
	int sum = 0;
	int i= 1;

	do{
	/*	if(i%2!=0){ 
			sum += (i*-1)*i;
		}
		else{
			sum+= i*i;
		}
	*/	sum+= i%2!=0?(i*-1)*i:i*i;
		i++;
	}while(i<=100);
	System.out.println("ÇÕ°è´Â="+sum);
	
}
}
