package javaswing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Giaiphuongtrinhbac1 extends JFrame {
	public static void main(String[] args) {
		new Giaiphuongtrinhbac1();
	}
	public Giaiphuongtrinhbac1() {
		this.setTitle("Giai Phuong Trinh Bac 1");
		this.setSize(300,250);
		this.setLayout(null);
		this.setDefaultCloseOperation(3);
		
		JLabel la = new JLabel("Nhap a: ");
		la.setBounds(20,20, 60, 20);
		this.add(la);
		
		final JTextField ta = new JTextField();
		ta.setBounds(80, 20, 150, 20);
		this.add(ta);
		
		JLabel lb = new JLabel("Nhap b: ");
		lb.setBounds(20,60, 60, 20);
		this.add(lb);
		
		final JTextField tb = new JTextField();
		tb.setBounds(80, 60, 150, 20);
		this.add(tb);
		
		JLabel lR = new JLabel("Ket Qua: ");
		lR.setBounds(20, 100, 60, 20);
		this.add(lR);
		
		JTextField tR = new JTextField();
		tR.setBounds(80, 100, 150, 20);
		this.add(tR);
		
		JButton bTinh = new JButton("Tinh");
		bTinh.setBounds(10, 140, 80, 50);
		bTinh.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					double a= Double.parseDouble(ta.getText());
					double b = Double.parseDouble(tb.getText());
					tR.setText(""+(-b/a));
					
				}catch (Exception e1) {
					// TODO: handle exception
					e1.printStackTrace();
				}
				
			}
		});
		
		this.add(bTinh);
		
		JButton bReset = new JButton("Reset");
		bReset.setBounds(100, 140, 80, 50);
		bReset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ta.setText("");
				tb.setText("");
				tR.setText("");
			}
		});
		
		this.add(bReset);
		
		JButton bExit = new JButton("Exit");
		bExit.setBounds(190, 140, 80, 50);
		bExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		this.add(bExit);
		
		
		this.setVisible(true);
		
	}
}
