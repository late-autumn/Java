package Day12_Machine;


//�޴��� ������ �� �ִ� Ŭ����
public class Menu {
	
	Money mon = new Money(); //Money ��ü(�ν��Ͻ�) ����
	
	void Menu(){
	//�޴��� ������ �Լ� �̿�
		
		char valid = 'x'; 	//��ǰ��� ���¸� �˸��� ����

		do
		{
			//���Ǳ��� �⺻���
			System.out.println("==============================");
			System.out.println("����������������������������MENU������������������������");
			System.out.println("==============================");

			System.out.println("��      <�޴�>\t  <����>\t  <����>  ��");
			
			for(int i=0; i<Attribute.coffee.length;i++){
				
				//�Աݱݾ׿� Ŀ�� ���Ű� �������� Ȯ��
				if(Attribute.deposit >= Attribute.price[i])
					valid = 'o';
				else
					valid = 'x';
				
			System.out.printf("��   %6s[%d]\t%5d��\t\b\b(%c)\t    ��\n",Attribute.coffee[i],(i+1),Attribute.price[i],valid);
				
			}
			
			
			System.out.println();
			
			mon.inmoney();
			
		}while(true);
		
		
		
		
	}
	

}
