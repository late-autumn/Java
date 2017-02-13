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

//�гη� ��� ������ �Է��� ���� Ŭ����

/******************************************************************
 * ����ڷκ��� �Է��� �ްų� ó���� ����� �����ֱ� ���� ���ø����̼��� ���������̼� ����� ����
 * ����ڰ� ���� ����� �� �ֵ��� UI ������Ʈ�� �迭�ϰ� �׺���̼� ��å�� ����
 * 
 * AddPane():��������Է� �� ��ü�� ������ �Է� �ޱ� ���� �ؽ�Ʈ �ʵ� �迭, 
 *            �����ϱ� ��ư, �ٽþ��� ��ư���� ������ ����
 * 
 * actionPerformed(): �����ϱ� ��ư�� ������ �ؽ�Ʈ�ʵ��� ������ �����ͺ��̽��� ������
 *                 �ٽþ����ư�� ������ �ؽ�Ʈ�ʵ��� ������ �ʱ�ȭ ��
 ******************************************************************/

public class AddPane extends JPanel implements ActionListener, ItemListener {
   
   //Swing ���ø��
   private JPanel jp[] = new JPanel[6];
   private JLabel jl[] = new JLabel[5];
   private JTextField tf[] = new JTextField[5];
   private JButton okb;
   private JButton rsb;
   private int department = 10;
   
   //����
   String[] caption = {"�� ��:", "�� å:", "�� ��:", "�� ��:"};
   
   public AddPane() {
      // TODO Auto-generated constructor stub
      
      setLayout(new GridLayout(6,1));
      EtchedBorder eb = new EtchedBorder();
      setBorder(eb);
      
      //�Է¹��� �׸��� ����
      int size = caption.length;
      
      //�ؽ�Ʈ�ʵ�� ���̺��� �гο� ��� AddPane�� ����
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
      combo.addItem("�μ���ȣ�� �����ϼ���");
      
      for(int c = 1; c <=5; c++){
         combo.addItem(c*10);
      }
      
      jp[i].add(combo);
      
      //
      combo.addItemListener(this);
      
      jp[size] = new JPanel();
      okb = new JButton("�����ϱ�");
      okb.addActionListener(this);
      //
      rsb = new JButton("�ٽþ���");
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
            JOptionPane.showMessageDialog(this, tf[0].getText()+"���� ���������� �߰���");
         
      }else if(ae_type.equals(rsb.getText())){
         int size = caption.length;
         
         for(int i =0; i<size-1; i++){
            
            tf[i].setText("");
            
         }
      }

   }

}