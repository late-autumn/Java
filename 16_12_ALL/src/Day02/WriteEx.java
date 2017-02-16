package Day02;


public class WriteEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.write(65);               // write() : 화면 출력시 버퍼에 담는다.
		System.out.flush(); 				// flush() : 버퍼에 있는 것을 지울시 사용한다.
		
		System.out.println();				// 한줄 띄우기
		
		byte[]by = {'J','A','V','A'};
		System.out.write(by,0,4);			// 배열 사용의 오토플래쉬 기능 역할 	

		
	}

}
