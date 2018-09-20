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
public class Ex05DaemonThreadDemo {
    public static void main(String[] args) {
        Ex02MyThread t = new Ex02MyThread();
        System.out.println(t.isDaemon());       // false (default)
        t.setDaemon(true);
        t.start();      // chay mat 5s
        Tools.sleep(3000);
        System.out.println("End of main!");
    }
    ///thread daemon se ngung chay neu cac thread bth khac ket thuc chay mac du no con kha nang chay
}
