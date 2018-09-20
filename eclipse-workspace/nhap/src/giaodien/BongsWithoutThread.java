package giaodien;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;

public class BongsWithoutThread extends JFrame {
	
	Random rd = new Random();
	int n = 3;
	int x[], y[], dx[], dy[], r[];
	
	public BongsWithoutThread() {
		this.setTitle("Ball");
		this.setSize(600, 400);
		this.setDefaultCloseOperation(3);
		
		x = new int [n];
		y = new int [n];
		dx = new int [n];
		dy = new int [n];
		r = new int[n];
		
		for (int i = 0; i < n; i++) {
			x[i] = rd.nextInt(400) + 100;
			y[i] = rd.nextInt(200) + 100;
			r[i] = rd.nextInt(10) + 20;
			dx[i] = rd.nextInt(10) - 5;
			dy[i] = rd.nextInt(10) - 5;
		}
		
		this.setVisible(true);
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		g.setColor(Color.blue);
		for (int i = 0; i < n; i++) {
			g.fillOval(x[i] - r[i], y[i] - r[i], 2*r[i], 2*r[i]);
			
			//c?p nh?t to? d?
			x[i] += dx[i];
			y[i] += dy[i];
			
			if (x[i] < r[i] || x[i] + r[i] > this.getWidth()) dx[i] *= -1;
			if (y[i] < r[i] || y[i] + r[i] > this.getHeight()) dy[i] *= -1;
		}
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.repaint();
	}
	
	public static void main(String[] args) {

		new BongsWithoutThread();
	}

}

