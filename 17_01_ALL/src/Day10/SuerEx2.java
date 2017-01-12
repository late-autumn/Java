package Day10;
class PointEx{
	
	private int x;
	private int y;
	
	public PointEx() {
		// TODO Auto-generated constructor stub
		
	}
	public PointEx(int x) {
		// TODO Auto-generated constructor stub
		this.x = x;
	}
	
	public PointEx(int x,int y) {
		this(x); 		//생성자 함수를 가르키고 있다. = PointEx(int x)!! 굳이 this.x = x를 안해도 되는 장점! 		
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void display(){ //출력함수
		System.out.println("x의 값:"+x );
		System.out.println("y의 값:"+y );
		
	}

}

public class SuerEx2 extends PointEx{

	private int r;
	public SuerEx2() {
		// TODO Auto-generated constructor stub
	}
	public SuerEx2(int x) {
		super(x);			//x라는 얘를 받아왔기때문에
		r = 1;
	}
	public SuerEx2(int x,int y) {
		super(x,y);			//x라는 얘를 받아왔기때문에
		r = 2;
	}
	public SuerEx2(int x,int y, int r) {
		super(x,y);			//x라는 얘를 받아왔기때문에
		this.r = r;
	}
	
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	
	public void display(){
		super.display();
		System.out.println("r의 값:"+r);
	}
	
	
	
	
	
	public static void main(String[] args) {
		SuerEx2 su = new SuerEx2();
		SuerEx2 su2 = new SuerEx2(1,2,5);
		su.display();
		su2.display();
	}
}
