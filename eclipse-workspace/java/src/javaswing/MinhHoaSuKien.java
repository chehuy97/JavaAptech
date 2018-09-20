package javaswing;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MinhHoaSuKien extends JFrame {
	public static void main(String[] args) {
		new MinhHoaSuKien();
	}
	public MinhHoaSuKien() {
		JFrame mainframe = new JFrame("Minh Hoa Su Kien");
		mainframe.setTitle("Minh Hoa Su Kien");
		mainframe.setSize(400, 400);
		mainframe.setLayout(null);
		mainframe.setDefaultCloseOperation(3);
		JRadioButton RB1 = new JRadioButton("Male");
		RB1.setBounds(20, 100, 150,30);	
		mainframe.add(RB1);
		JRadioButton RB2 = new JRadioButton("Female");
		RB2.setBounds(200, 100, 150,30);	
		mainframe.add(RB2);
		
		
		mainframe.setVisible(true);
	}
}
