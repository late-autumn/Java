package Day1.swing;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Calculater extends JFrame implements ActionListener{

	String[] num = {"0","1","2","3","4","5",
			        "6","7","8","9",".","="};	
	String[] num2 = {"+","-","*","/"};
	
	JButton[] bt = new JButton[num.length];
	JButton[] giho = new JButton[num2.length];
	JButton clear, back;
	String temp ="";
	
	Panel p1 = new Panel();
	Panel p2 = new Panel();
	Panel p3 = new Panel();
	
	double[] num1 = new double[10];
	String sign;
	
	boolean jum = false;
	double result;
	int cnt;
	
	private Label lb1 = new Label("", Label.RIGHT);
	private Label lb2 = new Label("", Label.RIGHT);
	
	
	public Calculater() {
		// TODO Auto-generated constructor stub
		super("계산기");
		
				
		init();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600,200,200,300);
		setVisible(true);
		setResizable(false);
		
	}
	
	public void init()
	{
		
		setFont(new Font("돋움체", Font.BOLD, 15));
		
		lb1.setBackground(Color.white);
		lb2.setBackground(Color.white);
		
		clear = new JButton("c");
		back = new JButton("back");
		
		for(int i = 0; i<num.length;i++)
		{
			bt[i] = new JButton(num[i]);
		}
		
		for(int i = 0; i<num2.length;i++)
		{
			giho[i] = new JButton(num2[i]);
		}
		
		// 숫자, 기호 버튼 배치

		for(int i = 7; i<bt.length;i++)
		{
			p1.add(bt[i]);
			
			if(i == 9)
			{
				p1.add(giho[0]);
				i -= 6;
				
			}
			else if(i == 6)
			{
				p1.add(giho[1]);
				i -= 6;
			}
			
			else if(i == 3)
			{
				p1.add(giho[2]);
				i += 6;
			}
			
			else if(i == 10) i = -1;
			else if (i == 0) i += 10;
			
			p1.add(giho[3]);
		}
		p1.setLayout(new GridLayout(4, 4, 2, 2));
		add("South", p1);
		
		p2.setLayout(new GridLayout(1, 2, 2, 2));
		p2.add(clear);
		p2.add(back);
		
		p3.setLayout(new GridLayout(3,1,2,2));
		p3.add(lb1);
		p3.add(lb2);
		p3.add(p2);
		add("Center", p3);
		
		//이벤트 처리
		
		for(int i = 0; i<bt.length; i++)
		{
			bt[i].addActionListener(this);
		}
		for(int i = 0; i<giho.length; i++)
		{
			giho[i].addActionListener(this);
		}
		
		clear.addActionListener(this);
		back.addActionListener(this);
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		// 숫자를 누르면 숫자가 나오게 하는이벤트
		
		for(int i = 0; i<=10;i++)
		{
			
			if(e.getSource() == bt[i])
			{
				
				if(e.getSource() == bt[10])
				{
					
					jum = true;
					temp += num[10];
					lb1.setText(temp);
					break;
								
				}
				temp += ""+i;
				lb1.setText(temp);
			}
		}
		
		// clear
		if(e.getSource() == clear)
		{
			jum = false;
			temp ="";
			lb1.setText(temp);
			lb2.setText(temp);
			result = 0;
					
		}
		
		//back
		else if(e.getSource() == back)
		{
			if(!lb1.getText().equals(""))
			{
			temp = temp.substring(0, temp.length()-1);
			lb1.setText(temp);
			}
		}
		// 기호
		for(int i = 0; i<giho.length; i++)
		{
			if(e.getSource() == giho[i])
			{
			   sign = num2[i];
			   num1[cnt] = Double.parseDouble(lb1.getText());
			   temp ="";
			   lb1.setText(temp);
			   cnt++;
			}
		}
		
		// 소수점이 포함되어 있는 경우
		
		if(jum == true)
		{
			if(e.getSource() == bt[11])
			{
				num1[cnt] = Double.parseDouble(lb1.getText());
				
				for(int i = 1; i<=cnt;i++)
				{
					result = num1[0];
					
					if(sign == num2[0])
					{
						result += num1[i];
					}
					else if(sign == num2[1])
					{
						result -= num1[i];
					}
					else if(sign == num2[2])
					{
						result *= num1[i];
					}
					else if(sign == num2[3])
					{
						result /= num1[i];
					}
				
				}
				lb2.setText(result +"");
				cnt = 0;
			}
				
		}
		
		// 소수점 미 포함되어 있는 경우
		if(jum == false)
		{
			if(e.getSource() == bt[11])
			{
				num1[cnt] = Double.parseDouble(lb1.getText());
				
				for(int i = 1; i<=cnt;i++)
				{
					result = num1[0];
					
					if(sign == num2[0])
					{
						result += num1[i];
					}
					else if(sign == num2[1])
					{
						result -= num1[i];
					}
					else if(sign == num2[2])
					{
						result *= num1[i];
					}
					else if(sign == num2[3])
					{
						result /= num1[i];
					}
				
				}
				lb2.setText((int)result +"");
				cnt = 0;
			}
	
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Calculater(); 
	}

}
