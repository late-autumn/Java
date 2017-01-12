package Day05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam5 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		System.out.println("주민번호 8번째 자리를 입력하세요:");
		int a = Integer.parseInt(br.readLine());
		switch(a)
		{
		case 0:
			System.out.println("당신은 서울 주민이군요");
			break;
		case 1:
			System.out.println("당신은 경기,인천 주민이군요 ");
			break;
		case 2:
			System.out.println("당신은 강원도 주민이군요");
			break;
		case 3:
			System.out.println("당신은 충청북도 주민이군요");
			break;
		case 4:
			System.out.println("당신은 충청남도 주민이군요");
			break;
		case 5:
			System.out.println("당신은 전라북도 주민이군요");
			break;
		case 6:
			System.out.println("당신은 전라남도 주민이군요");
			break;
		case 7:
			System.out.println("당신은 경상북도 주민이군요");
			break;
		case 8:
			System.out.println("당신은 경상남도도 주민이군요");
			break;
		case 9:
			System.out.println("당신은 제주도 주민이군요");
			break;
			default:
				System.out.println("1~9를 벗어난 수를 입력하였습니다.");
		}
	}

}
