package javaswing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CacPhepToan extends JFrame {
	public static void main(String[] args) {
		new CacPhepToan();
	}
	public CacPhepToan() {
		this.setTitle("Cac Phep Toan");
		this.setSize(350,300);
		this.setLayout(null);
		this.setDefaultCloseOperation(3);
		
		JLabel la = new JLabel("Nhap a: ");
		la.setBounds(50,20, 60, 20);
		this.add(la);
		
		final JTextField ta = new JTextField();
		ta.setBounds(110, 20, 150, 20);
		this.add(ta);
		
		JLabel lb = new JLabel("Nhap b: ");
		lb.setBounds(50,60, 60, 20);
		this.add(lb);
		
		final JTextField tb = new JTextField();
		tb.setBounds(110, 60, 150, 20);
		this.add(tb);
		
		JLabel lR = new JLabel("Ket Qua: ");
		lR.setBounds(50, 100, 60, 20);
		this.add(lR);
		
		JTextField tR = new JTextField();
		tR.setBounds(110, 100, 150, 20);
		this.add(tR);
		
		JButton bCong = new JButton("cong");
		bCong.setBounds(10, 140, 70, 30);
		bCong.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
				int a = Integer.parseInt(ta.getText()); 
				int b = Integer.parseInt(tb.getText()); 
				tR.setText(""+(a+b));
				}catch (Exception e1) {
					// TODO: handle exception
					tR.setText("Loi nhap so");
				}
			}
		});
		
		this.add(bCong);
		
		JButton bTru = new JButton("Tru");
		bTru.setBounds(90, 140, 70, 30);
		bTru.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					int a = Integer.parseInt(ta.getText()); 
					int b = Integer.parseInt(tb.getText()); 
					tR.setText(""+(a-b));
					}catch (Exception e1) {
						// TODO: handle exception
						tR.setText("Loi nhap so");
					
			}
			}
		});
		
		this.add(bTru);
		
		JButton bNhan = new JButton("Nhan");
		bNhan.setBounds(170, 140, 70, 30);
		bNhan.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					int a = Integer.parseInt(ta.getText()); 
					int b = Integer.parseInt(tb.getText()); 
					tR.setText(""+(a*b));
					}catch (Exception e1) {
						// TODO: handle exception
						tR.setText("Loi nhap so");
					}
			}
		});
		this.add(bNhan);
		
		JButton bChia = new JButton("Chia");
		bChia.setBounds(250, 140, 70, 30);
		this.add(bChia);
		bChia.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					int a = Integer.parseInt(ta.getText()); 
					int b = Integer.parseInt(tb.getText()); 
					tR.setText(""+(a/b));
					}catch (Exception e1) {
						// TODO: handle exception
						tR.setText("Loi nhap so");
					}
			}
		});
		JButton bReset = new JButton("Reset");
		bReset.setBounds(90, 180, 70, 30);
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
		
		JButton bExit =  new JButton("Exit");
		bExit.setBounds(170, 180, 70, 30);
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
