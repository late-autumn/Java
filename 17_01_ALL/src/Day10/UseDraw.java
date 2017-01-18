package Day10;

abstract class Diagram{
	
	abstract void draw();
	//�߻� �޼ҵ� �ݵ�� �ϳ��� �����ؾ��Ѵ�.
	/*
	 * private�� ���� �� �� ����. => �ڽ��� �������̵� �ؾ��ϴµ� ���ϱ� �����̴�.
	 * static���� ���� �� �� ���� => ��ü ���̵� ȣ���� �Ǵ� �޼��� �̹Ƿ� �ݵ�� ��ü�� ���� �Ǿ�� Ŭ����, �޼ҵ�()�������� ȣ���
	 */
}
class Triangle extends Diagram{ 	//�������̵��� ������Ѵ�!
	
	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("�ﰢ���� �׸���");
	}
}
class Rectangle extends Diagram{
	@Override
	void draw() {
		// TODO Auto-generated method stub
	System.out.println("�簢���� �׸���.");	
	}
}
class Circle extends Diagram{
	@Override
	void draw() {
		// TODO Auto-generated method stub
	System.out.println("���� �׸���.");	
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
