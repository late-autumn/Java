package Day12_Machine;

import java.util.*;

//��� ������ ���ִ� Ŭ����
public class Stock {
	
	Scanner sc=new Scanner(System.in);
	static boolean a;
	
	//���� �ִ� 2���� �̿��� �� �ִ� ���� Ŀ���� ��� Ȯ���ϴ� �޼���
	
	boolean stockTest(){
		
		a=true;
		
		for(int i=0; i<5; i++){
			
			a = Attribute.amount[i] >= 2;
			if(a == false)
				return a;

		}
		
		return a;
	}
	
	
	// ��ᰡ ������ �ִ� �������� ����Ŀ���� ��� Ȯ���ϴ� �޼���
	// �Ű����� in�� Ŀ���� ��ȣ
	
	boolean stockTest(int in){
		
		for(int i=0; i<Attribute.mat_amou[in].length; i++){
			
			if(Attribute.amount[i]>=Attribute.mat_amou[in][i])
				a=true;
			else{
				a=false;
				return a;
			}
			
		}
	
		return a;	
		
		}
		
	//drop�� �Ҷ� stockTest �޼��带 ���� ��� Ȯ���ϰ�
	//��� �������� �������� ������ �ٸ�����
		
	String drop(int in){
		
		 if(stockTest(in)==false)
			 return "�˼��մϴ�. ��ᰡ �����ϴ�. �����ڿ��� ���� �ٶ�!!!";
		 
		 else
		 {
			 
			 for(int i=0; i<Attribute.mat_amou[in].length; i++)
				 Attribute.amount[i] -= Attribute.mat_amou[in][i];
			 
		 }
		 
		 return Attribute.coffee[in]+"Ŀ�ǰ� ���Ծ�� ���ְ� �弼��^^";
		
	}
	
	
	void choice(){
		
		int[] sel = {0,0,0,0,0,1};
		System.out.println("�� ���� 2������ �����մϴ�.");
		
		for(int i=0; i<Attribute.amount.length-1; i++)
		{
			
			System.out.printf("%s:",Attribute.material[i]);
			sel[i]=sc.nextInt();
			
			if(sel[i]>2)
			{
				
				System.out.println(Attribute.material[i]+"��ᰡ 2�� �ѽ��ϴ�.");
				System.out.println("�ٽ� �����ϼ��� !!");
				System.out.println();
				
				i--;
				continue;
				
			}else
			{
				
				Attribute.amount[i] -= sel[i];
				
			}
			
			Attribute.amount[5] -= sel[5];
			
		}
		
		
		
	}
	
		
	}
	
	
	
	
	
	
	
	


