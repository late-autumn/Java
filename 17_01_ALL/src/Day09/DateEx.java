package Day09;

class Date{
	private int year;
	private String month;
	private int day;
	
	public Date() {//�⺻ ������
		// TODO Auto-generated constructor stub
		month = "1��";
		day = 1;
		year = 2017;
	}
	
	public Date(int year)
	{
		setDate(year, "1��", 1);
	}
	
	public Date(int year, String month, int day)
	{
		month = "1��";		//this ���� ���� �ȵȴ�.  
		this.day = 1;
		this.year = 2017;
	}
	
	public void setDate(int year, String month, int day)
	{
		this.year = year;
		this.month = month;
		this.day = day;
	}

	@Override
	public String toString() {
		return "Date [year=" + year + ", month=" + month + ", day=" + day + "]";
	}
	
	
}


public class DateEx {
public static void main(String[] args) {
	Date d1 = new Date();
	Date d2 = new Date(2017,"1��",1);
	Date d3 = new Date(2017);
	System.out.println(d1);
	System.out.println(d2);
	System.out.println(d3);
	
}
}
