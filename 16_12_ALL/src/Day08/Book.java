package Day08;

public class Book extends Copy{  //Copy�� ��ӹ޴´�.
	
	//��� ���� ����
	String name;
	String writer;
	int price;
	int nowPage;
	String isbn;
	
	//��� �޼ҵ�
	//������ �Լ�
	public Book(){
		
	}//���� �ε� 
	public Book(int a){
		
	}//�������̵�
	public void bbb() {
		// TODO Auto-generated method stub
		super.bbb();
	}
	public void nextPage(){
		nowPage++;
	}
	public void Print(){
		System.out.println(name+"�� ��µȴ�.");
	}
	
}

class Copy{ //��� ������ Ŭ���� 
	
	public Copy(){
		
	}
	public void bbb(){
		
	}	
}
