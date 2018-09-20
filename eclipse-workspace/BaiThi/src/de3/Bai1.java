package de3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Bai1 extends JFrame{
	ArrayList<Circle> mList = new ArrayList();
	JPanel mPanel;
	JButton btn;
	JTextField tf;
	Graphics g;
	public static void main(String[] args) {
		new Bai1();
	}
	public Bai1() {
		JFrame mainFrame =  new JFrame("Circle");
		mainFrame.setSize(500, 500);
		mainFrame.setLayout(null);
		mainFrame.setDefaultCloseOperation(3);
		
		tf =  new JTextField();
		tf.setBounds(170, 20, 250, 35);
		mainFrame.add(tf);
		
		mPanel = new JPanel();
		mPanel.setBounds(40, 70, 400, 340);
		mPanel.setLayout(null);
		mPanel.setBackground(Color.WHITE);
		
		mainFrame.add(mPanel);
		
		btn = new JButton("Load");
		btn.setBounds(40, 20, 100, 35);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(tf.getText())))){
					String line = null;
					while((line=br.readLine())!=null) {
						String[] a = line.split("[ ]") ;
						int x = Integer.parseInt(a[0]);
						int y = Integer.parseInt(a[1]);
						int r = Integer.parseInt(a[2]);
						Circle mCircle = new Circle(x, y, r, a[3]);
						mList.add(mCircle);
					}
					System.out.println(mList.size());
					for (int i = 0; i < mList.size(); i++) {
						 g = mPanel.getGraphics();
	                        Color color = (Color) Color.class.getField(mList.get(i).getColor()).get(null);
	                        g.setColor(color);
	                        g.fillOval(mList.get(i).getX(),mList.get(i).getY(),mList.get(i).getR()*2,mList.get(i).getR()*2);
					}
					
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IllegalArgumentException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (NoSuchFieldException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SecurityException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		mainFrame.add(btn);
		
		mainFrame.setVisible(true);
	}
}
