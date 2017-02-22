package Day09;

class ThisEx
{
	String name,jumin,tel;
	
	public ThisEx() {
		// TODO Auto-generated constructor stub
		this.name = "Guest";
		this.jumin = "12346-1234567";
		this.tel = "010-111-1111";
	}
	public ThisEx(String name)
	{
		this(); //현재 객체의 생성자 
		this.name = name;
	}
	public ThisEx(String name, String jumin)
	{
		this(name); 
		this.jumin = jumin;
	}
	public ThisEx(String name, String jumin,String tel)
	{
		this(name,jumin);
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public String getJumin() {
		return jumin;
	}
	public String getTel() {
		return tel;
	}
}


public class ThisEx1 {
public static void main(String[] args) {
	
	ThisEx ex = new ThisEx();
	ThisEx ex1 = new ThisEx("이름1");
	ThisEx ex2 = new ThisEx("이름2","나이");
	ThisEx ex3 = new ThisEx("이름3","나이","번호");
	
	System.out.println(ex.getName()+","+ex.getJumin()+","+ex.getTel());
	System.out.println(ex1.getName()+","+ex1.getJumin()+","+ex1.getTel());
	System.out.println(ex2.getName()+","+ex2.getJumin()+","+ex2.getTel());
	System.out.println(ex3.getName()+","+ex3.getJumin()+","+ex3.getTel());
}
}
