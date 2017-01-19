package Day21;
 
class Slot extends Thread {
	
	//클래스 변수 선언
	int m_nNumber;
	boolean flag;
	
	
	public Slot(String name) {
		// TODO Auto-generated constructor stub
		super(name); //스레드이름
		flag=true;
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//난수를 구하는 메서드 구현
		try
		{
			while(flag){
				m_nNumber=(int)(Math.random()*10);
				//1~10까지의 난수 발생
				Thread.sleep((int)(Math.random()*100));
				//시간도 랜덤으로
			}
			
		}catch(Exception e){
			e.printStackTrace();
			
		}
		
	}
 
	public void setFinish(){
		flag=false;
	}
 
	public int getM_nNumber() {
		return m_nNumber;
	}
	
}
 
public class SlotMachine {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		//스레드 세개 생성
		Slot s1 = new Slot("s1");
		Slot s2 = new Slot("s2");
		Slot s3 = new Slot("s3");
		
		boolean bFlag=true;
		int n1,n2,n3;
		
		//스레드 시작
		s1.start();
		s2.start();
		s3.start();
		
		while(bFlag)
		{
		
			//랜덤으로 얻은 수를 변수에 저장
			n1 = s1.getM_nNumber();
			n2 = s2.getM_nNumber();
			n3 = s3.getM_nNumber();
 
			//출력
			System.out.println(n1+" "+n2+" "+n3);
			
			//세 수가 같은지 확인
			//세 수가 동시에 같으면 당첨
			if(n1 != 0)
			{
				
				if(n1==n2 && n2==n3)
				{
					System.out.println("당첨 되셨습니다!!!");
					bFlag = false; //종료
					s1.setFinish();
					s2.setFinish();
					s3.setFinish();
				}
				
			}
			
		}
		
	}
 
}