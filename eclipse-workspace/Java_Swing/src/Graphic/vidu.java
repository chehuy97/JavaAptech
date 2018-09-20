package Graphic;

import java.awt.*;
import javax.swing.*;


public class vidu {

    public class MyGraphics extends JComponent {

        MyGraphics() {
            setPreferredSize(new Dimension(500, 400));
        }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.fillRect(200, 62, 150, 70);
        }
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
                GUI.createGUI();
            }
        });
    }
}