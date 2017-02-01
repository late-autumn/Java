package Day26.swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingExam_Information extends JFrame implements ActionListener{

   JRadioButton man, woman; //������ư
   JButton btn1; //��ư
   TextField txtID, txtPwd1, txtPwd2; //�ؽ�Ʈ�ʵ�
   Dialog DisplyDlg; //Ȯ�ι�ư�� ������ �� ����� ����� ��ȭ����
   
   public SwingExam_Information(String t) {
      // TODO Auto-generated constructor stub
      
      super(t);
      
/*      Container contentPane = getContentPane();
      contentPane.setLayout(new FlowLayout());
*/

      getContentPane().setLayout(new FlowLayout());
      
      setForm();
      //�������߰�
      btn1.addActionListener(this);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(350, 300);
      setVisible(true);
      
   }
   
   public void setForm(){
      
      Label lbl1 = new Label("���̵� �Է�:");
      Label lbl2 = new Label("��й�ȣ �Է�:");
      Label lbl3 = new Label("��й�ȣ ���Է�:");
      
      txtID = new TextField(20);
      txtPwd1 = new TextField(20); 
      txtPwd2 = new TextField(20);
      
      //��й�ȣ�� * ǥ���ϱ� ���� setEchoChar()�޼��� �̿�
      txtPwd1.setEchoChar('*');
      txtPwd2.setEchoChar('*');
      
      //���̾ƿ��� �߰�
      add(lbl1);add(txtID);
      add(lbl2);add(txtPwd1);
      add(lbl3);add(txtPwd2);
      
      //������ư�� �׷����� ����
      ButtonGroup group = new ButtonGroup();
      man = new JRadioButton("����", false);
      woman = new JRadioButton("����", false);

      //������ư�� ��ư�׷쿡 �߰�
      group.add(man);
      group.add(woman);

      //������Ʈ�� ��ư�׷� �߰�
      getContentPane().add(man);
      getContentPane().add(woman);

      btn1 = new JButton("Ȯ��");
      add(btn1);
      
   }
   
   @Override
   public void actionPerformed(ActionEvent e) {
      // TODO Auto-generated method stub
      
      JFrame f = new JFrame();
      DisplyDlg = new Dialog(f,"����Ȯ��");
      
      JLabel ID = new JLabel(txtID.getText());
      JLabel Pwd = new JLabel(txtPwd1.getText());
      
      DisplyDlg.setLayout(new FlowLayout());
      DisplyDlg.add(ID);
      DisplyDlg.add(Pwd);
      
      //������ư�̶� �� �� �ϳ��� ������
      if(man.isSelected())
         DisplyDlg.add(new JLabel("Man"));
      else
         DisplyDlg.add(new JLabel("Woman"));
      
      //���̾�α� ũ��� �������� ����
      DisplyDlg.setSize(200,100);
      DisplyDlg.setVisible(true);
      
   }
   
   
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      
      new SwingExam_Information("��������");
      
   }

}