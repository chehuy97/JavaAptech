package javaswing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class In_ra_snt_nho_hon_n extends JFrame {
	public static void main(String[] args) {
		new In_ra_snt_nho_hon_n();
	}
	public In_ra_snt_nho_hon_n() {
		this.setTitle("Tim so nguyen to");
		this.setSize(400,400);
		this.setLayout(null);
		this.setDefaultCloseOperation(3);
		
		JLabel lTopic = new JLabel("IN RA CAC SO NGUYEN TO NHO HON BANG N");
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
		
		JButton bTim = new JButton("Tim");
		bTim.setBounds(50, 170, 80, 40);
		bTim.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int  n = 0;
				
				StringBuilder a=new StringBuilder("");
				try {
					 n = Integer.parseInt(tN.getText());
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
				for(int i=0;i<=n;i++) {
					if(kiemtrasnt(i)==1) {
						 a.append(i+" ")  ;
						
					}
				}
				tR.setText(a.toString());
			}
		});
		this.add(bTim);
		
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
	public static int kiemtrasnt(int n) {
		if (n < 2 ) return 0;
		for(int i=2;i<n;i++)
		{
			if (n%i== 0) return 0;
		}
		return 1;
	}
//	public static void insnt(int n) {
//		for(int i=0;i<=n;i++) {
//			if(kiemtrasnt(i)==1) {
//			
//			}
//		}
//	}
}
