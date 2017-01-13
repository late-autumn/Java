package Day16;
import java.util.*;
public class HashMapEx2 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("ȫ�浿", new Integer(30));
		map.put("������", new Integer(50));
		map.put("�̼���", new Integer(47));
		map.put("������", new Integer(97));
		map.put("�庸��", new Integer(84)); 
		map.put("�տ���", new Integer(100));
		
		/*Ű�� ���� Set���·� �����Ѵ�.
		  (HashMap�� �̿��ؼ� key�� value�� ���� �ֱ� ���ؼ�) ��ü�� �̿���
		   Map.Entry �������̽� �̿�
		   Map.entrySet �޼ҵ�� Ŭ������ ���ϴ� ��Ҹ� ������ ���� �÷���  �並 ��ȯ��
		   iterator �������̽��� �޼ҵ�� iterator()�� �̿���
		    
		*/
		Set<Map.Entry<String, Integer>> set1 = map.entrySet();
		Iterator<Map.Entry<String, Integer>> it1 = set1.iterator();
		while(it1.hasNext()){
		Map.Entry<String, Integer> e= it1.next();
		System.out.println("�̸�:"+e.getKey()+", ����:"+e.getValue());
		}
		//Ű�� set2�� �����غ���
		Set set2 = map.keySet(); //Ű�� set�� ������
		System.out.println("���� ������ ���:"+set2);
		
		Collection<Integer> v= map.values(); // ������ �÷��ǿ� �ִ´� .
		
		Iterator<Integer> it2 = v.iterator();
		
		int sum = 0;
		
		while(it2.hasNext()){
			Integer i = it2.next();
			sum += i;
		}
		System.out.println("�հ� :"+sum);
		System.out.println("���:"+(float)sum/set2.size());
		System.out.println("�ְ� ����:"+Collections.max(v));
		System.out.println("���� ����:"+Collections.min(v));
	}
	
}
