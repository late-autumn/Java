package Day12_Machine;

public class TesteCoffee {

	Stock st = new Stock();
	
	void menu(){
		
		//stocktest() �޼ҵ带 ���� ����� ��� Ȯ���ϰ� 
		//��� ���� if�� ����
		if(st.stockTest()){
			//��� �ִٸ� choice()�޼ҵ带 �̿��Ͽ� ���� Ŀ�� ����
			st.choice();
			
			//Ŀ�� ������ ������ ������ ���� ī���͸� ��
			Attribute.deposit -= Attribute.price[6];
			System.out.println("�ֹ��Ͻ� Ŀ�ǰ� ���Խ��ϴ�.");
			System.out.println();
			Attribute.frequency[6]++;			
		}
		else{
			//��� ���ٸ� choice�޼ҵ带 �������� �ʴ´�.
			System.out.println("�˼��մϴ�. ��� �����ϴ�. �����ڿ��� �����ϼ���");
			System.out.println();
		}
	}
	
}
