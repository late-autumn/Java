package Day12_Machine;

public class OriginalCoffee {
	
	Stock st=new Stock();
	
	/*
	 * menu() : ����ڷκ��� ���� �ް� �� �� Ŀ�� ���ñ��� �ְ� ����ڰ� �׸��α� ���Ҷ����� 
	 */
	
	void menu(int n){
		
		//����ڰ� �Է��� ���������� ���� ��� ��� �ݺ�
		if(n>=1 && n<=5)
			n -= 1; //������ ��ȣ�� 1~5���̶�� in�� 1���� �ְ� �ݺ����� ��������
		if(Attribute.deposit < Attribute.price[n])
		{
			
			System.out.println("�ݾ��� �����մϴ�.");
			
		}
		else
		{
			//���õ� Ŀ�ǿ� �ش��ϴ� ��Ḧ ������
			
			String str=st.drop(n);
			
			if(Stock.a==true)
			{
				//�ֹ��� ���� ��� ���(��ǰ)
				Attribute.deposit -= Attribute.price[n];
				Attribute.frequency[n]++;
				//��� �� ���� �ø�
				System.out.print(str);
				
			}
			else
				System.out.print(str);
			System.out.println();
			
		}
	}
}
