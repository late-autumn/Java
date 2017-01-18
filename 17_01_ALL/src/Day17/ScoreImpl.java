package Day17;

import java.util.*;


public class ScoreImpl implements Score {

	private List<ScoreVO>list = new ArrayList<ScoreVO>();
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("자료 추가");
		System.out.println("---------");
		String hak;
		System.out.print("학번:");
		hak =sc.next();
		ScoreVO temp = readScore(hak);
		if(temp !=null){
			System.out.println("이미 등록된 학번 입니다.");
			return;
		}
		ScoreVO vo = new ScoreVO();
		
		vo.setHak(hak);
		System.out.print("이름:");
		vo.setName(sc.next());		//바로 입력 이름받기 
		System.out.print("생년월일:");
		vo.setBirth(sc.next());
		System.out.print("국어:");
		vo.setKor(sc.nextInt());
		System.out.print("영어:");
		vo.setEng(sc.nextInt());
		System.out.print("수학:");
		vo.setMat(sc.nextInt());
		
		list.add(vo);
		System.out.println("추가 완료");
		System.out.println("---------");
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

		System.out.println("자료수정");
		System.out.println("---------");
		String hak;
		System.out.println("수정할 학번");
		hak = sc.next();
		
		ScoreVO vo = readScore(hak);
		if(vo==null){
			System.out.println("등록되지 않은 학번입니다.");
			return;
		}
		vo.setHak(hak);
		System.out.print("이름:");
		vo.setName(sc.next());		
		System.out.print("생년월일:");
		vo.setBirth(sc.next());
		System.out.print("국어:");
		vo.setKor(sc.nextInt());
		System.out.print("영어:");
		vo.setEng(sc.nextInt());
		System.out.print("수학:");
		vo.setMat(sc.nextInt());
		
		System.out.println("수정완료");
		System.out.println();
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("자료삭제");
		System.out.println("---------");
		String hak;
		System.out.print("삭제할 학번 :");
		hak = sc.next();
		
		ScoreVO vo = readScore(hak);
		if(vo ==null){
			System.out.println("등록된학번이 없습니다.");
		return;
		}
		list.remove(vo);
		
		
		
	}

	@Override
	public void listAll() {
		// TODO Auto-generated method stub
		System.out.println("전체 자료출력");
		System.out.println("---------");
		//리스트 안에 있는 데이터를 반복자를 통해서 계속 가지고 올 수 있는 객체생성
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
		System.out.println("학번 검색:");
		System.out.println("---------");
		String hak;
		System.out.print("검색할 학번 입력:");
		hak =sc.next();
		
		ScoreVO vo = readScore(hak);
		if(vo==null){
			System.out.println("학번이 존재하지 않습니다");
			return;
		}
		System.out.println(vo);
	}

	@Override
	public void searchName() {
		// TODO Auto-generated method stub

		System.out.print("이름검색");
		System.out.println("---------");
	
		String name;
		
		System.out.print("검색할 이름:");
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
