package giaodien;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JFrame;

public class GiaoDienText2 extends JFrame implements MouseListener {

	public static void main(String[] args) {
		new GiaoDienText2();
	}

	int so = 20;
	int s = 30;
	int of = 50;

	ArrayList<Point> dadanh = new ArrayList<Point>();

	public GiaoDienText2() {
		this.setTitle("Co Caro");
		this.setSize(so * s + of * 2, so * s + of * 2);
		this.setDefaultCloseOperation(3);
		this.addMouseListener(this);

		this.setVisible(true);
	}

	public void paint(Graphics g) {

		// g.setColor(Color.yellow);
		// g.fillRect(50, 50, 100, 60);
		// g.fillOval(50, 150, 100, 60);
		//
		// g.setColor(Color.blue);
		// g.drawRect(50, 50, 100, 60);
		// g.drawOval(50, 150, 100, 60);
		g.setColor(Color.white);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		g.setColor(Color.blue);
		for (int i = 0; i <= so; i++) {
			g.drawLine(of, of + i * s, of + so * s, of + i * s);
			g.drawLine(of + i * s, of, of + i * s, of + so * s);
		}

		g.setFont(new Font("arial", Font.PLAIN, s));
		for (int i = 0; i < dadanh.size(); i++) {
			Color c = Color.BLUE;

			String str = "x";
			if (i % 2 == 0) {
				str = "o";
				c = Color.RED;
			}
			g.setColor(c);
			g.drawString(str, of + s * dadanh.get(i).x + s * 1 / 4, of + s * dadanh.get(i).y + s * 3 / 4);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		// System.out.println(x + " " + y);

		if (x < of || x >= of + so * s)
			return;
		if (y < of || y >= of + so * s)
			return;
		// System.out.println("Ben trong");

		int ix = (x - of) / s;
		int iy = (y - of) / s;

		if (dadanh.contains(new Point(ix, iy)))
			return;

		dadanh.add(new Point(ix, iy));

		// System.out.println(ix + " " + iy);
		this.repaint();

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
