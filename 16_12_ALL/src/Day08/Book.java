package Day08;

public class Book extends Copy{  //Copy를 상속받는다.
	
	//멤버 변수 선언
	String name;
	String writer;
	int price;
	int nowPage;
	String isbn;
	
	//멤버 메소드
	//생성자 함수
	public Book(){
		
	}//오버 로딩 
	public Book(int a){
		
	}//오버라이딩
	public void bbb() {
		// TODO Auto-generated method stub
		super.bbb();
	}
	public void nextPage(){
		nowPage++;
	}
	public void Print(){
		System.out.println(name+"이 출력된다.");
	}
	
}

class Copy{ //상속 시켜줄 클래스 
	
	public Copy(){
		
	}
	public void bbb(){
		
	}	
}
