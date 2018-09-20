package giaodien;

public class Chim extends Thread {
	
	private int x;
	private int y;
	private int cx, cy;
	private int neny;
	private int vy;
	private int g;
	//0: dang dung tren dat
	//1: jump 1 phat
	//2: jump 2 phat
	int state = 0;
	
	public Chim(int x, int y, int cx, int cy, int neny, int vy, int g) {
		this.x = x;
		this.y = y;
		this.cx = cx;
		this.cy = cy;
		this.neny = neny;
		this.vy = vy;
		this.g = g;
		 
	}
	
	public void run() {
		while (true) {
			y += vy;
			if (y >= neny) {
				y = neny;
				vy = 0;
				state = 0;
			} else vy += g;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public void kill() {
		this.state = 3;
	}

	public void jump() {
		if (this.state == 0 || this.state == 1) {
			vy += -40;
			state += 1;
		}
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getCx() {
		return cx;
	}

	public int getCy() {
		return cy;
	}

	public int getNeny() {
		return neny;
	}
	
}
