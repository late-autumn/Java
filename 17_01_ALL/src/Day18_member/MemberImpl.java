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
		// 회원 추가
		try {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		MemberVO member_vo = new MemberVO();

		System.out.println("[회원 추가]");
		System.out.print("전화번호[000-0000-0000]:");
		member_vo.setTel(br.readLine());
		
		Pattern pattern = Pattern.compile("\\d{3}\\-\\d{3}\\-\\d{4}"); //전화번호 형식 (패턴)지정 util 클래스
																	   // \\ + 문자 or 숫자 
	
		Matcher matcher = pattern.matcher(member_vo.getTel());		//전화 번호 형식으로 매칭시킴
		
		if(matcher.matches()){
			throw new Exception("전화번호 형식 오류로 인하여 추가 실패하였습니다.");
		}
		System.out.print("이름:");
		member_vo.setName(br.readLine());
		
		if(member_vo.getName()==null || member_vo.getName().equals("")){
			//이름이 null이거나 초기화 된 경우
			throw new Exception("이름을 입력하세요 !!");
		}
		
		System.out.print("주소:");
		member_vo.setAddr(br.readLine());
		
		if(member_vo.getAddr()==null || member_vo.getAddr().equals("")){
			//주소가 null이거나 초기화 된 경우
			throw new Exception("주소를 입력하세요 !!");
		}
		if(search_member(member_vo)!=null){
			throw new Exception("이미 등록된 자료입니다.");
		}
		lists.add(member_vo);
		System.out.println("회원등록 성공");	
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		catch (Exception ee) {
			ee.printStackTrace();
		}		
	}

	@Override
	public void update_member() {
		// 회원 수정
		try {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		MemberVO member_vo = new MemberVO();

		System.out.println("[회원 정보 수정]");
		System.out.print("전화번호[000-0000-0000]:");
		member_vo.setTel(br.readLine());
		
		System.out.print("수정할 이름:");
		member_vo.setName(br.readLine());
		
		MemberVO sub_vo = search_member(member_vo);
		
		if(sub_vo ==null){
			throw new Exception("자료가 등록 되어 있지 않습니다.");
		}
		
		System.out.println("새로운 전화번호 [000-000-0000]");
		member_vo.setTel(br.readLine());
		
		Pattern pattern = Pattern.compile("\\d{3}\\-\\d{3}\\-\\d{4}"); //전화번호 형식 (패턴)지정 util 클래스
		   // \\ + 문자 or 숫자 
		Matcher matcher = pattern.matcher(member_vo.getTel());		//전화 번호 형식으로 매칭시킴
		
		if(matcher.matches()){
			throw new Exception("전화번호 형식 오류로 인하여 추가를 실패하였습니다.");
		}
		
		System.out.print("새로운 이름:");
		member_vo.setName(br.readLine());
		
		if(member_vo.getName()==null || member_vo.getName().equals("")){
			//이름이 null이거나 초기화 된 경우
			throw new Exception("이름을 입력하세요 !!");
		}
		
		System.out.print("새로운 주소:");
		member_vo.setAddr(br.readLine());
		
		if(member_vo.getAddr()==null || member_vo.getAddr().equals("")){
			//주소가 null이거나 초기화 된 경우
			throw new Exception("주소를 입력하세요 !!");
		}
								
		if(sub_vo!= member_vo && search_member(member_vo) != null){
			throw new Exception("이미 등록된 자료입니다.");
		}
		lists.remove(sub_vo); 	//기존 자료 삭제
		lists.add(member_vo);	//수정한 자료 첨가
		
		System.out.println("회원정보 수정이 성공");
		
		}catch(IOException ie){
			ie.printStackTrace();
		}catch(Exception ee){
			ee.printStackTrace();
		}
		
	}

	@Override
	public void delete_member() {
		// 회원 삭제

		try {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		MemberVO member_vo = new MemberVO();

		System.out.println("[회원 정보 삭제]");
		System.out.print("전화번호[000-0000-0000]:");
		member_vo.setTel(br.readLine());
		
		System.out.print("삭제할 이름:");
		member_vo.setName(br.readLine());

		MemberVO sub_vo = search_member(member_vo);
		if(sub_vo ==null){
			throw new Exception("등록된 자료가 없습니다.");
		}
		lists.remove(sub_vo);//기존 자료 삭제
		System.out.println("회원 삭제 성공");
		
		
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
