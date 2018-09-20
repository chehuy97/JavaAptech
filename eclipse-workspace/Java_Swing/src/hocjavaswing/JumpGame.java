package hocjavaswing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Paint;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.security.Key;
import java.time.Year;
import java.util.Arrays;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JFrame;



public class JumpGame extends JFrame implements Runnable, KeyListener {
	int sx = 600, sy = 500;
	int cx = 100, cy = 300;
	int ox = 0;
	Image chim, cay, img;
	Graphics gg;
	int neny = 350;
	Chim chim2 = new Chim(100, neny, 60, 60, neny, 0, 10);
	int[] cayx = new int[1000];
	Random rand = new Random();

	public static void main(String[] args) {
		new Thread(new JumpGame()).run();
	}

	public JumpGame() {
		this.setTitle("JumpGame");
		this.setSize(sx, sy);
		this.setDefaultCloseOperation(3);

		try {
			chim = ImageIO.read(new File("C:\\Users\\Quang Huy\\eclipse-workspace\\nhap\\src\\chim.jpg"));
			cay = ImageIO.read(new File("C:\\Users\\Quang Huy\\eclipse-workspace\\nhap\\src\\cay.jpg"));

		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("error load image");
		}

		this.setVisible(true);
		for (int i = 0; i < cayx.length; i++) {
			cayx[i] = rand.nextInt(cayx.length * 200) + sx;
		}
		Arrays.sort(cayx);
		img = createImage(sx, sy);
		gg = img.getGraphics();

		chim2.start();
		this.addKeyListener(this);
	}

	public void paint(Graphics g) {
		  if(gg==null)
	            return;
		gg.setColor(Color.WHITE);
		gg.fillRect(0, 0, sx, sy);
		for (int i = 0; i < cayx.length; i++) {
			if (cayx[i] >= 0 && cayx[i] <= sx) {
				gg.drawImage(cay, cayx[i], neny - 100, 30, 100, null);
			}
		}
		gg.setColor(Color.RED);
		gg.drawLine(0, neny, sx, neny);
		gg.drawImage(chim, chim2.getX(), chim2.getY() - 100, chim2.getCx(), chim2.getCy(), null);
		gg.drawImage(img, 0, 0, null);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			boolean ok = true;
			for (int i = 0; i < cayx.length; i++) {
				if (cayx[i] >= chim2.getX() && cayx[i] <= chim2.getX() + chim2.getCx() && neny - chim2.getY() < 70) {
					ok = false;
					chim2.kill();
					break;
				}
			}
		if (ok) {
			ox += 4;
		}
		repaint();
		try {
			Thread.sleep(10);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getKeyCode() == KeyEvent.VK_SPACE) {
			chim2.jump();
		}

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

}

