package Tong_quan_java_swing;

import javax.swing.*;  
public class Simple2 extends JFrame{//Ke thua JFrame 
JFrame f;  
Simple2(){  
JButton b=new JButton("click");//Tao button  
b.setBounds(130,100,100, 40);  
          
add(b);//Them button tren frame  
setSize(400,500);  
setLayout(null);  
setVisible(true);  
}  
public static void main(String[] args) {  
new Simple2();  
}}  