package giaodien;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JFrame;


public class LatHinh extends JFrame implements MouseListener {
	public static void main(String[] args) {
		new LatHinh();
	}
	int so =5;
	int s = 80;
	int of = 30;
	int d =20;
	ArrayList<Point> dadanh = new ArrayList<Point>();
	public LatHinh() {
		this.setTitle("Game Lat Hinh");
		this.setSize(700,720);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		this.setVisible(true);
	}
	public void paint(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		g.setColor(Color.BLACK);	
		for(int i = 0;i<=so;i++) {
			for(int j =0;j<=so;j++) {
			g.setColor(Color.CYAN);
			g.fillRect(of+(of+s)*j, of+d+(of+s)*i, s, s);
			
			}
			g.setFont(new Font("arial", Font.PLAIN, s));
			g.setColor(Color.BLACK);		
			g.drawString("1", 65,90);
			g.drawString("2", 175,90);
			g.drawString("3", 285,90);
			g.drawString("4", 395,90);
			g.drawString("5", 505,90);
			g.drawString("6", 615,90);
			g.drawString("7", 65,200);
			g.drawString("8", 175,200);
			g.drawString("9", 285,200);
			g.drawString("10", 395,200);
			g.drawString("11", 505,200);
			g.drawString("12", 615,200);
			g.drawString("13", 65,310);
			g.drawString("14", 175,310);
			g.drawString("15", 285,310);
			g.drawString("16", 395,310);
			g.drawString("17", 505,310);
			g.drawString("18", 615,310);
			g.drawString("1", 65,420);
			g.drawString("2", 175,420);
			g.drawString("3", 285,420);
			g.drawString("4", 395,420);
			g.drawString("5", 505,420);
			g.drawString("6", 615,420);
			g.drawString("7", 65,530);
			g.drawString("8", 175,530);
			g.drawString("9", 285,530);
			g.drawString("10", 395,530);
			g.drawString("11", 505,530);
			g.drawString("12", 615,530);
			g.drawString("13", 65,640);
			g.drawString("14", 175,640);
			g.drawString("15", 285,640);
			g.drawString("16", 395,640);
			g.drawString("17", 505,640);
			g.drawString("18", 615,640);			
			
		}

		
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
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
