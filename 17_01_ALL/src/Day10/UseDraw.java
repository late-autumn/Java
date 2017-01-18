package Day10;

abstract class Diagram{
	
	abstract void draw();
	//추상 메소드 반드시 하나는 존재해야한다.
	/*
	 * private로 선언 할 수 없다. => 자식이 오버라이딩 해야하는데 못하기 때문이다.
	 * static으로 선언 할 수 없다 => 객체 없이도 호출이 되는 메서드 이므로 반드시 몸체가 정의 되어야 클래스, 메소드()형식으로 호출됨
	 */
}
class Triangle extends Diagram{ 	//오버라이딩을 해줘야한다!
	
	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("삼각형을 그린다");
	}
}
class Rectangle extends Diagram{
	@Override
	void draw() {
		// TODO Auto-generated method stub
	System.out.println("사각형을 그린다.");	
	}
}
class Circle extends Diagram{
	@Override
	void draw() {
		// TODO Auto-generated method stub
	System.out.println("원을 그린다.");	
	}
	
}
public class UseDraw {
public static void main(String[] args) {
	
	Diagram[] ref =  new Diagram[3];
	ref[0] = new Triangle();
	ref[1] = new Rectangle();
	ref[2] = new Circle();
	
	for(int i=0; i<ref.length;i++)
	{
		ref[i].draw();
	}
}
}
