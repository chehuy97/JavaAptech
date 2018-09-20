package de3;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class vidu extends JFrame{
	ArrayList<Circle> mList = new ArrayList<>();
    public class MyGraphics extends JComponent {

        MyGraphics() {
            setPreferredSize(new Dimension(500, 400));
        }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.fillRect(150, 62, 50, 20);
        }
    }
	public void GUI() {
		JFrame f = new JFrame();
		f.setSize(400, 400);
		f.setLayout(null);
		f.setDefaultCloseOperation(3);
		
		JPanel panel =  new JPanel();
//		panel.setLayout(null);
		panel.setBounds(20,20, 350, 300);
		panel.setBackground(Color.white);
		panel.add(new MyGraphics());
		f.add(panel);
	//	f.pack();
		
		f.setVisible(true);
	}
	
    public void createGUI() {
        final JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.add(new MyGraphics());
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                vidu GUI = new vidu();
                GUI.GUI();
            }
        });
	}
}
