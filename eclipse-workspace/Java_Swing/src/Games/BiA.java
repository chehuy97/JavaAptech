package Games;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;


public class BiA extends JFrame implements MouseListener,MouseMotionListener {
	public static void main(String[] args) {
		new BiA();
	}
	int sx=600,sy=400,os=50;
	Image img;
	Ball b,b2;
	Graphics gg;
	int mx,my;
	boolean press=false;
	public BiA() {
		this.setTitle("Bi A");
		this.setSize(sx+os*2,sy+os*2);
		this.setDefaultCloseOperation(3);
		this.setResizable(false);
		
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		new Thread().start();
		this.setVisible(true);
//		b=new Ball(sx/2,sy/2,sx,sy,0,0,30,1,0.5);
        b=new Ball(sx/2,sy/2,sx,sy,0,0,30,1,0.5);
        b.start();
        b2=new Ball(sx/2,sy/2,sx,sy,0,0,30,1,0.5);
        b2.start();
		
	}
	public void paint(Graphics g) {
		if(gg==null)
			return;
		gg.setColor(Color.WHITE);
		gg.fillRect(0, 0, sx, sy);
//		if(press) {
//			gg.setColor(Color.CYAN);
//		}
//		else 
		gg.setColor(Color.RED);		
        gg.setColor(Color.RED);
        gg.fillOval(b.getX()-b.getR(),b.getY()-b.getR(),b.getR()*2,b.getR()*2);
        gg.setColor(Color.BLUE);
        gg.drawOval(b.getX()-b.getR(),b.getY()-b.getR(),b.getR()*2,b.getR()*2);
//		gg.fillOval(x, y, width, height);
//		gg.setColor(c);
//		gg.drawOval(x, y, width, height);
		
		
//		gg.setColor(c);
//		gg.fillOval(x, y, width, height);
//		gg.setColor(c);
//		gg.drawOval(x, y, width, height);
	
	if(press) {
		gg.setColor(Color.GREEN);
		gg.drawImage(img, os, os, null);
	}
	
	}
	  @Override
	    public void mouseReleased(MouseEvent e) {
	        if(press){
	            press=false;
	            mx=e.getX()-os;
	            my=e.getY()-os;
	            b.setVx((b.getX()-mx)/10);
	            b.setVy((b.getY()-my)/10);
	        }
	    }

	    @Override
	    public void mouseEntered(MouseEvent e) {

	    }

	    @Override
	    public void mouseExited(MouseEvent e) {

	    }

	    @Override
	    public void mouseDragged(MouseEvent e) {
	        mx=e.getX()-os;
	        my=e.getY()-os;
	        this.repaint();
	    }

	    @Override
	    public void mouseMoved(MouseEvent e) {

	    }
		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
}
