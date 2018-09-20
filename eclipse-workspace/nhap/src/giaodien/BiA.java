package giaodien;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BiA extends JFrame implements Runnable,MouseListener,MouseMotionListener {

    public static void main(String[] args) {
        new BiA();
    }

    int sx=600,sy=400,os=50;
    Image img;
    Graphics gg;
    Ball b,b2;
    int mx,my;
    boolean press=false;
    public BiA(){
        setSize(sx+2*os,sy+2*os);
        setTitle("Bi A");
        setDefaultCloseOperation(3);
        setResizable(false);

        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        new Thread(this).start();
        setVisible(true);
        b=new Ball(sx/2,sy/2,sx,sy,0,0,30,1,0.5);
        b.start();
        b2=new Ball(sx/2,sy/2,sx,sy,0,0,30,1,0.5);
        b2.start();

        img=this.createImage(sx,sy);
        gg=img.getGraphics();
    }

    public void paint(Graphics g){
        if(gg==null)
            return;
        gg.setColor(Color.CYAN);
        gg.fillRect(0,0,sx,sy);
//        if(press)
//            gg.setColor(Color.YELLOW);
//        else
        gg.setColor(Color.RED);
        gg.fillOval(b.X()-b.R(),b.Y()-b.R(),b.R()*2,b.R()*2);
        gg.setColor(Color.BLUE);
        gg.drawOval(b.X()-b.R(),b.Y()-b.R(),b.R()*2,b.R()*2);
//        gg.setColor(Color.YELLOW);
//        gg.fillOval(b2.X()-b2.R(),b2.Y()-b2.R(),b2.R()*2,b2.R()*2);
//        gg.setColor(Color.BLUE);
//        gg.drawOval(b2.X()-b2.R(),b2.Y()-b2.R(),b2.R()*2,b2.R()*2);

        if(press){
            gg.setColor(Color.GREEN);
            gg.drawLine(b.X(),b.Y(),mx,my);
        }
        g.drawImage(img,os,os,null);

    }
    @Override
    public void run() {

        while (true){
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            repaint();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        int x =e.getX()-os;
        int y=e.getY()-os;
        mx=e.getX()-os;
        my=e.getY()-os;
        this.repaint();
        if((x-b.X())*(x-b.X())+(y-b.Y())*(y-b.Y())<b.R()*b.R()){
            press=true;
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if(press){
            press=false;
            mx=e.getX()-os;
            my=e.getY()-os;
            b.setVx((b.X()-mx)/10);
            b.setVy((b.Y()-my)/10);
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        mx=e.getX()-os;
        my=e.getY()-os;
        this.repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}

class Ball extends  Thread{
    double x,y,sx,sy,vx,vy,r,m,a;

    public Ball(double x,double y,double sx,double sy,double vx,double vy,double r,double m,double a){
        this.x=x;
        this.y=y;
        this.sx=sx;
        this.sy=sy;
        this.vx=vx;
        this.vy=vy;
        this.r=r;
        this.m=m;
        this.a=a;
    }

    public  void setVx(double vx){
        this.vx=vx;
    }
    public  void setVy(double vy){
        this.vy=vy;
    }
    public int X(){
        return (int)x;
    }
    public int Y(){
        return (int)y;
    }
    public int R(){
        return (int)r;
    }

    public void run(){
        while(true){

            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            double v=Math.sqrt(vx*vx+vy*vy);
            if(v<1) {
                vx=0;
                vy=0;
                continue;
            }
            x+=vx;
            y+=vy;
            if(x-r<0)
            {
                x=2*r-x;
                vx=-vx;
            }
            if(x+r>sx){
                x=2*sx-2*r-x;
                vx=-vx;
            }
            if(y-r<0)
            {
                y=2*r-y;
                vy=-vy;
            }
            if(y+r>sy){
                y=2*sy-2*r-y;
                vy=-vy;
            }

            double vn=v-a;
            if(vn<0) vn=0;
            vx=vn*vx/v;
            vy=vn*vy/v;

        }
    }
}


