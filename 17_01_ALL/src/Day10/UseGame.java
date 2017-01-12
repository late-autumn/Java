package Day10;

abstract class Unit
{
	int x;
	int y;
	
	 abstract void move(int x, int y);
	 abstract void stop();
	 abstract void message(); 
	
}

class Marine extends Unit
{
	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("������ ��ġ ��ǥ�� "+x+","+y+"�Դϴ�.");
		this.x  = x;
		this.y = y;
	}
	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("������ ���ǿ��� ��� ���¿� �ֽ��ϴ�.");
		
	}
	@Override
	void message() {
		// TODO Auto-generated method stub
		System.out.println("Message : go go go");
	}
	void stimPack(){
		System.out.println("������ �������� ����Ͽ���.");
	}
}

class SiegeTank extends Unit
{
	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("��ũ�� ��ġ ��ǥ�� "+x+","+y+"�Դϴ�.");
	}
	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("������ũ�� ��� ���¿� �ֽ��ϴ�.");
	}
	@Override
	void message() {
		// TODO Auto-generated method stub
		System.out.println("yes sir~!");
	}
	void changeMode(){
		System.out.println("��ũ�� ��带 �����մϴ�.");
	}
	
}
class Dropship extends Unit
{
	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("������� ��ġ ��ǥ�� "+x+","+y+"�Դϴ�.");
	}
	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("������� ��� ���¿� �ֽ��ϴ�.");
	}
	@Override
	void message() {
		// TODO Auto-generated method stub
		System.out.println("Can I take orders");
	}
}


public class UseGame {
public static void main(String[] args) {
	
	Unit[] ref = new Unit[3];
	ref[0] = new Marine();
	ref[1] = new SiegeTank();
	ref[2] = new Dropship();

	Marine mr = new Marine();
	mr.stimPack();
	for(int i=0; i<ref.length;i++)
	{
		System.out.println("===============================");
		ref[i].move(100, 200);
		ref[i].message();
		ref[i].stop();
		System.out.println("===============================");
	}
	
	
}
}
