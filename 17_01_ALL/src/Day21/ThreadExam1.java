package Day21;

//������ Ŭ���� ����

class ThreadEx extends Thread{
	//������ Ŭ������ ��ӹ޾Ƽ� ����
	//�߻� Ŭ������ ���ǵǾ� �ִ� run �޼ҵ带 �ݵ�� ����, �����尡 ���۵ɶ� 
	//ȣ��Ǵ� �޼ҵ�

	
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
	}
	
}



public class ThreadExam1 {

	public static void main(String[] args) {
		
		ThreadEx t = new ThreadEx();
		t.start();
		
	}
}
