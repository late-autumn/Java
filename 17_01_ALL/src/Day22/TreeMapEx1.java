package Day22;

import java.util.*;
import java.io.*;

public class TreeMapEx1 {

	public static void main(String[] args) {
		
		TreeMap<String,String> map = new TreeMap<String,String>();
		
		map.put("��ȭ", "�����޺� ŰŰ");
		map.put("ȣ��", "������Ʈ�̺�");
		map.put("��ȭ", "Ȳȥ���� ��������");
		map.put("TV", "��Ÿ�� û��");
		map.put("OK", "ȯ������");
		Map<String, String>subMap = map.subMap("OK","��ȭ");
		System.out.println(subMap);
		System.out.println(map);
	
		/*
		 * TreeMap Ŭ������ sort �� ���·� �ڷḦ �߰��Ѵ�.
		 * TreeMap Ŭ������ sortedMap<k,v> subMap(K fromKey, K toKey)�޼ҵ�
		 * ���� fromkey(�̰��� ����) ~tokey(�̰��� ���������ʴ´�.)�� ������
		 * ������ �κ��� �並 �����Ѵ�.
		 * 
		 */
		
	}
}
