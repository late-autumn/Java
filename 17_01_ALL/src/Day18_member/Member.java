package Day18_member;

public interface Member {

	public void insert_member();		//회원 가입
	public void update_member();		//회원 수정
	public void delete_member();		//회원 삭제
	public void search_member();		//회원 검색
	public void list_member();			//회원 출력
	
	public MemberVO search_member(MemberVO rec); //회원검색 (메소드)
	
	
}
