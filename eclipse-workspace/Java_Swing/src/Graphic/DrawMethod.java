package Graphic;

import java.awt.*;
import javax.swing.*;
public class DrawMethod extends JFrame {
     
    public DrawMethod() {
        setTitle("Drawing Method Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 200, 400, 300);
        setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        setBackground(Color.GREEN);
        setVisible(true);
    }
     
    public static void main(String[] args) {
        // run the GUI codes on the Event-Dispatching thread for thread safety
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DrawMethod();   
            }
        });
    }
     
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
 
        // render cho anh min hon
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
                                                RenderingHints.VALUE_ANTIALIAS_ON);
        rh.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
 
        g2d.setRenderingHints(rh);
 
        // bat dau ve
        g2d.drawLine(0, 40, 30, 30);
        g2d.drawString("Line", 0, 60);
 
        g2d.drawPolyline(new int[] {50, 60, 70, 80, 90}, new int[] {20, 50, 20, 60, 10}, 5);
        g2d.drawString("Polyline", 50, 70);
 
        g2d.setColor(Color.RED);
        g2d.drawRect(100, 30, 40, 60);
        g2d.drawString("Rect", 100, 100);
         
        g2d.setColor(Color.BLACK);
        g2d.drawArc(150, 25, 60, 40, 0, 195);
        g2d.drawString("Arc", 150, 80);
         
        g2d.draw3DRect(220, 25, 60, 40, false);
        g2d.drawString("3DRect", 220, 80);
         
        g2d.drawRoundRect(290, 25, 60, 40, 10, 20);
        g2d.drawString("RoundRect", 290, 80);
    }
}
