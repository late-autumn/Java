package Day21;

class Data{
	//�� �����尡 ������ �� �ִ� Ŭ���� ����
	
	int m_iRandomNum = 0; 			//�� �����尡 ���� �� �� �ִ� �ʵ� ����
									//���ǵ� �ʵ� ���� �����ϰų� �о���� �޼ҵ� ����

	public int getM_iRandomNum() {
		return m_iRandomNum;								//�������� ������
	}

	public void setM_iRandomNum() {
		this.m_iRandomNum = (int)(Math.random()*1000);		//�������� ���� ����
	}
	
}

class Thread_Ex6_1 extends Thread{
	Data m_RandomNum;										//���� �����͸� �������� �ʵ�� ����
	
	public Thread_Ex6_1(Data RandomNum, String name) {
		super(name);										//ù��° ������ 
		m_RandomNum = RandomNum;
	}
	
	@Override
	public void run() {										//������ �������� �����ʵ忡 ���� 
		
		try {
			for(int i=0; i<5; i++){
			Thread.sleep(1000);
			m_RandomNum.setM_iRandomNum();
				System.out.println(getName()+":"+m_RandomNum.getM_iRandomNum());
			}
						
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
}
class Thread_Ex6_2 extends Thread{
	Data m_RandomNum;										//���� �����͸� �������� �ʵ�� ����
	
	public Thread_Ex6_2(Data RandomNum, String name) {
		super(name);										//�ι�° ������ 
		m_RandomNum = RandomNum;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int i=0; i<5;i++){
				Thread.sleep(1000);
				System.out.println(getName()+":"+(m_RandomNum.getM_iRandomNum()+10));
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

public class ThreadExam6 {

	public static void main(String[] args) {
		
		Data RData = new Data();			//���� ������ ���� Ŭ���� �ν��Ͻ� ����
		
		Thread t1 = new Thread_Ex6_1(RData, "������");
		Thread t2 = new Thread_Ex6_2(RData,"�Һ���");
		t1.start();
		t2.start();
		
		
	}
}
