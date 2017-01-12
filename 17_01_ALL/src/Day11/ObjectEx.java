package Day11;

public class ObjectEx {
	
	private String name;
	private int price;
	

	
	public ObjectEx(String name, int price) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.price = price;
	}
	
	
public static void main(String[] args) {
	ObjectEx t1 = new ObjectEx("1", 1);
	ObjectEx t2 = new ObjectEx("1", 1);
	System.out.println("t1:"+t1.toString());
	System.out.println("t2:"+t2.toString());	
	System.out.println("t1.hashCode:"+t1.hashCode());
	System.out.println("t2.hashCode:"+t2.hashCode());
	System.out.println("t1과 t2가 같은가?"+t1.equals(t2));
	
	
}
}
