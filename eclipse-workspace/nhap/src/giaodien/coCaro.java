package giaodien;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JFrame;

public class coCaro extends JFrame implements MouseListener  {
	public static void main(String[] args) {
		new coCaro();
	}
	int so = 20;
	int s = 30;
	int of = 50;
	ArrayList<Point> dadanh = new ArrayList<Point>();	
	
	public coCaro() {
		this.setTitle("co caro");
		this.setSize(so*s+of*2,so*s+of*2);
		this.setDefaultCloseOperation(3);
		this.addMouseListener(this);
		
		this.setVisible(true);
	}	
	
	public void paint(Graphics g) {
		
//		g.setColor(Color.YELLOW);
//		g.fillRect(50, 50, 100, 60);
//		g.fillOval(50, 150, 100, 60);
//	
//		g.setColor(Color.BLUE);
//		g.drawRect(50, 50, 100, 60);
//		g.drawOval(50, 150, 100, 60);
		
		g.setColor(Color.white);
		g.fillRect(0, 0,this.getWidth(), this.getHeight());
		g.setColor(Color.BLUE);
		for(int i=0;i<=so;i++) {
			g.drawLine(of,of + i*s,of + so*s,of + i*s);
			g.drawLine(of + i*s, of,of + i*s,of + so*s);
	}				
		g.setFont(new Font("arial",Font.PLAIN,s));
		for(int i = 0;i<dadanh.size();i++)
		 {
			Color c = Color.blue;
			String str = "x";
			if(i%2==0) {
				str = "o";
				c = Color.red;
			}
			g.setColor(c);
			g.drawString(str, of + s * dadanh.get(i).x + s * 1 / 4, of + s * dadanh.get(i).y + s * 3 / 4);
		 }


	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int x= e.getX();
		int y = e.getY();
		System.out.println(x+" "+y);
		if(x<of || x >= of+ s * so )
		return;
		if(y<of || y >= of+ s * so )
			return;
		//System.out.println("ben trong");
		int ix = (x - of )/s;
		int iy = (y - of )/s;
		//System.out.println(ix +" " +iy);
		if(dadanh.contains(new Point(ix,iy)))
				return;
		dadanh.add(new Point(ix,iy));
		this.repaint();
		
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
}
