package Day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Test11 {
public static void main(String[] args)throws IOException {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int input;
	int i=2;
	System.out.print("숫자를 입력하세요:");
	input = Integer.parseInt(br.readLine());
	boolean flag = true;
	while(i<input)
	{
		if(input % i==0) flag = false;  //소수 아님
		i++;
	}
	if(flag && input!=1){
			System.out.println(input+"은 소수입니다.");
	}
	else{
			System.out.println("소수가 아닙니다.");
	}

		

}
}
