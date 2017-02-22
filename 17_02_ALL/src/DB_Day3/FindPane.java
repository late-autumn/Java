package DB_Day3;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;


/*
 * Findpane : 사원 정보 조회 탭 객체는 검색을 위한 사원 정보를 입력 받기 위한 텍스트
 * 			  필드와 사원조회 버튼, 다시쓰기 버튼으로 구성된다. 
 * 
 * actionPerformed() 
 * 			- 사원 조회버튼을 누르면 텍스트 필드의 내용과 일치하는 데이터를 데이터베이스로 부터 얻어옴
 * 
 * 			데이터베이스를 조회한 후 그 결과를 출력
 * 			다시쓰기 버튼을 누르면 텍스트 필드의 내용을 초기화함 
 */




public class FindPane extends JPanel implements ActionListener {

	private JPanel jp[] = new JPanel[6];
	private JLabel jl[] = new JLabel[5];
	private JTextField tf[] = new JTextField[5];
	private JButton okb;		//조회
	private JButton rsb;		//다시쓰기
	
	String[] caption = {"번호:","이름:","직책:","부서:","메일:"};
	
	
	//생성자 
	public FindPane() {
		// TODO Auto-generated constructor stub
		setLayout(new GridLayout(7, 1));
		EtchedBorder eb = new EtchedBorder();		//경계선
		setBorder(eb);
		
		int size = caption.length;
		int i;
		
		for(i = 0; i<size;i++){
			
			jl[i] = new JLabel(caption[i]);
			tf[i] = new JTextField(15);
			jp[i] = new JPanel();
			
			jp[i].add(jl[i]);
			jp[i].add(tf[i]);
			add(jp[i]);
			
			//텍스트 필드를 입력 불가능한 상태로 만든다.			
			tf[i].setEditable(false);

			//사번과 이름으로 검색해야 입력 가능한 상태로 만듬 
			if(i==0 || i ==1)
				tf[i].setEditable(true);
			
		}
		
		jp[size] = new JPanel();
		okb = new JButton("사원정보조회");
		okb.addActionListener(this);
		rsb = new JButton("다시 쓰기");
		rsb.addActionListener(this);
		
		jp[size].add(okb);
		jp[size].add(rsb);
		add(jp[size]);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		
		
		//이벤트가 발생한 버튼의 캡션 값을 얻어옴 
		String ae_type = ae.getActionCommand();
		
		EmployeeVO evo = null;					//검색한 사원정보를 저장한 VO 객체 생성
		EmployeeDAO edvo = null;				//데이터베이스 처리를 위한 DAO 객체 생성
		
		if(ae_type.equals(okb.getText())){		//조회 버튼이 클릭되었을 경우 
			
			try{
				edvo = new EmployeeDAO();
				String sno = tf[0].getText().trim();
				String sname = tf[1].getText().trim();
				
				if(!sno.equals("")&&!sname.equals("")){	//사번과 이름 입력
					int no = Integer.parseInt(sno);
					evo = edvo.getEmployeeCheck(no, sname);
				}
				else if(!sno.equals("")&&sname.equals("")){ //사번만 입력 
					int no = Integer.parseInt(sno);
					evo = edvo.getEmployeeNo(no);
				}
				else if(sno.equals("")&&!sname.equals("")){ //이름만 입력 
					evo = edvo.getEmployeeName(sname);
				}
				
			}catch(Exception e){
				System.out.println("e:["+e+"]");
			}
			
			if(evo!=null){								//해당 사원이 존재하지 않는다면 텍스트 필드 초기화 
				tf[0].setText(evo.getNo()+"");
				tf[1].setText(evo.getName()+"");
				tf[2].setText(evo.getJobGrade()+"");
				tf[3].setText(evo.getDepartment()+"");
				tf[4].setText(evo.getEmail()+"");
			}
			else{
				JOptionPane.showInternalConfirmDialog(this, "검색 실패");
			}
			
		}
		else if(ae_type.equals(rsb.getText())){	//다시쓰기 버튼이 클릭 되었을 경우
			//텍스트 필드 초기화 한다.
			int size = caption.length;
			for(int i=0; i<size;i++){
				tf[i].setText("");
			}
			
		}
	}

}
