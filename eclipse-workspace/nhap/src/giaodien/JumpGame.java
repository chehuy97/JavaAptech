package giaodien;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class JumpGame extends JFrame implements Runnable, KeyListener {

	int sx = 600, sy = 500;
	int neny = 350;
	int ox = 0;
	Graphics gg;
	Image img;
	Image chim, cay,sanbong;
	Chim chi = new Chim(100, neny, 60, 60, neny, 0, 10);
	
	//mang cac cay
	int []cayx = new int[1000];
	
	Random rand = new Random();
	
	public static void main(String[] args) {
		new Thread(new JumpGame()).run();
	}

	public JumpGame() {
		this.setTitle("Jump Game");
		this.setSize(sx, sy);
		this.setDefaultCloseOperation(3);
		
		try {
			chim = ImageIO.read(new File("C:\\Users\\Quang Huy\\eclipse-workspace\\nhap\\src\\chim.jpg"));
			cay = ImageIO.read(new File("C:\\Users\\Quang Huy\\eclipse-workspace\\nhap\\src\\cay.jpg"));
			sanbong = ImageIO.read( new File("C:\\Users\\Quang Huy\\eclipse-workspace\\nhap\\src\\sanbong.jpg"));
		} catch (IOException e) {
			System.out.println("Error load image");
		}
		
		this.setVisible(true);
		
		for (int i = 0; i < cayx.length; i++) {
			cayx[i] = rand.nextInt(cayx.length*200) + sx;
		}
		
		Arrays.sort(cayx);
		
		img = this.createImage(sx, sy);
		gg = img.getGraphics();
		
		chi.start();
		this.addKeyListener(this);
	}
	
	public void paint(Graphics g) {
		if (gg == null) return;
		gg.setColor(Color.white);
		gg.fillRect(0, 0, sx, sy);
		
		for (int i = 0; i < cayx.length; i++) {
			if (cayx[i] >= ox && cayx[i] <= sx+ox)
				gg.drawImage(cay, cayx[i] - ox, neny - 100, 30, 100, null);
		}
		
		gg.setColor(Color.red);
		gg.drawLine(0, neny, sx, neny);
		gg.drawImage(chim, chi.getX(), chi.getY() - chi.getCy(), chi.getCx(), chi.getCy(), null);
		
		
		g.drawImage(img, 0, 0, null);
	}
	
	@Override
	public void run() {

		while (true) {
			boolean ok = true;
			for (int i = 0; i < cayx.length; i++) {
				if (cayx[i]-ox >= chi.getX() && cayx[i]-ox <= chi.getX()+chi.getCx() && neny-chi.getY() < 70) {
					ok = false;
					chi.kill();
					break;
				}
			}
			if (ok) {
				ox += 4;
			}
			repaint();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		if (arg0.getKeyCode() == KeyEvent.VK_SPACE) {
			chi.jump();
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {

	}

}

