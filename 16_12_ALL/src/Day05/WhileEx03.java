package Day05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class WhileEx03 {
public static void main(String[] args)throws IOException {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int menu = 0;
	

	
	 do{
		 System.out.println("메뉴를 입력해주세요");
		 System.out.println("1.회원가입");
		 System.out.println("2.회원조회");
		 System.out.println("3.회원탈퇴");
		 System.out.println("0.종 료");
			
		 menu = Integer.parseInt(br.readLine());
		 //강사님 스타일은 밑에
		//menu = System.in.read()-48;
		//System.in.read();
		//System.in.read(); 
	 }while(menu!=1 && menu!=2 && menu!=3 &&menu!=0);
	 
	 System.out.println("선택한 메뉴는"+menu+"입니다.");
	 
}
}
