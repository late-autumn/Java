package Day08;

class Salary{

	private int pay;  //이상태에서 source-> generate getter, setter 누르면 이렇게 생성된다.

	public int getPay() {
		return pay;
	}

	public void setPay(int pay, String pass) {
		if(pass.equals("1234"))  //여기서 ; 붙이게 되면 이미 equals 함수가 실행하고 끝나버림으로 올바른 비교가 안된다.
		this.pay = pay;  //현재 클래스에 속한 자기 자신의 변수 
		
	}
}
public class SalaryEx{
public static void main(String[] args)
{
	Salary sal = new Salary();
	sal.setPay(1000, "1234");
	
	int myPay = sal.getPay();
	System.out.println(myPay);
	
}
}