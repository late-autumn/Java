package Day18_member;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MemberImpl implements Member {

	private List<MemberVO> lists = new ArrayList<MemberVO>();
	
	@Override
	public void insert_member() {
		// ȸ�� �߰�
		try {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		MemberVO member_vo = new MemberVO();

		System.out.println("[ȸ�� �߰�]");
		System.out.print("��ȭ��ȣ[000-0000-0000]:");
		member_vo.setTel(br.readLine());
		
		Pattern pattern = Pattern.compile("\\d{3}\\-\\d{4}\\-\\d{4}"); //��ȭ��ȣ ���� (����)���� util Ŭ����
																	   // \\ + ���� or ���� 
	
		Matcher matcher = pattern.matcher(member_vo.getTel());		//��ȭ ��ȣ �������� ��Ī��Ŵ
		
		if(matcher.matches()){
			throw new Exception("��ȭ��ȣ ���� ������ ���Ͽ� �߰� �����Ͽ����ϴ�.");
		}
		System.out.print("�̸�:");
		member_vo.setName(br.readLine());
		
		if(member_vo.getName()==null || member_vo.getName().equals("")){
			//�̸��� null�̰ų� �ʱ�ȭ �� ���
			throw new Exception("�̸��� �Է��ϼ��� !!");
		}
		
		System.out.print("�ּ�:");
		member_vo.setAddr(br.readLine());
		
		if(member_vo.getAddr()==null || member_vo.getAddr().equals("")){
			//�ּҰ� null�̰ų� �ʱ�ȭ �� ���
			throw new Exception("�ּҸ� �Է��ϼ��� !!");
		}
		if(search_member(member_vo)!=null){
			throw new Exception("�̹� ��ϵ� �ڷ��Դϴ�.");
		}
		lists.add(member_vo);
		System.out.println("ȸ����� ����");	
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		catch (Exception ee) {
			ee.printStackTrace();
		}		
	}

	@Override
	public void update_member() {
		// ȸ�� ����
		try {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		MemberVO member_vo = new MemberVO();

		System.out.println("[ȸ�� ���� ����]");
		System.out.print("��ȭ��ȣ[000-0000-0000]:");
		member_vo.setTel(br.readLine());
		
		System.out.print("������ �̸�:");
		member_vo.setName(br.readLine());
		
		MemberVO sub_vo = search_member(member_vo);
		
		if(sub_vo ==null){
			throw new Exception("�ڷᰡ ��� �Ǿ� ���� �ʽ��ϴ�.");
		}
		
		System.out.println("���ο� ��ȭ��ȣ [000-000-0000]");
		member_vo.setTel(br.readLine());
		
		Pattern pattern = Pattern.compile("\\d{3}\\-\\d{4}\\-\\d{4}"); //��ȭ��ȣ ���� (����)���� util Ŭ����
		   // \\ + ���� or ���� 
		Matcher matcher = pattern.matcher(member_vo.getTel());		//��ȭ ��ȣ �������� ��Ī��Ŵ
		
		if(matcher.matches()){
			throw new Exception("��ȭ��ȣ ���� ������ ���Ͽ� �߰��� �����Ͽ����ϴ�.");
		}
		
		System.out.print("���ο� �̸�:");
		member_vo.setName(br.readLine());
		
		if(member_vo.getName()==null || member_vo.getName().equals("")){
			//�̸��� null�̰ų� �ʱ�ȭ �� ���
			throw new Exception("�̸��� �Է��ϼ��� !!");
		}
		
		System.out.print("���ο� �ּ�:");
		member_vo.setAddr(br.readLine());
		
		if(member_vo.getAddr()==null || member_vo.getAddr().equals("")){
			//�ּҰ� null�̰ų� �ʱ�ȭ �� ���
			throw new Exception("�ּҸ� �Է��ϼ��� !!");
		}
								
		if(sub_vo!= member_vo && search_member(member_vo) != null){
			throw new Exception("�̹� ��ϵ� �ڷ��Դϴ�.");
		}
		lists.remove(sub_vo); 	//���� �ڷ� ����
		lists.add(member_vo);	//������ �ڷ� ÷��
		
		System.out.println("ȸ������ ������ ����");
		
		}catch(IOException ie){
			ie.printStackTrace();
		}catch(Exception ee){
			ee.printStackTrace();
		}
		
	}

	@Override
	public void delete_member() {
		// ȸ�� ����

		try {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		MemberVO member_vo = new MemberVO();

		System.out.println("[ȸ�� ���� ����]");
		System.out.print("��ȭ��ȣ[000-0000-0000]:");
		member_vo.setTel(br.readLine());
		
		System.out.print("������ �̸�:");
		member_vo.setName(br.readLine());

		MemberVO sub_vo = search_member(member_vo);
		if(sub_vo ==null){
			throw new Exception("��ϵ� �ڷᰡ �����ϴ�.");
		}
		lists.remove(sub_vo);//���� �ڷ� ����
		System.out.println("ȸ�� ���� ����");
		
		
		}catch(IOException ie){
			ie.printStackTrace();
		}catch(Exception ee){
			ee.printStackTrace();
		}
		
	}

	@Override
	public void search_member() {
		// TODO Auto-generated method stub
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String name;
			
			System.out.println("[ȸ���˻�]");
			System.out.print("�˻��� �̸�:");
			name = br.readLine();
			
			Comparator<MemberVO> comparator = new Comparator<MemberVO>() { //�͸� Ŭ���� 
				
				@Override
				public int compare(MemberVO o1, MemberVO o2) {
					// TODO Auto-generated method stub
					return o1.getName().compareTo(o2.getName());
				}
			};
			Collections.sort(lists,comparator);
			
			int n =0;
		
			Iterator<MemberVO> it =lists.iterator();
			
			while(it.hasNext()){
				MemberVO ob = it.next();
				if(ob.getName().startsWith(name)){
					n++;
				}
				
			}
			
			System.out.println("�˻��� ȸ���� :"+n);
			for(MemberVO ob : lists){
				
				if(ob.getName().startsWith(name)){
					System.out.println(ob.toString());
				}
			}
			
		}catch(IOException ie){
			ie.printStackTrace();
		}
		
		
		
	}

	@Override
	public void list_member() {
		// TODO Auto-generated method stub
		try{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = lists.size();
		System.out.println("[ȸ�� ����Ʈ]");
		System.out.println("��üȸ���� : "+n);
		
		Comparator<MemberVO> comparator = new Comparator<MemberVO>() { //�͸� Ŭ���� 
			
			@Override
			public int compare(MemberVO o1, MemberVO o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		};
		Collections.sort(lists,comparator);
		
		Iterator<MemberVO> it =lists.iterator();
		
		int i =0;
		while(it.hasNext()){
			
			MemberVO ob = it.next();
			System.out.println(ob.toString());
			i++;
			if(n!=i && i!=0 && i%20 ==0){
				System.out.print("����Ű����������");
				br.readLine();
			}
		}
		}catch(IOException ie){
			ie.printStackTrace();
		}
		
	}

	@Override
	public MemberVO search_member(MemberVO rec) {
		// TODO Auto-generated method stub
		
		Iterator<MemberVO> it = lists.iterator();
		
		while(it.hasNext()){
			MemberVO ob = it.next();
			
			if(ob.equals(rec))
				return ob;
		}
		
		return null;
	}

}
