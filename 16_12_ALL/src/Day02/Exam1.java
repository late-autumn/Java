package Day02;

import java.io.IOException;

public class Exam1 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

		int Gender ;
		System.out.println("성별을 입력하세요.(남성:1,여성:2):");
		Gender = System.in.read();
		System.out.println((char)Gender=='1'?"당신은 남성입니다":"당신은 여성입니다");
		


		
	}
}
