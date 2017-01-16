package Day18_member;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
		
		Pattern pattern = Pattern.compile("\\d{3}\\-\\d{3}\\-\\d{4}"); //��ȭ��ȣ ���� (����)���� util Ŭ����
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
		
		Pattern pattern = Pattern.compile("\\d{3}\\-\\d{3}\\-\\d{4}"); //��ȭ��ȣ ���� (����)���� util Ŭ����
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

	}

	@Override
	public void list_member() {
		// TODO Auto-generated method stub

	}

	@Override
	public MemberVO search_member(MemberVO rec) {
		// TODO Auto-generated method stub
		return null;
	}

}
