package Day09;

class Time{
	private int hour ; // 시간 = 0 ~ 23
	private int minute; //분 = 0~ 59
	private int second; //분 = 0~ 59
	
	//첫번재 생성자
	public Time()
	{
		this(0,0,0);
	}
	//두번째 생성자
	public Time(int h, int m, int s)
	{
		setTime(h,m,s);
	}
	//시간 설정 함수
	public void setTime(int h, int m, int s)
	{
		hour = ((h>=0&&h<24)?h:0); //시간을 구하는
		minute = ((m>=0&&m<60)?m:0); //분을 구하는
		second = ((s>=0&&s<60)?s:0); //초를 구하는
	}
	
	//시 : 분: 초 형식으로 출력
	@Override
	public String toString() {
		return "Time [hour=" + hour + ", minute=" + minute + ", second=" + second + "]";
		//return String.format(~); 으로 할수 있음
	}


	
	
}

public class TimeEx {
public static void main(String[] args) {
	//Time 객체를 생성하고 초기화 한다.
	Time t1 = new Time();
	System.out.println("기본 생성자 호출 후 시간:");
	System.out.println(t1);
	
	//두번째 생성자 호출 
	Time t2 = new Time(15,11,20);
	System.out.println(t2);
	
	//올바르지 않는 시간 설정
	Time t3 = new Time(26,61,99);
	System.out.println(t3);
	
	
	
}
}
