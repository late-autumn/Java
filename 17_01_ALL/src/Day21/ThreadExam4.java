package Day21;

//runnable �������̽��� ��ӹ޾� ������ Ŭ���� ���� 

class ThreadEx4 implements Runnable{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			for(int i=0; i<20;i++){
				Thread.sleep(10);
				System.out.println(i+"��:"+i+"*"+i+"="+(i*i));
			}
			}catch(InterruptedException e){
				//����ġ ���� ��Ȳ�� ���� ����ó��
				e.printStackTrace();
			}
		
	}//end method
	
}

public class ThreadExam4 {

	public static void main(String[] args) {
		
		
		ThreadEx4 ex1 = new ThreadEx4();
		
		//Runnable �������̽� �ν��Ͻ� ���� 
		//���⼭ ex1���� start()�� ����. �������̽��� �޾ƿԱ� �����̴�.
		//��ü�� ������ �������̽��� ThreadŬ������ �̿��ؼ� �ٽ� �ν��Ͻ��� ������ ����
		//���� �޼ҵ带 ȣ���Ѵ�.
		Thread ex2 = new Thread(ex1);
		ex2.start();
		
	}
}
