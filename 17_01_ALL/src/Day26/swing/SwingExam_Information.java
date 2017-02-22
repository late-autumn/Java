package Day26.swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingExam_Information extends JFrame implements ActionListener{

   JRadioButton man, woman; //라디오버튼
   JButton btn1; //버튼
   TextField txtID, txtPwd1, txtPwd2; //텍스트필드
   Dialog DisplyDlg; //확인버튼을 눌렀을 때 결과를 출력할 대화상자
   
   public SwingExam_Information(String t) {
      // TODO Auto-generated constructor stub
      
      super(t);
      
/*      Container contentPane = getContentPane();
      contentPane.setLayout(new FlowLayout());
*/

      getContentPane().setLayout(new FlowLayout());
      
      setForm();
      //리스너추가
      btn1.addActionListener(this);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(350, 300);
      setVisible(true);
      
   }
   
   public void setForm(){
      
      Label lbl1 = new Label("아이디 입력:");
      Label lbl2 = new Label("비밀번호 입력:");
      Label lbl3 = new Label("비밀번호 재입력:");
      
      txtID = new TextField(20);
      txtPwd1 = new TextField(20); 
      txtPwd2 = new TextField(20);
      
      //비밀번호를 * 표시하기 위해 setEchoChar()메서드 이용
      txtPwd1.setEchoChar('*');
      txtPwd2.setEchoChar('*');
      
      //레이아웃에 추가
      add(lbl1);add(txtID);
      add(lbl2);add(txtPwd1);
      add(lbl3);add(txtPwd2);
      
      //라디오버튼을 그룹으로 만듬
      ButtonGroup group = new ButtonGroup();
      man = new JRadioButton("남자", false);
      woman = new JRadioButton("여자", false);

      //라디오버튼을 버튼그룹에 추가
      group.add(man);
      group.add(woman);

      //컴포넌트에 버튼그룹 추가
      getContentPane().add(man);
      getContentPane().add(woman);

      btn1 = new JButton("확인");
      add(btn1);
      
   }
   
   @Override
   public void actionPerformed(ActionEvent e) {
      // TODO Auto-generated method stub
      
      JFrame f = new JFrame();
      DisplyDlg = new Dialog(f,"정보확인");
      
      JLabel ID = new JLabel(txtID.getText());
      JLabel Pwd = new JLabel(txtPwd1.getText());
      
      DisplyDlg.setLayout(new FlowLayout());
      DisplyDlg.add(ID);
      DisplyDlg.add(Pwd);
      
      //라디오버튼이라 둘 중 하나만 가져옴
      if(man.isSelected())
         DisplyDlg.add(new JLabel("Man"));
      else
         DisplyDlg.add(new JLabel("Woman"));
      
      //다이얼로그 크기와 보여줄지 여부
      DisplyDlg.setSize(200,100);
      DisplyDlg.setVisible(true);
      
   }
   
   
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      
      new SwingExam_Information("개인정보");
      
   }

}