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
		
		if(n>1){						//��������
			return 1; 					 
		}else if(n<1){					//��������
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

	map = new TreeMap<String, Map_SungVO>();		//key���� �й����� �޴´�.		
	//map = new HashMap<String,Map_SungVO>();  hashMap�� �̿��� ��쿣 �̷��� ���ش�.
	
	}
	
	@Override
	public int insert() throws IOException {
		// TODO Auto-generated method stub
		String hak;
		System.out.print("�й�:");
		hak = br.readLine();
		if(map.containsKey(hak)){					//�й��� Ű����������´�.
			System.out.println("�̹� �����ϴ� �й��Դϴ�.");
			return 0;
		}
		Map_SungVO ob = new Map_SungVO();
		ob.setHak(hak);
		
		System.out.print("�̸�:");
		ob.setName(br.readLine());
		
		System.out.print("����:");
		ob.setKor(Integer.parseInt(br.readLine()));
		
		System.out.print("����:");
		ob.setEng(Integer.parseInt(br.readLine()));

		System.out.print("����:");
		ob.setMat(Integer.parseInt(br.readLine()));
		
		map.put(hak, ob);							//map�� �߰�  
		return 1;									//int���̶� �ڷ�������. ����ؼ� return 1�� �ش�. 
	}

	@Override
	public int update() throws IOException {
		// TODO Auto-generated method stub
		String hak;
		System.out.print("\n ������ �й�:");
		hak = br.readLine();
		
		if(!map.containsKey(hak)){
			System.out.println("�������� �ʴ� �й��Դϴ�.");
			return 0;
		}
		Map_SungVO ob = new Map_SungVO();
		ob.setHak(hak);
		System.out.print("�̸�:");
		ob.setName(br.readLine());
		
		System.out.print("����:");
		ob.setKor(Integer.parseInt(br.readLine()));
		
		System.out.print("����:");
		ob.setEng(Integer.parseInt(br.readLine()));

		System.out.print("����:");
		ob.setMat(Integer.parseInt(br.readLine()));
		
		map.put(hak, ob);							//map�� �߰�  
		
		return 1;
	}

	@Override
	public void search() throws IOException {
		// TODO Auto-generated method stub
		String name;
		System.out.print("�̸����� �˻�:");
		name = br.readLine();
		Set<String>set = map.keySet();
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()){
			
			String key = it.next();
			Map_SungVO data = map.get(key);
			
			if(data.getName().equals(name))						//map�� ����Ǿ� �ִ� �̸��� �Է��� �̸� ��
				System.out.println(data.toString());
		}
		
		
		
		String hak;
		System.out.println("�й����� �˻� : ");					//�й� �˻�
		hak = br.readLine();
		if(!map.containsKey(hak)){
			System.out.println("�������� �ʴ� �й��Դϴ�.");
			return;
		}
		System.out.println(map.get(hak).toString());
		

	}

	@Override
	public int delete() throws IOException {
		// TODO Auto-generated method stub
		
		String hak;
		System.out.print("������ �й�:");
		hak = br.readLine();
		if(!map.containsKey(hak)){
			System.out.println("�������� �ʴ� �й� �Դϴ�.");
			return 0;
		}
		map.remove(hak);
		System.out.println("���� �Ϸ�");
		return 1;
	}

	@Override
	public void writeAll() {
		// TODO Auto-generated method stub

		Set<String> set = map.keySet();
		Iterator<String>it = set.iterator();
		
		System.out.println("\n ��ü��� :");
		
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
		
		Collections.sort(lists,new MyComparator<Map_SungVO>());					//��������
		
		Collections.sort(lists,Collections.reverseOrder(new MyComparator<Map_SungVO>()));// ��������
		
		System.out.println("\n �հ������ ���");
		Iterator<Map_SungVO>it2 = lists.iterator();
		
		while(it2.hasNext()){
			Map_SungVO data = it2.next();
			
			System.out.println(data.toString());
		}
	}

}
