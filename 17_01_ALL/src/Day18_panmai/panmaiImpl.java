package Day18_panmai;

import java.util.*;


public class panmaiImpl implements Panmai {

	//��ǰ ����
	
	private Map<String, ProductVO> product = new HashMap<>();
	
	//�Ǹ���Ȳ
	
	private List<SaleVO> sale = new ArrayList<>();
	
	Scanner sc = new Scanner(System.in);
	
	
	@Override
	public void insertProduct() {
		//��ǰ ���
		String code;
		ProductVO pvo = new ProductVO();
		System.out.println("��ǰ���");
		System.out.print("�ڵ� �Է�:");
		code = sc.nextLine();
		
		if(product.containsKey(code)){
			System.out.println("�̹� ��ϵ� �ڵ��Դϴ�.");
			return;
		}

		
		System.out.println("��ǰ��:");
		pvo.setPname(sc.nextLine());
		
		System.out.println("�ܰ�:");
		pvo.setPrice(sc.nextInt());
		
		System.out.println("����:");
		pvo.setQuantity(sc.nextInt());
		
		
		product.put(code, pvo);
		System.out.println();
	}

	@Override
	public void insertQuantity() {
		// ��ǰ ���� ���
		String code;
		System.out.println("��ǰ ���� ���");
		System.out.print("��ǰ �ڵ�:");
		code = sc.nextLine();
		
		if(! product.containsKey(code)){
			
			System.out.println("��ϵ��� ���� �ڵ��Դϴ�.");
			return;
		}
		int su;
		ProductVO pvo = product.get(code);
		
		System.out.println("��ǰ��:"+pvo.getPname());
		System.out.println("����:");
		su = sc.nextInt();
		
		pvo.setQuantity(pvo.getQuantity()+su);
		
	}

	@Override
	public void searchProduct() {
		// ��ǰ �ڵ� ��ȸ
		String code;
		System.out.println("��ǰ �ڵ� ��ȸ");
		System.out.print("��ǰ�ڵ�:");
		code = sc.nextLine();
		
		System.out.println("�ڵ�\t\t ��ǰ��\t\t �ܰ�\t\t����");
		
		if(product.containsKey(code)){
			ProductVO pvo = product.get(code);
			System.out.println(code+"\t\t"+pvo.getPname()+"\t\t"+pvo.getPrice()+"\t\t"+pvo.getQuantity());
		}
		System.out.println();
	}

	@Override
	public void listProduct() {
		// ��ǰ ��ü ����Ʈ
		System.out.println("��ǰ ��ü ����Ʈ");
		System.out.println("�ڵ�\t\t ��ǰ�� \t\t �ܰ� \t\t ����");
		System.out.println("-----------------------------------");
		
		Iterator<String> it = product.keySet().iterator();
		
		while(it.hasNext()){
			
			String code = it.next();
			ProductVO pvo = product.get(code);
			System.out.println(code+"\t\t"+pvo.getPname()+"\t\t"+pvo.getPrice()
			+"\t\t"+pvo.getQuantity()+"\t\t");
			
		}//end while
		System.out.println();
	}

	@Override
	public void insertSale() {
		// �Ǹ�
		
		String code;
		System.out.println("\t\t");
		System.out.print("��ǰ�ڵ�:");
		code = sc.nextLine();
		
		if(!product.containsKey(code)){
			System.out.println("��ϵ������� ��ǰ�Դϴ�.");
			return;
		}
		ProductVO pvo = product.get(code);
		System.out.println();
		System.out.println("��ǰ��:"+pvo.getPname()+",���� ����:"+pvo.getQuantity());
		
		SaleVO svo = new SaleVO();
		svo.setCode(code);
		
		System.out.print("\t���� :");
		svo.setSname(sc.nextLine());
		System.out.print("\t����� :");
		svo.setCreated(sc.nextLine());
		
		int quantity = sc.nextInt();	//�Ǹż���

		//�Ǹŷ��� ����� ���Ѵ�.
		//�Ǹŷ��� ������� ���� ���� ����.
		if(quantity>pvo.getQuantity()){
			System.out.println("�Ǹŷ��� ������� ���� ���� ����.");
			return;
		}
		
		//��� ����
		pvo.setQuantity(pvo.getQuantity()-quantity);
		svo.setQuantity(quantity);

		//����Ʈ�� ���
		
		sale.add(svo);
		System.out.println();
		
		
	}//end method

	@Override
	public void searchSale() {
		//��ǰ������ �Ǹ���Ȳ ��ȸ
		String pname;
		System.out.println("�Ǹŵ� ��ǰ�� ��ȸ:");
		
		System.out.print("�˻��� ��ǰ��: ");
		pname = sc.nextLine();
		
		System.out.println("�ڵ�\t\t ��ǰ��\t\t����\t\t�Ǹ�����\t\t�ܰ�\t\t ����\t\t�ݾ�");
		System.out.println("-------------------------------------------");
		Iterator<SaleVO> it = sale.iterator();
		
		while(it.hasNext()){
			
			SaleVO svo = it.next();
			ProductVO pvo = product.get(svo.getCode());
			
			if(!pvo.getPname().startsWith(pname))
				continue;
			System.out.println(svo.getCode()+"\t\t"
					+pvo.getPname()+"\t\t"
					+svo.getSname()+"\t\t"
					+svo.getCreated()+"\t\t"
					+pvo.getPrice()+"\t\t"
					+svo.getQuantity()*pvo.getPrice());
			
		}//end while
		
	}

	@Override
	public void listSale() {
		// ��ü�Ǹ� ����Ʈ
		System.out.println("\t\t��ü�ǸŸ���Ʈ");

		System.out.println("�ڵ�\t\t ��ǰ��\t\t����\t\t�Ǹ�����\t\t�ܰ�\t\t ����\t\t�ݾ�");
		System.out.println("-------------------------------------------");
		
		
		Iterator<SaleVO> it = sale.iterator();
		while(it.hasNext()){
			
			SaleVO svo = it.next();
			ProductVO pvo = product.get(svo.getCode());
			System.out.println(svo.getCode()+"\t\t"
			+pvo.getPname()+"\t\t"
			+svo.getSname()+"\t\t"
			+svo.getCreated()+"\t\t"
			+pvo.getPrice()+"\t\t"
			+svo.getQuantity()+"\t\t"
			+(svo.getQuantity()*pvo.getPrice()));
				
		}//end while
		System.out.println();
	}
	
	
}