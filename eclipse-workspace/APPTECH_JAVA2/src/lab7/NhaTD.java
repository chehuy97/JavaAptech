/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.util.logging.Level;
import java.util.logging.Logger;
import lab6.Tools;

/**
 *
 * @author Admin
 */
public class NhaTD extends Thread {
    String name;
    StringBuilder khoHang;

    public NhaTD(String name, StringBuilder khoHang) {
        this.name = name;
        this.khoHang = khoHang;
    }

    @Override
    public void run() {
        while (true) {
            synchronized(khoHang) {
                System.out.println("Thread xu ly: " + Thread.currentThread().getName());
                if (khoHang.length() == 0) {
                    System.out.println("Het hang!");
                    System.out.println(name + " phai cho doi...");
                    try {
                        khoHang.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(NhaTD.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    System.out.println("Kho hang: " + khoHang);
                    char sp = khoHang.charAt(khoHang.length() - 1);
                    System.out.println("Nha tieu dung " + name + " da mua: " + sp);
                    khoHang.deleteCharAt(khoHang.length() - 1);
                    khoHang.notify();
                }
            }
            Tools.sleep(500);                    
        }
    }
    
    
    
}
