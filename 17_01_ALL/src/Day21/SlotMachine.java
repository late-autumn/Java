package Day21;
 
class Slot extends Thread {
	
	//Ŭ���� ���� ����
	int m_nNumber;
	boolean flag;
	
	
	public Slot(String name) {
		// TODO Auto-generated constructor stub
		super(name); //�������̸�
		flag=true;
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//������ ���ϴ� �޼��� ����
		try
		{
			while(flag){
				m_nNumber=(int)(Math.random()*10);
				//1~10������ ���� �߻�
				Thread.sleep((int)(Math.random()*100));
				//�ð��� ��������
			}
			
		}catch(Exception e){
			e.printStackTrace();
			
		}
		
	}
 
	public void setFinish(){
		flag=false;
	}
 
	public int getM_nNumber() {
		return m_nNumber;
	}
	
}
 
public class SlotMachine {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		//������ ���� ����
		Slot s1 = new Slot("s1");
		Slot s2 = new Slot("s2");
		Slot s3 = new Slot("s3");
		
		boolean bFlag=true;
		int n1,n2,n3;
		
		//������ ����
		s1.start();
		s2.start();
		s3.start();
		
		while(bFlag)
		{
		
			//�������� ���� ���� ������ ����
			n1 = s1.getM_nNumber();
			n2 = s2.getM_nNumber();
			n3 = s3.getM_nNumber();
 
			//���
			System.out.println(n1+" "+n2+" "+n3);
			
			//�� ���� ������ Ȯ��
			//�� ���� ���ÿ� ������ ��÷
			if(n1 != 0)
			{
				
				if(n1==n2 && n2==n3)
				{
					System.out.println("��÷ �Ǽ̽��ϴ�!!!");
					bFlag = false; //����
					s1.setFinish();
					s2.setFinish();
					s3.setFinish();
				}
				
			}
			
		}
		
	}
 
}