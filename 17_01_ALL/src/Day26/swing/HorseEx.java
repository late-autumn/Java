package Day26.swing;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class HorseEx extends JFrame implements Runnable {

	
	private Canvas canvas;
	private Image buffer;
	private Image[] horse;
	//반복처리
	private boolean bRepeat = true;
	
	public HorseEx() {
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		initHorse();
		this.add(canvas = new Canvas(){
			@Override
			public void paint(Graphics g) {
				// TODO Auto-generated method stub
				g.drawImage(buffer, 0, 0, this);
			}

		@Override
		public void update(Graphics g) {
			// TODO Auto-generated method stub
			paint(g);
		}
		
	
		});
		canvas.addKeyListener(new KeyAdapter() {
			
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			int code = e.getKeyCode();
			
			switch(code){
			
			case KeyEvent.VK_SPACE:
				bRepeat = !bRepeat;
				
				if(bRepeat)		//쓰레드 가동
					makeThread();
					break;
			
			
			}//end switch
		}
			
			
		});
		
		setBounds(300, 100, 400, 400);
		setVisible(true);
		makeThread();
	}
	
	public void makeThread(){
		new Thread(this).start();	//ㅆ레드 시작 메소드 호출 
	}
	
	//초기화
	
	public void initHorse(){
		
		horse = new Image[11];
		for(int i=0; i<horse.length;i++){
			horse[i] = Toolkit.getDefaultToolkit().getImage(String.format("src/img/1.png",i+1));
			//horse[i] = Toolkit.getDefaultToolkit().getImage(String.format("src/img/black%02d.png",i+1));
		}
	}
	
	public void bufferPaint(int n){
		buffer = createImage(canvas.getWidth(),canvas.getHeight());
		Graphics buffer_g = buffer.getGraphics();
		buffer_g.drawImage(horse[n], 50, 50, this);
		canvas.repaint();
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub

		while(true){
			for(int i=0; i<horse.length;i++){
				
				if(!bRepeat)return;
				
				try {
					Thread.sleep(50);
					
				} catch (InterruptedException e) {
					
				}
				bufferPaint(i);
			}
		}
	}
	
	public static void main(String[] args) {
		new HorseEx();
		
		
	}

}
