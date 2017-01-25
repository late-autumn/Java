package Day24.event;


import Day24.awt.WinEvent;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEventex2 extends Frame implements ActionListener {

	private Button[] bt = new Button[4];
	private Panel[] pp = new Panel[4];
	private Color[] cc = {
			Color.red, Color.YELLOW, Color.GREEN, Color.BLUE
	};
	
	private CardLayout card = new CardLayout();
	private Panel pptop;
		
	public ActionEventex2() {
		super("Card Layout");
		setLayout(new BorderLayout());
		
		Panel p = new Panel(new GridLayout(1, 4));
		
		for(int i=0; i<bt.length;i++){
			bt[i] = new Button(i+1+"¹ø ¹öÆ°");
			bt[i].addActionListener(this);
			p.add(bt[i]);
		}
		add("North", p);
		
		pptop = new Panel(card);
		
		for(int i=0; i<pp.length;i++){
			pp[i] = new Panel();
			pp[i].setBackground(cc[i]);
			pptop.add(""+i,pp[i]);
		}
		add("Center",pptop);
		
		card.show(pptop, "0");
		setSize(300, 200);
		setVisible(true);
		WinEvent event = new WinEvent();
		addWindowListener(event);
		
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		for(int i=0;i<4;i++){
			if(arg0.getSource()==bt[i]){
				card.show(pptop, ""+i);
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		
		new ActionEventex2();
	}



}
