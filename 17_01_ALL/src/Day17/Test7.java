package Day17;

import java.util.Random;
import java.util.Scanner;

public class Test7 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Random r = new Random();
	
	int com = r.nextInt(3)+1; // 1,2,3
	int user ;
	String[] str = {"가위","바위","보"};

	do{
		System.out.println("1:가위 2:바위 3: 보 중에 입력:");
		user = sc.nextInt();
		
	}while(user <1 ||user >3);
	//중간 출력 현황
	System.out.println("유저 :"+str[user-1]);
	System.out.println("컴퓨터:"+str[com-1]);
	
	//승부처리 결과 출력
	String result;
	result = "무승부";
	if((user==1 && com ==3)||(user==2 && com ==1) ||(user ==3 && com ==2))
		result = "유저 승리";
	if((user==1 && com ==2)||(user==2 && com ==3) ||(user ==3 && com ==1))
		result = "컴퓨터 승리";

	System.out.println(result);
}
}
