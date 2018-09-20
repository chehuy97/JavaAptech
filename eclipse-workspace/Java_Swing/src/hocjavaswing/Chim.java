package hocjavaswing;

/**
 * @author Quang Huy
 *
 */
public class Chim extends Thread {
	private int x,y,cx,cy;
	private int neny;
	private int vy;
	private int g;
	
	int state=0;
	
	public Chim(int x, int y, int cx, int cy, int neny, int vy, int g) {
		super();
		this.x = x;
		this.y = y;
		this.cx = cx;
		this.cy = cy;
		this.neny = neny;
		this.vy = vy;
		this.g = g;
}
	public void run() {
		if(y<= neny) {
			y= neny;
			state=0;
			vy=0;
		}else {
			vy+=g;
			try {
				Thread.sleep(100);
			}catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	public void kill() {
		this.state = 3;
	}
	public void jump() {
		if(state == 1 || state == 2) {
			vy+=-40;
			state ++;
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
	public int getVy() {
		return vy;
	}
	public int getG() {
		return g;
	}
	
}
