/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import lab6.Tools;

/**
 *
 * @author Admin
 */
public class NhaSX extends Thread {
    String name;
    StringBuilder khoHang;

    public NhaSX(String name, StringBuilder khoHang) {
        this.name = name;
        this.khoHang = khoHang;
    }

    @Override
    public void run() {
        while (true) {
            synchronized(khoHang) {
                System.out.println("Thread xu ly: " + Thread.currentThread().getName());
                if (khoHang.length() == 10) {
                    System.out.println("Kho hang day, tam nghi...");
                    try {
                        khoHang.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(NhaSX.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    System.out.println("Kho hang: " + khoHang);
                    int sp = new Random().nextInt(10);
                    System.out.println("Nha SX " + name + " da SX: " + sp);
                    khoHang.append(sp);
                    khoHang.notify();
                }
            }
            Tools.sleep(300);
        }
    }
    
    
}
