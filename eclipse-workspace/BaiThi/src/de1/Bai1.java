package de1;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Bai1 extends JFrame {
	public static void main(String[] args) {
		new Bai1();
	}
	public Bai1(){
		JFrame mFrame = new JFrame("Load");
		mFrame.setSize(400, 330);
		mFrame.setLayout(null);
		mFrame.setDefaultCloseOperation(3);
		
		JTextField tf = new JTextField();
		tf.setBounds(150, 30, 170, 50);
		mFrame.add(tf);
		
		JTextArea jta = new JTextArea();
		jta.setBounds(30, 110, 290, 130);
		mFrame.add(jta);
		
		JButton btn = new JButton("Load");
		btn.setBounds(30,30, 80, 50);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String path = tf.getText();
				try(BufferedReader mReader =  new BufferedReader(new InputStreamReader(new FileInputStream(path)))){
					String line = null;
					String mString=null;
					while((line = mReader.readLine())!=null) {
						jta.append(line+"\n");
					}
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		mFrame.add(btn);
		
		
		mFrame.setVisible(true);
	}
}
