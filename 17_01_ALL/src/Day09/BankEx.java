package Day09;

class Account
{
	private String name;
	private long balance;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	public Account(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	//�Ա� ���
	public void deposit(long amount)
	{
		balance += amount;
	}
	public void withdraw(long amount)
	{
		if(balance <amount)
		{
			System.out.println("�ܾ��� �����մϴ�.");
		}
		else
		balance -= amount;
	}
	public void display()
	{
		System.out.println(getName()+"�� ���� �ܰ�� "+getBalance()+"�Դϴ�.");
	}
	
}


public class BankEx {
	public static void main(String[] args) {
		
	}
	
}
