package Day21;

class ThreadEx5 extends Thread {

	int m_iRandomNum;

	public ThreadEx5(String name) {
		// TODO Auto-generated constructor stub
		super(name);// Thread�� �̸� ����

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for (int i = 0; i < 5; i++) {
				Thread.sleep(100);
				m_iRandomNum = (int) (Math.random() * 1000); // MathŬ������ random �޼ҵ带 �̿��ؼ� ��������
				System.out.println(getName() + ":" + m_iRandomNum);

			}

		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}

	}// end method

}// end class

public class ThreadExam5 {

	public static void main(String[] args) {

		
		ThreadEx5 t1 = new ThreadEx5("ù��°");
		ThreadEx5 t2 = new ThreadEx5("�ι�°");
		ThreadEx5 t3 = new ThreadEx5("����°");
		System.out.println("�� �������� �������� ����Ѵ�.");
		t1.start();
		t2.start();
		t3.start();
		
		
	}// end main
}// end class
