package Day21;

class ThreadEx2 extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			for(int i=0; i<5;i++){
				Thread.sleep(1000);
				System.out.println(i+"�� ������ ");

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
	//������ �ν��Ͻ� ����(��ü)
	
	try{
		for(int i=0; i<5;i++){
			Thread.sleep(1000);
			System.out.println(i+"�� main ������ ");
			//main�޼ҵ忡�� i���� ��� 

		}
	}catch(InterruptedException e){
		e.printStackTrace();
	}
		
}


}
