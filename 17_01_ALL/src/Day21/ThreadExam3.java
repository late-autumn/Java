package Day21;

class ThreadEx3 extends Thread{
	
	public ThreadEx3(String name) {
		// TODO Auto-generated constructor stub
		super(name);//������ �̸� ���� 
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			for(int i=0; i<5;i++){
				Thread.sleep(1000);
				System.out.println(i+"��"+getName()+" ������ ");
				//�θ� Ŭ������ Thread Ŭ������ getName()�޼ҵ带 �̿��ؼ�
				//super�޼ҵ�� ������ �̸��� �о� �´� 
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
