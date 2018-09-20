package de2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Bai1 extends JFrame{
	public static void main(String[] args) {
		new Bai1();
	}
	public Bai1() {
		JFrame mainFrame =  new JFrame("Tam Giac");
		mainFrame.setSize(400, 400);
		mainFrame.setLayout(null);
		mainFrame.setDefaultCloseOperation(3);
		
		JLabel la = new JLabel("Do dai canh a:");
		la.setBounds(20, 30, 120, 30);
		mainFrame.add(la);
		
		JTextField ta = new JTextField();
		ta.setBounds(140, 30, 200, 30);
		mainFrame.add(ta);
		
		JLabel lb = new JLabel("Do dai canh b:");
		lb.setBounds(20, 80, 120, 30);
		mainFrame.add(lb);
		
		JTextField tb = new JTextField();
		tb.setBounds(140, 80, 200, 30);
		mainFrame.add(tb);
		
		JLabel lc = new JLabel("Do dai canh c:");
		lc.setBounds(20, 130, 120, 30);
		mainFrame.add(lc);
		
		JTextField tc = new JTextField();
		tc.setBounds(140, 130, 200, 30);
		mainFrame.add(tc);
		
		JLabel lr = new JLabel("Ket Qua:");
		lr.setBounds(20, 280, 120, 30);
		mainFrame.add(lr);
		
		JTextField tr = new JTextField();
		tr.setBounds(140, 280, 200, 30);
		mainFrame.add(tr);
		
		JButton dt =  new JButton("Tinh Dien Tich");
		dt.setBounds(140, 180, 200, 30);
		dt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double a = Double.parseDouble(ta.getText());
				double b = Double.parseDouble(tb.getText());
				double c = Double.parseDouble(tc.getText());
				double p =(a+b+c)/2;
				double s1 = p*(p-a)*(p-b)*(p-c);
				double s = Math.sqrt(s1);
				tr.setText(""+s);
			}
		});
		
		mainFrame.add(dt);
		
		JButton cv = new JButton("Tinh Chu Vi");
		cv.setBounds(140, 230, 200, 30);
		cv.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double a = Double.parseDouble(ta.getText());
				double b = Double.parseDouble(tb.getText());
				double c = Double.parseDouble(tc.getText());
				tr.setText(""+(a+b+c));
			}
		});
		mainFrame.add(cv);
		
		
		mainFrame.setVisible(true);
	}
}
