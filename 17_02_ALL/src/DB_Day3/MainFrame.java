package DB_Day3;

import java.awt.Dimension;
import javax.swing.*;
import javax.swing.JTabbedPane;

public class MainFrame extends JFrame{

	private JTabbedPane tp; 
	private AddPane ap;
	private FindPane fp;
	private TotalPane tpa;
	
	
	
	public MainFrame() {
		/*
		 * �����ӿ� ������� �Է� �ǰ� ������� ��ȸ �� ��ü�� �����ϰ� �����ӿ� �߰���
		 * ���� �����ϱ� ���� jTabbedPane ��ü�� �����ϰ�, JTabbedPane��ü�� 
		 * tp�� ������� �Է��гΰ� ������� ��ȸ �г��� �߰��� �� �����ӿ� tp�� �߰���
		 * 
		 */
		
		tp = new JTabbedPane();
		ap = new AddPane();
		fp = new FindPane();
		tpa = new TotalPane();
		
		tp.addTab("��������Է�",ap);
		tp.addTab("���������ȸ",fp);
		tp.addTab("���������ü����",tpa);
		
		getContentPane().add(tp);
		setTitle("�������");
		
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
	
	public static void main(String[] args) {
		
		MainFrame mf = new MainFrame();
		mf.setSize(600,600);
	}
}
