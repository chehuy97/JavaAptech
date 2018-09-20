/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Ex02Main {
    public static void main(String[] args) {
        int[] dem = new int[1];
        
//        long time1 = System.nanoTime();
        long time1 = System.currentTimeMillis();
        Ex02DemSNT t1 = new Ex02DemSNT(1, 10000);
        Ex02DemSNT t2 = new Ex02DemSNT(10000, 20000);
        
        t1.dem = dem;       
        t2.dem = dem;       // cho bien dem cua t1, t2 cung tro toi bien dem cua main
        
        t1.start();
        t2.start();
        
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Ex02Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("So cac SNT: " + dem[0]);
//        long time2 = System.nanoTime();
        long time2 = System.currentTimeMillis();
        System.out.println("Tong thoi gian chay: " + (time2 - time1));
    }
}
