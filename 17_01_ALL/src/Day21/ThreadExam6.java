package Day21;

class Data{
	//두 스레드가 공유할 수 있는 클래스 정의
	
	int m_iRandomNum = 0; 			//두 스레드가 접근 할 수 있는 필드 정의
									//정의된 필드 값을 설정하거나 읽어오는 메소드 정의

	public int getM_iRandomNum() {
		return m_iRandomNum;								//랜덤값을 리턴함
	}

	public void setM_iRandomNum() {
		this.m_iRandomNum = (int)(Math.random()*1000);		//랜덤으로 값을 설정
	}
	
}

class Thread_Ex6_1 extends Thread{
	Data m_RandomNum;										//공유 데이터를 스레드의 필드로 선언
	
	public Thread_Ex6_1(Data RandomNum, String name) {
		super(name);										//첫번째 스레드 
		m_RandomNum = RandomNum;
	}
	
	@Override
	public void run() {										//공유된 변수값을 내부필드에 저장 
		
		try {
			for(int i=0; i<5; i++){
			Thread.sleep(1000);
			m_RandomNum.setM_iRandomNum();
				System.out.println(getName()+":"+m_RandomNum.getM_iRandomNum());
			}
						
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
}
class Thread_Ex6_2 extends Thread{
	Data m_RandomNum;										//공유 데이터를 스레드의 필드로 선언
	
	public Thread_Ex6_2(Data RandomNum, String name) {
		super(name);										//두번째 스레드 
		m_RandomNum = RandomNum;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int i=0; i<5;i++){
				Thread.sleep(1000);
				System.out.println(getName()+":"+(m_RandomNum.getM_iRandomNum()+10));
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

public class ThreadExam6 {

	public static void main(String[] args) {
		
		Data RData = new Data();			//공유 변수를 위한 클래스 인스턴스 생성
		
		Thread t1 = new Thread_Ex6_1(RData, "생성자");
		Thread t2 = new Thread_Ex6_2(RData,"소비자");
		t1.start();
		t2.start();
		
		
	}
}
