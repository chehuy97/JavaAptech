package chuong7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Bai7_1 extends JFrame {
	public static void main(String[] args) {
		new Bai7_1();
	}
	public Bai7_1() {
		JFrame mainFrame = new JFrame("Select");
		mainFrame.setSize(800, 500);
		mainFrame.setLayout(null);
		mainFrame.setDefaultCloseOperation(3);
		
		JLabel lTopic = new JLabel("Nhap Thong Tin:");
		lTopic.setBounds(50, 10, 90, 40);
		mainFrame.add(lTopic);
		
		JTextField tfSearch =  new JTextField();
		tfSearch.setBounds(170, 13, 250, 30);
		mainFrame.add(tfSearch);
		
		ArrayList<String> mList = new ArrayList<>();
		JButton btnSearch = new JButton("Tim Kiem");
		btnSearch.setBounds(430, 13, 100, 30);
//		btnSearch.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				Connection con = null;
//				Statement st = null;
//				ResultSet rs = null;
//				PrintWriter pw = null;
//				String path = "src\\ss5\\Text.txt";
//				try {
//					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//					con = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-VR6CH56\\SQLEXPRESS:1433;databaseName=HOCSINH","sa","huy9101997");
//					String sql ="select *from hocsinh ";
//					st = con.createStatement();
//					rs = st.executeQuery(sql);
//					while (rs.next()) {
//						mList.add(rs.getString(1));
//						mList.add(rs.getString(2));
//						mList.add(rs.getString(3));
//						mList.add(rs.getString(4));
//					}
//				} catch (SQLException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				} catch (ClassNotFoundException e2) {
//					// TODO Auto-generated catch block
//					e2.printStackTrace();
//				}	
//			}
//		});
		mainFrame.add(btnSearch);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(540, 13, 100, 30);
		btnReset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tfSearch.setText("");
			}
		});
		mainFrame.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(650, 13, 100, 30);
		btnExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		mainFrame.add(btnExit);
		
		JLabel lTopic2 = new JLabel("Tim Kiem Theo:");
		lTopic2.setBounds(50, 70, 100, 30);
		mainFrame.add(lTopic2);
		
		JRadioButton rb1 = new JRadioButton("Ma So");
		rb1.setBounds(160, 70, 100, 30);
		mainFrame.add(rb1);
		
		JRadioButton rb2 = new JRadioButton("Ho Ten");
		rb2.setBounds(270, 70, 100, 30);
		mainFrame.add(rb2);
		
		JRadioButton rb3 = new JRadioButton("Ngay Sinh");
		rb3.setBounds(380, 70, 100, 30);
		mainFrame.add(rb3);
		
		JRadioButton rb4 = new JRadioButton("Gioi Tinh");
		rb4.setBounds(490, 70, 100, 30);
		mainFrame.add(rb4);
//			
		String data[][] = {{"01","Nguyen Van A","09/10/1997","Nam"},{"02","Nguyen Van B","8/71997","Nam"},{"03","Nguyen Thi C","1/1/1998","Nu"}};
//			int k=0;
//			for(int i=0;i<mList.size()/4;i++) {
//				data[][]= {{mList.get(k),mList.get(k+1),mList.get(k+2),mList.get(3)}};
//				k+=4;
//			}
		
		String[] col = {"maso","hoten","namsinh","gioitinh"};
		
		JTable tb =  new JTable(data,col);
		tb.setBounds(50, 130, 680, 200);
		mainFrame.add(tb);
		
		
		
		mainFrame.setVisible(true);
	}
}
