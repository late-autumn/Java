package Day21;

//스레드 클래스 선언

class ThreadEx extends Thread{
	//쓰레드 클래스를 상속받아서 구현
	//추상 클래스로 정의되어 있는 run 메소드를 반드시 구현, 쓰레드가 시작될때 
	//호출되는 메소드

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
		for(int i=0; i<20;i++){
			Thread.sleep(10);
			System.out.println(i+"번:"+i+"*"+i+"="+(i*i));
		}
		}catch(InterruptedException e){
			//예기치 못한 상황에 대한 예외처리
			e.printStackTrace();
		}
	}
	
}



public class ThreadExam1 {

	public static void main(String[] args) {
		
		ThreadEx t = new ThreadEx();
		t.start();
		
	}
}
