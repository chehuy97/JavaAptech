package giaodien;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GiaoDienText1  extends JFrame{
	public static void main(String[] args) {
		new GiaoDienText1();
	}
	public GiaoDienText1() {
		this.setTitle("Giao Dien");
		this.setSize(380,320);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel la = new JLabel("nhap a:");
		la.setBounds(20,20,50,30);
		this.add(la);
		
		JLabel lb = new JLabel("nhap b:");
		lb.setBounds(20,50,50,30);
		this.add(lb);
		
		final JTextField ta = new JTextField();
		ta.setBounds(80,20,150,30);
		this.add(ta);
		
		final JTextField tb = new JTextField();
		tb.setBounds(80,50,150,30);
		this.add(tb);
		
		JTextField kq = new JTextField("ket qua:");
		kq.setBounds(20,140,50,30);
		this.add(kq);
		
		final JTextField tr = new JTextField();
		tr.setBounds(80,140,100,30);
		this.add(tr);
		
		JButton bcong = new JButton("+");
		bcong.setBounds(20,100,50,30);
		bcong.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					double a = Double.parseDouble(ta.getText());
					double b = Double.parseDouble(tb.getText());
					tr.setText(""+(a+b));
				}catch(Exception e2) {
					System.out.println("nhap sai");
				}
			}	
		});
		this.add(bcong);
		
		JButton btru = new JButton("-");
		btru.setBounds(75,100,50,30);
		btru.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				try {
					double a = Double.parseDouble(ta.getText());
					double b = Double.parseDouble(tb.getText());
					tr.setText(""+(a-b));
				}catch(Exception e2) {
					tr.setText("Nhap sai");
				}
			}
		});
		this.add(btru);
		
		JButton bnhan = new JButton("*");
		bnhan.setBounds(130,100,50,30);
		bnhan.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				try {
					double a = Double.parseDouble(ta.getText());
					double b = Double.parseDouble(tb.getText());
					tr.setText(""+(a*b));
				}catch(Exception e2) {
					tr.setText("Nhap sai");
				}
			}
		});
		this.add(bnhan);
		
		JButton bchia = new JButton("/");
		bchia.setBounds(185,100,50,30);
		bchia.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				try {
					double a = Double.parseDouble(ta.getText());
					double b = Double.parseDouble(tb.getText());
					tr.setText(""+(a/b));
				}catch(Exception e2) {
					tr.setText("Nhap sai");
				}
			}
		});
		this.add(bchia);
		
		JButton bReset = new JButton("Reset");
		bReset.setBounds(240, 100, 50, 30);
		bReset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ta.setText("");
				tb.setText("");
				tr.setText("");
			}
		});
		
		this.add(bReset);
		
		JButton bExit = new JButton("Exit");
		bExit.setBounds(295, 100, 50, 30);
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
