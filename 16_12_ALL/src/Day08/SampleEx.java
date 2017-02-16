package Day08;



class Sample{ //여기다 public 붙이면 둘다 중복되서 안됨. default인 상태로 해줘야 한다. 컴퓨터가 한마디로 바보가 됨 
	
	int x;	//초기 default 값이 0으로 자동으로 생성이 된다.
	int y;
	
}
//class A{ //만약 왼쪽 패키지에서 따로 A라는 클래스를 만들땐 public이 붙을 수 있다. 파일 자체가 다르기 때문에. 확장자 변수이기 때문에
		  //하지만 저장하게되면 에러가 발생한다. 패키지가 같기때문에 A라는 클래스를 또다시 만들 수 없다. 
	


public class SampleEx {
public static void main(String[] args) {
	
	Sample ss = new Sample(); //객체 생성
	System.out.println(ss.y);
	ss.x +=1;
	System.out.println(ss.x);
	
	//자바에서 포함 멤버들이 각각 접근 변경자를 가진다.
	
	
	
	
}
}
