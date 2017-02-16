package Day03;

public class OperEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*  ex ) 8을 비트                    => 0 0 0 0 1 0 0 0 
		 *       1의 보수를 할땐 1과 0 교체 => 1 1 1 1 0 1 1 1
		 *       2의보수를 할땐 뒤에 +1   => 1 1 1 1 1 0 0 0  
		 * 
		 * 
		 * 
		 */
		
		
		
		int i = -10;
		int j = i>>>2;
		
		System.out.println("i:"+i);
		System.out.println("j:"+j);
	}

}
