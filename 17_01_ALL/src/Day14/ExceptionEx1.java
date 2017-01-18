package Day14;

/*실행 도중 정수를 0으로 나눌 경우 생길 수 있는 예외처리
 * 
 */

public class ExceptionEx1 {
public static void main(String[] args) {
	
	//변수 선언부분
	int num = 50,sum =0;
	
	//연산 및 처리 부분

	for(int i=0;i<10;i++)
	{
		try{
		sum+=num/(int)(Math.random()*5); 

		System.out.println(sum);
		}catch(ArithmeticException e){ //을 처리해줘야한다.
			//e.printStackTrace();
			//e.getMessage();
			System.out.println(e.getMessage());
		}
	}
	
}
}
