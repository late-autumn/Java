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
		this(x); 		//������ �Լ��� ����Ű�� �ִ�. = PointEx(int x)!! ���� this.x = x�� ���ص� �Ǵ� ����! 		
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
	
	public void display(){ //����Լ�
		System.out.println("x�� ��:"+x );
		System.out.println("y�� ��:"+y );
		
	}

}

public class SuerEx2 extends PointEx{

	private int r;
	public SuerEx2() {
		// TODO Auto-generated constructor stub
	}
	public SuerEx2(int x) {
		super(x);			//x��� �긦 �޾ƿԱ⶧����
		r = 1;
	}
	public SuerEx2(int x,int y) {
		super(x,y);			//x��� �긦 �޾ƿԱ⶧����
		r = 2;
	}
	public SuerEx2(int x,int y, int r) {
		super(x,y);			//x��� �긦 �޾ƿԱ⶧����
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
		System.out.println("r�� ��:"+r);
	}
	
	
	
	
	
	public static void main(String[] args) {
		SuerEx2 su = new SuerEx2();
		SuerEx2 su2 = new SuerEx2(1,2,5);
		su.display();
		su2.display();
	}
}
