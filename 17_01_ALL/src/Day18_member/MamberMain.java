package Day18_member;

import java.io.IOException;

public class MamberMain {

	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub

		char ch;
		
		Member ob = new MemberImpl();
		
		System.out.println(">>>>>>회원관리<<<<<<<");
		
		while(true){
			System.out.println("1.등록 2.수정 3.삭제 4.검색 5.리스트 6.종료:");
			ch = (char)System.in.read();
			System.in.skip(2);
			
			switch(ch){
			case '1': ob.insert_member(); break;
			case '2': ob.update_member(); break;
			case '3': ob.delete_member(); break;
			case '4': ob.search_member(); break;
			case '5': ob.list_member(); break;
			case '6' : System.exit(0);
			
			}//end switch
		}//end while
	} 

}
