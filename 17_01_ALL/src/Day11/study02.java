package Day11;

class Rectangle{
	
	private int x1=1,x2=1,y1=2,y2=2;
	int result=0;
	static int count;
	
	
	
	
	public Rectangle() {
		count++;
		
	}
	public Rectangle(int x1, int x2, int y1, int y2) {
		// TODO Auto-generated constructor stub
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
		count++;
	}
	
	int square()
	{
		result  =(y1-x1)*(y2-x2); 
		return result;
	}
	void show()
	{
		System.out.println("사각형의 좌표:("+x1+","+x2+"),("+y1+","+y2+")");
		System.out.println("사각형의 넓이:"+square());
		System.out.println("사각형 만들어진 갯수:"+count);

	}
	void set(int x1, int y1, int x2, int y2)
	{
		this.x1 = x1;
		this.y1 = x2;
		this.x2 = y1;
		this.y2 = y2;
	}
	
}

public class study02 {
public static void main(String[] args) {
	Rectangle r1 = new Rectangle();
	
	System.out.println("r1의 정보");
	r1.show();
	
	Rectangle r2 = new Rectangle(1,1,3,3);
	System.out.println("r2의 정보");
	r2.show();
	
	r1.set(4,4,1,1);
	System.out.println("변경된 r1의 정보");
	r1.show();
	
	
}
}
