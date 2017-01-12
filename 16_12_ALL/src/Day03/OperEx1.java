package Day03;


public class OperEx1 {

	public static void main(String[] args) {

		
		int x = 10;							//전위 연산자  및 후위 연산자 
		int y = ++x;						//전위 연산자로 x 값과 y은 11
		
		x++;								//여기서는 x값이 12로 증가
		++x;								//증가하고 x값 출력이니 13

		++y;
		y++;


		System.out.println("x:"+x);
		System.out.println("y:"+y);


	}
}
