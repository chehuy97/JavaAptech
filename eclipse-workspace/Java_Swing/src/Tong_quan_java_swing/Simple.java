package Tong_quan_java_swing;

import javax.swing.*;  
public class Simple {  
JFrame f;  
Simple(){  
f=new JFrame();//Tao instance cua JFrame  
          
JButton b=new JButton("click");//Tao instance cua JButton  
b.setBounds(130,100,100, 40);  
          
f.add(b);//Them button vao trong JFrame  
          
f.setSize(400,500);//Do rong la 400 va chieu cao la 500  
f.setLayout(null);//Khong su dung Layout Manager  
f.setVisible(true);//Tao Frame la co the nhin thay (visible)  
}  
  
public static void main(String[] args) {  
new Simple();  
}  
}  
