package Day08;

class Salary{

	private int pay;  //�̻��¿��� source-> generate getter, setter ������ �̷��� �����ȴ�.

	public int getPay() {
		return pay;
	}

	public void setPay(int pay, String pass) {
		if(pass.equals("1234"))  //���⼭ ; ���̰� �Ǹ� �̹� equals �Լ��� �����ϰ� ������������ �ùٸ� �񱳰� �ȵȴ�.
		this.pay = pay;  //���� Ŭ������ ���� �ڱ� �ڽ��� ���� 
		
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