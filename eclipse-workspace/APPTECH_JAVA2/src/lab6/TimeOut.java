/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author Admin
 */
public class TimeOut extends Thread{
    private int time;
    private int total;
    private int score;

    public TimeOut(int time, int total, int score) {
        this.time = time;
        this.total = total;
        this.score = score;
    }

    @Override
    public void run() {
        Tools.sleep(time * 60000);
        System.out.println("Het thoi gian!");
        System.out.println("So cau tra loi dung / tong so cau: " + score + " / " + total);
        System.exit(0);
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
    
}
