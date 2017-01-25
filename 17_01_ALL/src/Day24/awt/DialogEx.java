package Day24.awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class DialogEx extends Frame{

	private Dialog d = new Dialog(this,"조회서비스",false);
	
	private Label dlb = new Label("이름과 주민번호로 비밀번호 찾기");
	private Label dlb1 = new Label("이름:",Label.RIGHT);
	private Label dlb2 = new Label("주민번호:",Label.RIGHT);
	private Label dlb3 = new Label("-",Label.CENTER);
	
	private TextField dtf = new TextField(20);		//이름
	private TextField dtf1 = new TextField(6);		//주민번호 앞자리
	private TextField dtf2 = new TextField(7);		//주민번호 뒷자리
	
	private Button but = new Button("찾기");
	private Button but1 = new Button("취소");
	
	
	
	public DialogEx() {
		// TODO Auto-generated constructor stub
			super("Dialog 대화상자");
			
			setDialog();
			setSize(300,200);
			setVisible(true);
			d.setVisible(true);
			WinEvent event = new WinEvent();
			addWindowListener(event);
			d.addWindowListener(event);
			
			
	}
	
	private void setDialog(){
		
		d.setLayout(new BorderLayout()); 		//대화 상자의 레이아웃 설정 
		d.add("North",dlb);
		
		//패널 설정
		
		Panel p1 = new Panel(new BorderLayout());		//제목과 버튼영역을 제외한 모든 영역
		Panel p2 = new Panel(new GridLayout(2, 1));		//이름, 주민번호 라벨을 표시할 영역
		
		p2.add(dlb1);									//이름 라벨을 표시
		p2.add(dlb2);									//주민번호 라벨 표시
		
		p1.add("West",p2);								//전체 영역에 이름, 주민번호 라벨 표시

		//텍스트 입력 패널 설정
		Panel p3 = new Panel(new GridLayout(2, 1));
		Panel tfPanel = new Panel(new FlowLayout(FlowLayout.LEFT));	//이름 입력필드 영역(라벨)
		
		tfPanel.add(dtf);								//이름 입력 필드
		p3.add(tfPanel);								//p3 = 모든입력필드영역(패널),이름을 입력부분을 넣어준다.
		
		Panel p4 = new Panel(new FlowLayout(FlowLayout.LEFT));
		p4.add(dtf1);
		p4.add(dlb3);
		p4.add(dtf2);
		
		p3.add(p4);
		p1.add("Center", p3);
		d.add("Center",p1);
		
		//버튼추가 
		Panel p = new Panel(new FlowLayout());
		p.add(but);
		p.add(but1);
		
		d.add("South", p);
		
		d.setSize(260, 130);
		d.setResizable(false);
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		new DialogEx();
		
		
	}
}
