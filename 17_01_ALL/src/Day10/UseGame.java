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
		System.out.println("마린의 위치 좌표는 "+x+","+y+"입니다.");
		this.x  = x;
		this.y = y;
	}
	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("마린이 대기실에서 대기 상태에 있습니다.");
		
	}
	@Override
	void message() {
		// TODO Auto-generated method stub
		System.out.println("Message : go go go");
	}
	void stimPack(){
		System.out.println("마린이 스팀팩을 사용하였다.");
	}
}

class SiegeTank extends Unit
{
	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("탱크의 위치 좌표는 "+x+","+y+"입니다.");
	}
	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("시즈탱크가 대기 상태에 있습니다.");
	}
	@Override
	void message() {
		// TODO Auto-generated method stub
		System.out.println("yes sir~!");
	}
	void changeMode(){
		System.out.println("탱크가 모드를 변경합니다.");
	}
	
}
class Dropship extends Unit
{
	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("드랍쉽의 위치 좌표는 "+x+","+y+"입니다.");
	}
	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("드랍쉽이 대기 상태에 있습니다.");
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
