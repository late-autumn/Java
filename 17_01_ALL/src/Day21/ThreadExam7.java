package Day21;

class ATM2{							//ATM의 계좌 정보를 관리하는 클래스 
	
	private int total;				//계좌의 총 금액
	public ATM2(int total) {
		// TODO Auto-generated constructor stub
		this.total  = total;
	}
	
	//입금
	void deposit(int amount, String name){
		
		total += amount;
		System.out.println(name+":입금금액:"+amount);
		
	}
	//출금
	void withdraw(int amount, String name){
		
		if((total-amount)>0){		//출금 가능한 조건
			total -= amount;
			System.out.println(name+":출금금액:"+amount);
		}
		else{
			System.out.println(name+"님의 잔액이 부족하여 출금되지않았습니다");
		}
	}
	public void getTotal(){
		System.out.println("현재 계좌 잔액은:"+total);
	}
	
	
}

class ATM_USER2 extends Thread{				//ATM 사용자 관련 선언 클래스
	
	boolean flag = false; 				//입금과 출금
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
			//ATM 클래스에 동기화를 유지해 줄 수 있는 코드 삽입
			//중괄호 내에서는 입금중 출금을 할 수 없도록 구현
			
			synchronized (obj) {
				if(flag){
					obj.deposit((int)(Math.random()*10000), getName());
					obj.getTotal();
				}
				else{
					obj.withdraw((int)(Math.random()*10000), getName());
					obj.getTotal();	
				}
			}//end 동기화
			
			flag = !flag;
		}
	
	}
	
	
}

public class ThreadExam7 {

	public static void main(String[] args) {
		
		ATM2 obj = new ATM2(10000);	//공유 금액 설정(계좌에 만원이 있음)
		//세명의 계좌를 처리함
		
		ATM_USER2 u1 = new ATM_USER2(obj,"무"); 
		ATM_USER2 u2 = new ATM_USER2(obj,"스");
		ATM_USER2 u3 = new ATM_USER2(obj,"비");
		
		u1.start();
		u2.start();
		u3.start();
	}
	
}
