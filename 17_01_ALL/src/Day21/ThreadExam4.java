package Day21;

//runnable 인터페이스를 상속받아 스레드 클래스 정의 

class ThreadEx4 implements Runnable{
	
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
		
	}//end method
	
}

public class ThreadExam4 {

	public static void main(String[] args) {
		
		
		ThreadEx4 ex1 = new ThreadEx4();
		
		//Runnable 인터페이스 인스턴스 생성 
		//여기서 ex1에겐 start()가 없다. 인터페이스를 받아왔기 때문이다.
		//객체가 생성된 인터페이스를 Thread클래스를 이용해서 다시 인스턴스를 생성한 다음
		//시작 메소드를 호출한다.
		Thread ex2 = new Thread(ex1);
		ex2.start();
		
	}
}
