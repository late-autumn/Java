package Day16;
import java.util.*;
public class MapEx {

	
	public static void main(String[] args) {
		
		String[] msg = {"Berlin","Dortmund","Frankfurt","Gelsenkrchen","Hamburg"};
		
		HashMap<Integer, String>map = 
				new HashMap<Integer, String>();
		//Hashmap ����
		//�ʿ� ����
		
		for(int i=0; i<msg.length;i++){
			map.put(i, msg[i]);
		}
		
		Set<Integer>keys = map.keySet();
		//�ʿ��� �о�´�
		for(Integer n : keys)
		System.out.println(map.get(n));
	}
}
