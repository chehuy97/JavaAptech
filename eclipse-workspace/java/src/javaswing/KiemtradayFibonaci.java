package javaswing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class KiemtradayFibonaci extends JFrame {
	public static void main(String[] args) {
		new KiemtradayFibonaci();
	}
	public KiemtradayFibonaci() {
			this.setTitle("Tim so nguyen to");
			this.setSize(400,400);
			this.setLayout(null);
			this.setDefaultCloseOperation(3);
			
			JLabel lTopic = new JLabel("KIEM TRA CO THUOC DAY FIBONACI KHONG");
			lTopic.setBounds(60, 20, 250, 30);
			this.add(lTopic);
			
			JLabel lN = new JLabel("nhap n :");
			lN.setBounds(50, 70, 50, 30);
			this.add(lN);
			
			JTextField tN = new JTextField();
			tN.setBounds(110, 70, 200, 30);
			this.add(tN);
			
			JLabel lR =  new JLabel("KQ : ");
			lR.setBounds(50, 120, 50, 30);
			this.add(lR);
			
			JTextField tR = new JTextField();
			tR.setBounds(110, 120, 200, 30);
			this.add(tR);
			
			JButton bOk = new JButton("ok");
			bOk.setBounds(50, 170, 80, 40);
			bOk.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					int n = 0;
					try {
						 n = Integer.parseInt(tN.getText());
					} catch (Exception e2) {
						// TODO: handle exception
						e2.printStackTrace();
					}
					int d=0;
					   for(int i=0;i<=n;i++) {
					       if(n==fibonaci(i)) 
					       { 
					            d++;             
					       } 
				}
					   if(d==1) tR.setText("thuoc day fibolaci");
					   else   if(d==0) tR.setText("k thuoc day fibolaci");
				}
				});
			this.add(bOk);
			
			JButton bReset = new JButton("Reset");
			bReset.setBounds(150, 170, 80, 40);
			bReset.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					tN.setText("");
					tR.setText("");
				}
			});
			this.add(bReset);
			
			JButton bExit = new JButton("Exit");
			bExit.setBounds(250, 170, 80, 40);
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
	public static long fibonaci(int n) {
		if (n==0) return 0;
		if (n==1) return 1;
		else return fibonaci(n-1)+fibonaci(n-2);
	}
}
