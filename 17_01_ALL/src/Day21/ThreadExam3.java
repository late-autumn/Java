package Day21;

class ThreadEx3 extends Thread{
	
	public ThreadEx3(String name) {
		// TODO Auto-generated constructor stub
		super(name);//스레드 이름 지정 
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			for(int i=0; i<5;i++){
				Thread.sleep(1000);
				System.out.println(i+"번"+getName()+" 쓰레드 ");
				//부모 클래스인 Thread 클래스의 getName()메소드를 이용해서
				//super메소드로 저장한 이름을 읽어 온다 
			}

		}catch(InterruptedException e){
			e.printStackTrace();
		}
	
	}
}

public class ThreadExam3 {

	public static void main(String[] args) {
		
		ThreadEx3 t1 = new ThreadEx3("1");
		ThreadEx3 t2 = new ThreadEx3("2");
		ThreadEx3 t3 = new ThreadEx3("3");

		t1.start();
		t2.start();
		t3.start();
		
	} 
	
	
	
}
