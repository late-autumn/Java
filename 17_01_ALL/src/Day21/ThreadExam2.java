package Day21;

class ThreadEx2 extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			for(int i=0; i<5;i++){
				Thread.sleep(1000);
				System.out.println(i+"번 쓰레드 ");

			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	
	}
}

public class ThreadExam2 {
public static void main(String[] args) {
	
	

	ThreadEx2 t = new ThreadEx2();
	t.start();
	//쓰레드 인스턴스 생성(객체)
	
	try{
		for(int i=0; i<5;i++){
			Thread.sleep(1000);
			System.out.println(i+"번 main 쓰레드 ");
			//main메소드에서 i값을 출력 

		}
	}catch(InterruptedException e){
		e.printStackTrace();
	}
		
}


}
