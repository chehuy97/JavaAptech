package nhap;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;

public class vidu extends JFrame implements MouseListener{
	public static void main(String[] args) {
		new vidu();
	}
	int s = 40;
	int so = 2;
	int of = 50;
	
	int [][] mang;
	boolean won = false;
	public vidu(){
		this.setTitle("Game Xep So");
		this.setSize(of*2+s*so, of*2+s*so);
		this.setDefaultCloseOperation(3);
		this.addMouseListener(this);
		
		mang = new int[so][];
		for (int i=0;i<so;i++){
			mang[i] = new int[so];
			for (int j=0;j<so;j++)
				mang[i][j] = (i*so+j+1)%(so*so);
		}
		for (int i=0;i<1000;i++)
			tronmang(mang);
		
		this.setVisible(true);
	}
	
	Random rand = new Random();
	private void tronmang(int[][] m) {
		int x =0,y=0;
		for (int i=0;i<so;i++)
			for (int j=0;j<so;j++)
			if (mang[i][j]==0){
				x=j;
				y=i;
			}
		int dx[] = {0,0,-1,1};
		int dy[] = {-1,1,0,0};
		int r = rand.nextInt(4);
		
		if (x+dx[r]<0 || x+dx[r]>=so) return;
		if (y+dy[r]<0 || y+dy[r]>=so) return;
		
		int temp = mang[y][x];
		mang[y][x] = mang[y+dy[r]][x+dx[r]];
		mang[y+dy[r]][x+dx[r]] = temp;
	}

	public void paint(Graphics g){
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, this.getWidth(), this.getWidth());
		
		g.setColor(Color.BLACK);
		for (int i=0;i<=so;i++){
			g.drawLine(of, of+i*s, of+s*so, of+i*s);
			g.drawLine(of+i*s, of, of+i*s, of+s*so);
		}
		g.setFont(new Font("arial", Font.BOLD, s/2));
		for (int i=0;i<so;i++){
			for (int j=0;j<so;j++)
				if (mang[i][j]!=0){
					String str = ""+mang[i][j];
					int x = j*s+of+s/4;
					int y = i*s+of+s*3/4;
					g.drawString(str, x, y);
				}
		}
		
		if (won){
			g.setColor(Color.WHITE);
			g.fillRect(0, 0, this.getWidth(), this.getWidth());
			g.setColor(Color.RED);
			g.drawString("You Win!!", of, so*s);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		
		if (x<of || x>=of+s*so) return;
		if (y<of || y>=of+s*so) return;
		
		int ix = (x - of)/s;
		int iy = (y - of)/s;
		Point p = new Point(ix, iy);
		
		int dx[] = {0,0,-1,1};
		int dy[] = {-1,1,0,0};
		for (int r = 0;r<4;r++){
			if (ix+dx[r]<0 || ix+dx[r]>=so) continue;
			if (iy+dy[r]<0 || iy+dy[r]>=so) continue;
			if (mang[iy+dy[r]][ix+dx[r]]==0){
				int temp = mang[iy][ix];
				mang[iy][ix] = mang[iy+dy[r]][ix+dx[r]];
				mang[iy+dy[r]][ix+dx[r]] = temp;
				break;
			}
		}
		won = true;
		for (int i=0;i<so;i++){
			for (int j=0;j<so;j++)
				if (mang[i][j] != (i*so+j+1)%(so*so)) won = false;
		}
		
		
		System.out.println(ix+" "+iy);
		
		this.repaint();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}















