package Day09;

class Time{
	private int hour ; // �ð� = 0 ~ 23
	private int minute; //�� = 0~ 59
	private int second; //�� = 0~ 59
	
	//ù���� ������
	public Time()
	{
		this(0,0,0);
	}
	//�ι�° ������
	public Time(int h, int m, int s)
	{
		setTime(h,m,s);
	}
	//�ð� ���� �Լ�
	public void setTime(int h, int m, int s)
	{
		hour = ((h>=0&&h<24)?h:0); //�ð��� ���ϴ�
		minute = ((m>=0&&m<60)?m:0); //���� ���ϴ�
		second = ((s>=0&&s<60)?s:0); //�ʸ� ���ϴ�
	}
	
	//�� : ��: �� �������� ���
	@Override
	public String toString() {
		return "Time [hour=" + hour + ", minute=" + minute + ", second=" + second + "]";
		//return String.format(~); ���� �Ҽ� ����
	}


	
	
}

public class TimeEx {
public static void main(String[] args) {
	//Time ��ü�� �����ϰ� �ʱ�ȭ �Ѵ�.
	Time t1 = new Time();
	System.out.println("�⺻ ������ ȣ�� �� �ð�:");
	System.out.println(t1);
	
	//�ι�° ������ ȣ�� 
	Time t2 = new Time(15,11,20);
	System.out.println(t2);
	
	//�ùٸ��� �ʴ� �ð� ����
	Time t3 = new Time(26,61,99);
	System.out.println(t3);
	
	
	
}
}
