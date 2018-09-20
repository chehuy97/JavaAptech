package ss7;

public class TimeOut  extends Thread{
	private int score;
	private int total;
	private int time;
	public TimeOut(int score, int total, int time) {
		super();
		this.score = score;
		this.total = total;
		this.time = time;
	}
		
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Tools.sleep(time*60000);
		System.out.println();
		System.out.println("So cau tra loi dung: "+score+"/"+total);
		System.exit(0);
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
	
}
