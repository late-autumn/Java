package Day26.swing;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.*;
public class DoubleBufferingEx extends Frame implements KeyListener, Runnable {

	Image image;
	int x, y, mx, my, sel;
	Graphics bufferGraphics;
	Image bufferImage;
	
	
	
	
	
	@Override
	public void run() {
		while(true){
			x+=mx;
			y+=my;
			if(sel%2==0){
				sel++;
			}
			else sel--;
			
			if(x<-500)
				x = 500;
			if(x>=500)
				x=0;
			if(y<=-500)
				y=500;
			if(y>=500)
				y=0;
			try{
				repaint();
				Thread.sleep(100);
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		if(e.getKeyCode()==e.VK_LEFT){
			mx-=10; my=0;sel=0;
		}else if(e.getKeyCode()==e.VK_RIGHT){
			mx=10; my=0; sel=2;
		}else if(e.getKeyCode()==e.VK_UP){
			mx=0;my-=10;sel=4;
		}else if(e.getKeyCode()==e.VK_DOWN){
			mx=0;my=10;sel=6;
		}else if(e.getKeyCode()==e.VK_ESCAPE){
			System.exit(0);
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {}

	@Override
	public void keyTyped(KeyEvent e) {}
	
	public DoubleBufferingEx(){
		super("팩맨");
		
		image = Toolkit.getDefaultToolkit().getImage("src/img/packman.jpg");
		x = 255; y = 255; mx = 0; my = 0;  sel =0;
		
		Thread t = new Thread(this);
		t.start();
		setBounds(200,200,500,500);
		setVisible(true);
		addKeyListener(this);
		addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
			System.exit(0);
			}
		});
		
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		if(bufferImage !=null)
			g.drawImage(bufferImage, 0, 0, this);
	}
	
	@Override
	public void update(Graphics g) {
		// TODO Auto-generated method stub
		Dimension d = getSize();
		
		if(bufferGraphics==null){
			bufferImage = createImage(d.width,d.height);	//그래픽을만들어준다.
			bufferGraphics = bufferImage.getGraphics();		//만든 그래픽을 가져온다.
		}
		bufferGraphics.setColor(getBackground());			//그래픽에 백그라운드 설정
		bufferGraphics.fillRect(0, 0, 500, 500);			//시작점은 0,0 가로 세로 크기 500 500
		//로딩된 이미지 x,y좌표 기준으로 하여 넓이와 폭만큼그려준다.
		bufferGraphics.drawImage(image,x,y, x+50, y+50, sel*50,0,sel*50+50,50,this);
		
		paint(g);
	
	
	}
	
	public static void main(String[] args) {
		new DoubleBufferingEx();
	}
	

}
