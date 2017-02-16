package Day02;

public class ByteEx {
	public static void main(String[] args) {
	
		byte bb = 127;
		System.out.println("byte bb의 값은 : "+bb);
		bb++;
		System.out.println("byte bb의 값은 : "+bb); //127에서 +1값을 올라가면 128이지만 표현가능한 범위를 넘었기때문에 -128로 변경
		bb++;
		System.out.println("byte bb의 값은 : "+bb);

		
	}
}
