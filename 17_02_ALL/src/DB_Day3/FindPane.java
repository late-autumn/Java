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
 * Findpane : ��� ���� ��ȸ �� ��ü�� �˻��� ���� ��� ������ �Է� �ޱ� ���� �ؽ�Ʈ
 * 			  �ʵ�� �����ȸ ��ư, �ٽþ��� ��ư���� �����ȴ�. 
 * 
 * actionPerformed() 
 * 			- ��� ��ȸ��ư�� ������ �ؽ�Ʈ �ʵ��� ����� ��ġ�ϴ� �����͸� �����ͺ��̽��� ���� ����
 * 
 * 			�����ͺ��̽��� ��ȸ�� �� �� ����� ���
 * 			�ٽþ��� ��ư�� ������ �ؽ�Ʈ �ʵ��� ������ �ʱ�ȭ�� 
 */




public class FindPane extends JPanel implements ActionListener {

	private JPanel jp[] = new JPanel[6];
	private JLabel jl[] = new JLabel[5];
	private JTextField tf[] = new JTextField[5];
	private JButton okb;		//��ȸ
	private JButton rsb;		//�ٽþ���
	
	String[] caption = {"��ȣ:","�̸�:","��å:","�μ�:","����:"};
	
	
	//������ 
	public FindPane() {
		// TODO Auto-generated constructor stub
		setLayout(new GridLayout(7, 1));
		EtchedBorder eb = new EtchedBorder();		//��輱
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
			
			//�ؽ�Ʈ �ʵ带 �Է� �Ұ����� ���·� �����.			
			tf[i].setEditable(false);

			//����� �̸����� �˻��ؾ� �Է� ������ ���·� ���� 
			if(i==0 || i ==1)
				tf[i].setEditable(true);
			
		}
		
		jp[size] = new JPanel();
		okb = new JButton("���������ȸ");
		okb.addActionListener(this);
		rsb = new JButton("�ٽ� ����");
		rsb.addActionListener(this);
		
		jp[size].add(okb);
		jp[size].add(rsb);
		add(jp[size]);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		
		
		//�̺�Ʈ�� �߻��� ��ư�� ĸ�� ���� ���� 
		String ae_type = ae.getActionCommand();
		
		EmployeeVO evo = null;					//�˻��� ��������� ������ VO ��ü ����
		EmployeeDAO edvo = null;				//�����ͺ��̽� ó���� ���� DAO ��ü ����
		
		if(ae_type.equals(okb.getText())){		//��ȸ ��ư�� Ŭ���Ǿ��� ��� 
			
			try{
				edvo = new EmployeeDAO();
				String sno = tf[0].getText().trim();
				String sname = tf[1].getText().trim();
				
				if(!sno.equals("")&&!sname.equals("")){	//����� �̸� �Է�
					int no = Integer.parseInt(sno);
					evo = edvo.getEmployeeCheck(no, sname);
				}
				else if(!sno.equals("")&&sname.equals("")){ //����� �Է� 
					int no = Integer.parseInt(sno);
					evo = edvo.getEmployeeNo(no);
				}
				else if(sno.equals("")&&!sname.equals("")){ //�̸��� �Է� 
					evo = edvo.getEmployeeName(sname);
				}
				
			}catch(Exception e){
				System.out.println("e:["+e+"]");
			}
			
			if(evo!=null){								//�ش� ����� �������� �ʴ´ٸ� �ؽ�Ʈ �ʵ� �ʱ�ȭ 
				tf[0].setText(evo.getNo()+"");
				tf[1].setText(evo.getName()+"");
				tf[2].setText(evo.getJobGrade()+"");
				tf[3].setText(evo.getDepartment()+"");
				tf[4].setText(evo.getEmail()+"");
			}
			else{
				JOptionPane.showInternalConfirmDialog(this, "�˻� ����");
			}
			
		}
		else if(ae_type.equals(rsb.getText())){	//�ٽþ��� ��ư�� Ŭ�� �Ǿ��� ���
			//�ؽ�Ʈ �ʵ� �ʱ�ȭ �Ѵ�.
			int size = caption.length;
			for(int i=0; i<size;i++){
				tf[i].setText("");
			}
			
		}
	}

}
