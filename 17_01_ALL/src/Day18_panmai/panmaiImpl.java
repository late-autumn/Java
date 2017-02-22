package Day18_panmai;

import java.util.*;


public class panmaiImpl implements Panmai {

	//상품 정보
	
	private Map<String, ProductVO> product = new HashMap<>();
	
	//판매현황
	
	private List<SaleVO> sale = new ArrayList<>();
	
	Scanner sc = new Scanner(System.in);
	
	
	@Override
	public void insertProduct() {
		//상품 등록
		String code;
		ProductVO pvo = new ProductVO();
		System.out.println("상품등록");
		System.out.print("코드 입력:");
		code = sc.nextLine(); 
		
		if(product.containsKey(code)){
			System.out.println("이미 등록된 코드입니다.");
			return;
		}

		
		System.out.println("상품명:");
		pvo.setPname(sc.nextLine());
		
		System.out.println("단가:");
		pvo.setPrice(sc.nextInt());
		
		System.out.println("수량:");
		pvo.setQuantity(sc.nextInt());
		
		
		product.put(code, pvo);
		System.out.println();
	}

	@Override
	public void insertQuantity() {
		// 상품 수량 등록
		String code;
		System.out.println("상품 수량 등록");
		System.out.print("상품 코드:");
		code = sc.nextLine();
		
		if(! product.containsKey(code)){
			
			System.out.println("등록되지 않은 코드입니다.");
			return;
		}
		int su;
		ProductVO pvo = product.get(code);
		
		System.out.println("상품명:"+pvo.getPname());
		System.out.println("수량:");
		su = sc.nextInt();
		
		pvo.setQuantity(pvo.getQuantity()+su);
		
	}

	@Override
	public void searchProduct() {
		// 상품 코드 조회
		String code;
		System.out.println("상품 코드 조회");
		System.out.print("상품코드:");
		code = sc.nextLine();
		
		System.out.println("코드\t\t 상품명\t\t 단가\t\t수량");
		
		if(product.containsKey(code)){
			ProductVO pvo = product.get(code);
			System.out.println(code+"\t\t"+pvo.getPname()+"\t\t"+pvo.getPrice()+"\t\t"+pvo.getQuantity());
		}
		System.out.println();
	}

	@Override
	public void listProduct() {
		// 상품 전체 리스트
		System.out.println("상품 전체 리스트");
		System.out.println("코드\t\t 상품명 \t\t 단가 \t\t 수량");
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
		// 판매
		
		String code;
		System.out.println("\t\t");
		System.out.print("상품코드:");
		code = sc.nextLine();
		
		if(!product.containsKey(code)){
			System.out.println("등록되지않은 상품입니다.");
			return;
		}
		ProductVO pvo = product.get(code);
		System.out.println();
		System.out.println("상품명:"+pvo.getPname()+",남은 수량:"+pvo.getQuantity());
		
		SaleVO svo = new SaleVO();
		svo.setCode(code);
		
		System.out.print("\t고객명 :");
		svo.setSname(sc.nextLine());
		System.out.print("\t등록일 :");
		svo.setCreated(sc.nextLine());
		
		int quantity = sc.nextInt();	//판매수량

		//판매량과 재고량을 비교한다.
		//판매량이 재고량보다 많은 수는 없다.
		if(quantity>pvo.getQuantity()){
			System.out.println("판매량이 재고량보다 많을 수는 없다.");
			return;
		}
		
		//재고량 감소
		pvo.setQuantity(pvo.getQuantity()-quantity);
		svo.setQuantity(quantity);

		//리스트에 등록
		
		sale.add(svo);
		System.out.println();
		
		
	}//end method

	@Override
	public void searchSale() {
		//상품명으로 판매현황 조회
		String pname;
		System.out.println("판매된 상품명 조회:");
		
		System.out.print("검색할 상품명: ");
		pname = sc.nextLine();
		
		System.out.println("코드\t\t 상품명\t\t고객명\t\t판매일자\t\t단가\t\t 수량\t\t금액");
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
		// 전체판매 리스트
		System.out.println("\t\t전체판매리스트");

		System.out.println("코드\t\t 상품명\t\t고객명\t\t판매일자\t\t단가\t\t 수량\t\t금액");
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