package Day09;

class MyClass
{
	private String name;
	private int age;
	
	public MyClass() {
		// TODO Auto-generated constructor stub
		
		this.name = "�̸� ����";
		this.age = 0;
	}
	public MyClass(String n) {
		// TODO Auto-generated constructor stub
		this.name = n;
	}
	public MyClass(String n,int a) {
		// TODO Auto-generated constructor stub
		this.name = n;
		this.age = a;
	}
	public MyClass(int a,String n) {
		// TODO Auto-generated constructor stub
		this.name = n;
		this.age = a;
	}
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}



public class MyClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass my = new MyClass();
		MyClass my2 = new MyClass("ȫ�浿");
		MyClass my3 = new MyClass("ȫ�浿",24);
		MyClass my4 = new MyClass(64,"������");
		
		System.out.println(my.getName()+","+my.getAge());
		System.out.println(my2.getName()+","+my2.getAge());
		System.out.println(my3.getName()+","+my3.getAge());
		System.out.println(my4.getName()+","+my4.getAge());
		
		
	}

}
