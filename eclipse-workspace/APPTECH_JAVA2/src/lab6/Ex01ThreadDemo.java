/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Ex01ThreadDemo {
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            System.out.print(i + ", ");
//            Tools.sleep(500);            
//        }
        Ex02MyThread t1 = new Ex02MyThread();
        t1.start();     // tu thread main se tach ra 1 thread t1 chay song song voi thread main
        
        Ex03MyRunnable r = new Ex03MyRunnable();
        Thread t2 = new Thread(r);
        t2.start();     // tu thread main se tach ra 1 thread t2 chay song song voi thread main
        
        for (int i = 10; i < 20; i++) {
            System.out.print(i + ", ");
            Tools.sleep(500);
        }
    }
}
