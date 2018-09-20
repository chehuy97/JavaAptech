package javaswing;

import java.awt.Color;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;


public class Doimaunen extends JFrame {
	public static void main(String[] args) {
		new Doimaunen();
	}
	
	public Doimaunen() {
		JFrame mainframe = new JFrame("Doi mau nen");
		mainframe.setTitle("Doi mau nen");
		mainframe.setSize(400,400);
		mainframe.setLayout(null);
		mainframe.setDefaultCloseOperation(3);
		
		JButton btnGreen = new JButton("Green");
		btnGreen.setBounds(40, 10, 70, 40);
		btnGreen.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					//btnGreen.setBackground(Color.GREEN);
				 mainframe.getContentPane().setBackground(Color.GREEN);
			}
		});
		mainframe.add(btnGreen);
		
		JButton btnBlue = new JButton("Blue");
		btnBlue.setBounds(120, 10, 70, 40);
		btnBlue.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				mainframe.getContentPane().setBackground(Color.BLUE);
			}
		});
		
		mainframe.add(btnBlue);
		
		JButton btnRed = new JButton("Red");
		btnRed.setBounds(200, 10, 70, 40);
		btnRed.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				mainframe.getContentPane().setBackground(Color.RED);
			}
		});
		
		mainframe.add(btnRed);
		
		JButton bExit = new JButton("Exit");
		bExit.setBounds(280, 10, 70, 40);
		bExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		mainframe.add(bExit);
		
		mainframe.setVisible(true);
	}
}
