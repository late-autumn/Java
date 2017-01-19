package Day21;

class ATM2{							//ATM�� ���� ������ �����ϴ� Ŭ���� 
	
	private int total;				//������ �� �ݾ�
	public ATM2(int total) {
		// TODO Auto-generated constructor stub
		this.total  = total;
	}
	
	//�Ա�
	void deposit(int amount, String name){
		
		total += amount;
		System.out.println(name+":�Աݱݾ�:"+amount);
		
	}
	//���
	void withdraw(int amount, String name){
		
		if((total-amount)>0){		//��� ������ ����
			total -= amount;
			System.out.println(name+":��ݱݾ�:"+amount);
		}
		else{
			System.out.println(name+"���� �ܾ��� �����Ͽ� ��ݵ����ʾҽ��ϴ�");
		}
	}
	public void getTotal(){
		System.out.println("���� ���� �ܾ���:"+total);
	}
	
	
}

class ATM_USER2 extends Thread{				//ATM ����� ���� ���� Ŭ����
	
	boolean flag = false; 				//�Աݰ� ���
	ATM2 obj;
	
	public ATM_USER2(ATM2 obj, String name) {
		super(name);
		this.obj = obj;
		// TODO Auto-generated constructor stub
	}
	@Override
		public void run() {
			// TODO Auto-generated method stub
		for(int i=0; i< 5;i++){
			try {
				sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			e.printStackTrace();
			}
			//ATM Ŭ������ ����ȭ�� ������ �� �� �ִ� �ڵ� ����
			//�߰�ȣ �������� �Ա��� ����� �� �� ������ ����
			
			synchronized (obj) {
				if(flag){
					obj.deposit((int)(Math.random()*10000), getName());
					obj.getTotal();
				}
				else{
					obj.withdraw((int)(Math.random()*10000), getName());
					obj.getTotal();	
				}
			}//end ����ȭ
			
			flag = !flag;
		}
	
	}
	
	
}

public class ThreadExam7 {

	public static void main(String[] args) {
		
		ATM2 obj = new ATM2(10000);	//���� �ݾ� ����(���¿� ������ ����)
		//������ ���¸� ó����
		
		ATM_USER2 u1 = new ATM_USER2(obj,"��"); 
		ATM_USER2 u2 = new ATM_USER2(obj,"��");
		ATM_USER2 u3 = new ATM_USER2(obj,"��");
		
		u1.start();
		u2.start();
		u3.start();
	}
	
}
