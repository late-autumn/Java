package Day22;

import java.io.IOException;

public class Map_Sung_Main {

	public static void main(String[] args)throws IOException {
		
		char ch;
		Map_Sung_Method sung = new Map_Sung_Method();
		System.out.println("성적 처리");
		while(true){
			do{
				System.out.print("1.입력:");
				System.out.print("2.수정:");
				System.out.print("3.이름검색:");
				System.out.print("4.삭제:");
				System.out.print("5.전체 출력:");
				System.out.print("6.합계순 전체출력:");
				System.out.print("7.종료:");
				
				System.out.print("메뉴선택:");
				ch = (char)System.in.read();
				System.in.skip(2);
				
				
			}while(ch<'1'||ch>'7');
			
			switch(ch){
			
			case '1': sung.insert(); break;
			case '2': sung.update(); break;
			case '3': sung.search(); break;
			case '4': sung.delete(); break;
			case '5': sung.writeAll(); break;
			case '6': sung.writeSort(); break;
			case '7': System.exit(0); break;
			
			}//end switch
		}
	}
}
