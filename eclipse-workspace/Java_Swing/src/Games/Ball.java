package Games;

public class Ball extends Thread {
	double x,y,sx,sy,vx,vy,r,m,a;

	public Ball(double x, double y, double sx, double sy, double vx, double vy, double r, double m, double a) {
		super();
		this.x = x;
		this.y = y;
		this.sx = sx;
		this.sy = sy;
		this.vx = vx;
		this.vy = vy;
		this.r = r;
		this.m = m;
		this.a = a;
	}

	public int getX() {
		return (int) x;
	}

	public int getY() {
		return (int) y;
	}

	public int getSx() {
		return (int) sx;
	}

	public int getSy() {
		return (int) sy;
	}

	public void setVx(double vx) {
		this.vx = vx;
	}

	public void setVy(double vy) {
		this.vy = vy;
	}

	public int getR() {
		return (int) r;
	}

	public int getM() {
		return (int) m;
	}

	public int getA() {
		return (int) a;
	}
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(100);
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			double v=Math.sqrt(vx*vx+vy*vy);
			if(v<1) {
				vx=0;
				vy=0;
				continue;
			}
				x+=vx;
				y+=vy;
				if(x-r<0)
				{
					x=2*r-x;
					vx=-vx;
				}
				if(x+r>sx) {
					x=2*sx-2*r-x;
					vx=-vx;
			}
				if(y-r<0) {
					y=2*r-y;
					vy=-vy;
				}
				if(y+r>sy) {
					y=2*sy-2*r-y;
					vy=-vy;
				}
				double vn=v-a;
				if(vn<0) vn=0;
				vx=vn*vx/v;
				vy=vn*vy/v;
		}
	}
	
}
