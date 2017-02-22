package DB_Day3;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

//패널로 사원 정보를 입력을 위한 클래스

/******************************************************************
 * 사용자로부터 입력을 받거나 처리된 결과를 보여주기 위한 어플리케이션의 프리젠테이션 기능을 구현
 * 사용자가 쉽게 사용할 수 있도록 UI 컴포넌트를 배열하고 네비게이션 정책을 수립
 * 
 * AddPane():사원정보입력 탭 객체는 정보를 입력 받기 위한 텍스트 필드 배열, 
 *            저장하기 버튼, 다시쓰기 버튼으로 구성할 것임
 * 
 * actionPerformed(): 저장하기 버튼을 누르면 텍스트필드의 내용을 데이터베이스에 저장함
 *                 다시쓰기버튼을 누르면 텍스트필드의 내용을 초기화 함
 ******************************************************************/

public class AddPane extends JPanel implements ActionListener, ItemListener {
   
   //Swing 관련멤버
   private JPanel jp[] = new JPanel[6];
   private JLabel jl[] = new JLabel[5];
   private JTextField tf[] = new JTextField[5];
   private JButton okb;
   private JButton rsb;
   private int department = 10;
   
   //제목
   String[] caption = {"이 름:", "직 책:", "메 일:", "부 서:"};
   
   public AddPane() {
      // TODO Auto-generated constructor stub
      
      setLayout(new GridLayout(6,1));
      EtchedBorder eb = new EtchedBorder();
      setBorder(eb);
      
      //입력받을 항목의 개수
      int size = caption.length;
      
      //텍스트필드와 레이블을 패널에 묶어서 AddPane에 붙임
      int i;
      for(i=0; i<size-1; i++){
         
         jp[i] = new JPanel();
         jl[i] = new JLabel(caption[i]);
         tf[i] = new JTextField(15);
         jp[i].add(jl[i]);
         jp[i].add(tf[i]);
         add(jp[i]);
         
      }
      
      jp[i] = new JPanel();
      jl[i] = new JLabel(caption[i]);
      jp[i].add(jl[i]);
      add(jp[i]);
      
      JComboBox combo = new JComboBox();
      combo.addItem("부서번호를 선택하세요");
      
      for(int c = 1; c <=5; c++){
         combo.addItem(c*10);
      }
      
      jp[i].add(combo);
      
      //
      combo.addItemListener(this);
      
      jp[size] = new JPanel();
      okb = new JButton("저장하기");
      okb.addActionListener(this);
      //
      rsb = new JButton("다시쓰기");
      rsb.addActionListener(this);
      //
      
      jp[size].add(okb);
      jp[size].add(rsb);
      
      add(jp[size]);
      
   }
   

   @Override
   public void itemStateChanged(ItemEvent ie) {
      // TODO Auto-generated method stub
      
      if(ie.getStateChange() == ItemEvent.SELECTED)
         department = Integer.parseInt(ie.getItem().toString());

   }

   @Override
   public void actionPerformed(ActionEvent ae) {
      // TODO Auto-generated method stub
      
      String ae_type = ae.getActionCommand();
      EmployeeVO evo = null;
      EmployeeDAO edvo = null;
      
      if(ae_type.equals(okb.getText())){
         
         try {
            evo = new EmployeeVO(0, tf[0].getText(), tf[1].getText(), department, tf[2].getText());
            
            edvo = new EmployeeDAO();
            edvo.getEmployeeregiste(evo);
            
         } catch (Exception e) {
            System.out.println("e: ["+e+"]");
         }
         
         if(edvo != null)
            JOptionPane.showMessageDialog(this, tf[0].getText()+"님이 성공적으로 추가됨");
         
      }else if(ae_type.equals(rsb.getText())){
         int size = caption.length;
         
         for(int i =0; i<size-1; i++){
            
            tf[i].setText("");
            
         }
      }

   }

}