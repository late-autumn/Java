package Day22;

import java.io.IOException;
import java.io.*;
import java.util.*;

class MyComparator<T>implements Comparator<T>{
	
	@Override
	public int compare(T o1, T o2) {
		// TODO Auto-generated method stub
		Map_SungVO s1 = (Map_SungVO)o1;
		Map_SungVO s2 = (Map_SungVO)o2;
		
		int n = s1.getTot() - s2.getTot();
		
		if(n>1){						//오름차순
			return 1; 					 
		}else if(n<1){					//내림차순
			return -1;					
		}else{
		return 0;
		}
	}
}

public class Map_Sung_Method implements Map_Sung_Iterface {

	private Map<String,Map_SungVO> map;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public Map_Sung_Method() {

	map = new TreeMap<String, Map_SungVO>();		//key값은 학번으로 받는다.		
	//map = new HashMap<String,Map_SungVO>();  hashMap을 이용할 경우엔 이렇게 해준다.
	
	}
	
	@Override
	public int insert() throws IOException {
		// TODO Auto-generated method stub
		String hak;
		System.out.print("학번:");
		hak = br.readLine();
		if(map.containsKey(hak)){					//학번이 키값을가지고온다.
			System.out.println("이미 존재하는 학번입니다.");
			return 0;
		}
		Map_SungVO ob = new Map_SungVO();
		ob.setHak(hak);
		
		System.out.print("이름:");
		ob.setName(br.readLine());
		
		System.out.print("국어:");
		ob.setKor(Integer.parseInt(br.readLine()));
		
		System.out.print("영어:");
		ob.setEng(Integer.parseInt(br.readLine()));

		System.out.print("수학:");
		ob.setMat(Integer.parseInt(br.readLine()));
		
		map.put(hak, ob);							//map에 추가  
		return 1;									//int형이라 자료형값을. 줘야해서 return 1을 준다. 
	}

	@Override
	public int update() throws IOException {
		// TODO Auto-generated method stub
		String hak;
		System.out.print("\n 수정할 학번:");
		hak = br.readLine();
		
		if(!map.containsKey(hak)){
			System.out.println("존재하지 않는 학번입니다.");
			return 0;
		}
		Map_SungVO ob = new Map_SungVO();
		ob.setHak(hak);
		System.out.print("이름:");
		ob.setName(br.readLine());
		
		System.out.print("국어:");
		ob.setKor(Integer.parseInt(br.readLine()));
		
		System.out.print("영어:");
		ob.setEng(Integer.parseInt(br.readLine()));

		System.out.print("수학:");
		ob.setMat(Integer.parseInt(br.readLine()));
		
		map.put(hak, ob);							//map에 추가  
		
		return 1;
	}

	@Override
	public void search() throws IOException {
		// TODO Auto-generated method stub
		String name;
		System.out.print("이름으로 검색:");
		name = br.readLine();
		Set<String>set = map.keySet();
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()){
			
			String key = it.next();
			Map_SungVO data = map.get(key);
			
			if(data.getName().equals(name))						//map에 저장되어 있는 이름과 입력한 이름 비교
				System.out.println(data.toString());
		}
		
		
		
		String hak;
		System.out.println("학번으로 검색 : ");					//학번 검색
		hak = br.readLine();
		if(!map.containsKey(hak)){
			System.out.println("존재하지 않는 학번입니다.");
			return;
		}
		System.out.println(map.get(hak).toString());
		

	}

	@Override
	public int delete() throws IOException {
		// TODO Auto-generated method stub
		
		String hak;
		System.out.print("삭제할 학번:");
		hak = br.readLine();
		if(!map.containsKey(hak)){
			System.out.println("존재하지 않는 학번 입니다.");
			return 0;
		}
		map.remove(hak);
		System.out.println("삭제 완료");
		return 1;
	}

	@Override
	public void writeAll() {
		// TODO Auto-generated method stub

		Set<String> set = map.keySet();
		Iterator<String>it = set.iterator();
		
		System.out.println("\n 전체출력 :");
		
		while(it.hasNext()){
			
			String key = it.next();
			Map_SungVO data = map.get(key);
			System.out.println(data.toString());
		}
		
		
		
	}

	@Override
	public void writeSort() {
		// TODO Auto-generated method stub

		List<Map_SungVO>lists = new ArrayList<>();
		
		Set<String>set = map.keySet();
		
		Iterator<String>it1 = set.iterator();
		
		while(it1.hasNext()){
			
			String key = it1.next();
			lists.add(map.get(key));
		}
		
		Collections.sort(lists,new MyComparator<Map_SungVO>());					//오름차순
		
		Collections.sort(lists,Collections.reverseOrder(new MyComparator<Map_SungVO>()));// 내림차순
		
		System.out.println("\n 합계순으로 출력");
		Iterator<Map_SungVO>it2 = lists.iterator();
		
		while(it2.hasNext()){
			Map_SungVO data = it2.next();
			
			System.out.println(data.toString());
		}
	}

}
