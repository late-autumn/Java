package Day17;

import java.util.*;


public class ScoreImpl implements Score {

	private List<ScoreVO>list = new ArrayList<ScoreVO>();
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("�ڷ� �߰�");
		System.out.println("---------");
		String hak;
		System.out.print("�й�:");
		hak =sc.next();
		ScoreVO temp = readScore(hak);
		if(temp !=null){
			System.out.println("�̹� ��ϵ� �й� �Դϴ�.");
			return;
		}
		ScoreVO vo = new ScoreVO();
		
		vo.setHak(hak);
		System.out.print("�̸�:");
		vo.setName(sc.next());		//�ٷ� �Է� �̸��ޱ� 
		System.out.print("�������:");
		vo.setBirth(sc.next());
		System.out.print("����:");
		vo.setKor(sc.nextInt());
		System.out.print("����:");
		vo.setEng(sc.nextInt());
		System.out.print("����:");
		vo.setMat(sc.nextInt());
		
		list.add(vo);
		System.out.println("�߰� �Ϸ�");
		System.out.println("---------");
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

		System.out.println("�ڷ����");
		System.out.println("---------");
		String hak;
		System.out.println("������ �й�");
		hak = sc.next();
		
		ScoreVO vo = readScore(hak);
		if(vo==null){
			System.out.println("��ϵ��� ���� �й��Դϴ�.");
			return;
		}
		vo.setHak(hak);
		System.out.print("�̸�:");
		vo.setName(sc.next());		
		System.out.print("�������:");
		vo.setBirth(sc.next());
		System.out.print("����:");
		vo.setKor(sc.nextInt());
		System.out.print("����:");
		vo.setEng(sc.nextInt());
		System.out.print("����:");
		vo.setMat(sc.nextInt());
		
		System.out.println("�����Ϸ�");
		System.out.println();
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("�ڷ����");
		System.out.println("---------");
		String hak;
		System.out.print("������ �й� :");
		hak = sc.next();
		
		ScoreVO vo = readScore(hak);
		if(vo ==null){
			System.out.println("��ϵ��й��� �����ϴ�.");
		return;
		}
		list.remove(vo);
		
		
		
	}

	@Override
	public void listAll() {
		// TODO Auto-generated method stub
		System.out.println("��ü �ڷ����");
		System.out.println("---------");
		//����Ʈ �ȿ� �ִ� �����͸� �ݺ��ڸ� ���ؼ� ��� ������ �� �� �ִ� ��ü����
		Iterator<ScoreVO> it = list.iterator();
	
		while(it.hasNext()){
		ScoreVO vo = it.next();
		System.out.print(vo);
		}
		
		System.out.println();
	}
	
	

	@Override
	public void searchHak() {
		// TODO Auto-generated method stub
		System.out.println("�й� �˻�:");
		System.out.println("---------");
		String hak;
		System.out.print("�˻��� �й� �Է�:");
		hak =sc.next();
		
		ScoreVO vo = readScore(hak);
		if(vo==null){
			System.out.println("�й��� �������� �ʽ��ϴ�");
			return;
		}
		System.out.println(vo);
	}

	@Override
	public void searchName() {
		// TODO Auto-generated method stub

		System.out.print("�̸��˻�");
		System.out.println("---------");
	
		String name;
		
		System.out.print("�˻��� �̸�:");
		name = sc.next();
		
		for(ScoreVO vo : list){
			if(vo.getName().startsWith(name)){
				System.out.println(vo);
			}
		}
		
		
	}
	
	public ScoreVO readScore(String hak){
		
		ScoreVO vo = null;
		
		for(ScoreVO temp: list){
			if(temp.getHak().equals(hak)){
				vo = temp;
				break;
			}			
		}
		return vo;
	}//end scoreVO

}
