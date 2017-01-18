package Day11;


public class CircleExam {
public static void main(String[] args) {
	
	Circle cr = new Circle();		//객체 = 인스턴스 생성 
	cr.input();						//입력 메소드 호출
	double a = cr.area();			//넓이 구하는 메소드 호출
	double b = cr.length();			//둘레 구하는 메소드 호출
	cr.display(a, b);
}
}
