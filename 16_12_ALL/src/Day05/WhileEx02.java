package Day05;

//달력 모양으로 숫자 출력하기

public class WhileEx02 {
public static void main(String[] args) {
	
	int i =1;
	
	while(i<=31){
		if(i%7==0){
			System.out.println(i);
		}
		else{
			System.out.print(i+"\t");
		}
		i++;
	}

		
	
}
}
