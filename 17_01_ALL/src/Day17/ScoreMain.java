package Day17;

import java.io.IOException;

public class ScoreMain {
public static void main(String[] args)throws IOException {
	
	char ch;
	Score score = new ScoreImpl();
	//인스턴스 객체 생성
	
	//메뉴 구성
	
	while(true){
		do{
			System.out.print("1.추가 2.수정 3.삭제 4.전체출력 5.학번검색 6. 이름 검색 7.종료");
			ch = (char)System.in.read();
			System.in.skip(2); // system.in.read();system.in.read(); 두번 한것과 같다.
			
		}while(ch<'1'||ch>'7');
		
		switch(ch){
		case '1':	score.insert();	break;
		case '2':	score.update();	break;
		case '3':	score.delete();	break;
		case '4': score.listAll(); break;
		case '5': score.searchHak(); break;
		case '6' : score.searchName(); break;
		case '7' : System.exit(0); 
						
		}//end switch
		
	}//end while
	
}
}
