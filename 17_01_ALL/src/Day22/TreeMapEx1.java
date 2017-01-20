package Day22;

import java.util.*;
import java.io.*;

public class TreeMapEx1 {

	public static void main(String[] args) {
		
		TreeMap<String,String> map = new TreeMap<String,String>();
		
		map.put("만화", "마녀배달부 키키");
		map.put("호러", "레지던트이블");
		map.put("영화", "황혼에서 새벽까지");
		map.put("TV", "불타는 청춘");
		map.put("OK", "환불해줘");
		Map<String, String>subMap = map.subMap("OK","영화");
		System.out.println(subMap);
		System.out.println(map);
	
		/*
		 * TreeMap 클래스는 sort 된 상태로 자료를 추가한다.
		 * TreeMap 클래스의 sortedMap<k,v> subMap(K fromKey, K toKey)메소드
		 * 맵의 fromkey(이것은 포함) ~tokey(이것은 포함하지않는다.)의 범위를
		 * 가지는 부분의 뷰를 리턴한다.
		 * 
		 */
		
	}
}
