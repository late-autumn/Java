package Day18_member;

public interface Member {

	public void insert_member();		//ȸ�� ����
	public void update_member();		//ȸ�� ����
	public void delete_member();		//ȸ�� ����
	public void search_member();		//ȸ�� �˻�
	public void list_member();			//ȸ�� ���
	
	public MemberVO search_member(MemberVO rec); //ȸ���˻� (�޼ҵ�)
	
	
}
