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
	
	//입급 기능
	public void deposit(long amount)
	{
		balance += amount;
	}
	public void withdraw(long amount)
	{
		if(balance <amount)
		{
			System.out.println("잔액이 부족합니다.");
		}
		else
		balance -= amount;
	}
	public void display()
	{
		System.out.println(getName()+"의 남은 잔고는 "+getBalance()+"입니다.");
	}
	
}


public class BankEx {
	public static void main(String[] args) {
		
	}
	
}
