/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.util.logging.Level;
import java.util.logging.Logger;
import lab6.Ex02MyThread;
import lab6.Ex03MyRunnable;

/**
 *
 * @author Admin
 */
public class Ex01JoinMethodDemo {
    public static void main(String[] args) {
        Ex02MyThread t1 = new Ex02MyThread();
        Ex03MyRunnable r = new Ex03MyRunnable();
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Ex01JoinMethodDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("End of main!");
    }
}
