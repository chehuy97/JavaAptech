/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import lab6.Tools;

/**
 *
 * @author Admin
 */
public class Ex03SynchronizedOnMethod extends Thread{

    @Override
    public synchronized void run() {
        System.out.println("Thread name: " + Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            System.out.print(i + ", ");
            Tools.sleep(500);
        }
    }
    
    public static void main(String[] args) {
        Ex03SynchronizedOnMethod t = new Ex03SynchronizedOnMethod();
        t.start();
        t.run();
    }
    
}
