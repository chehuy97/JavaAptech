/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Bai4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        //Nhap duong dan toi file can copy
        System.out.print("Nhap duong dan toi file can copy: ");
        String source = s.nextLine();
        File fSrc = new File(source);
        if (!fSrc.exists() || !fSrc.isFile()) {
            System.out.println("Duong dan ko hop le!");
            return;
        }
        
        // Nhap duong dan toi thu muc de chua file copy
        System.out.print("Nhap duong dan toi thu muc chua file copy: ");
        String destination = s.nextLine();
        File fDes = new File(destination);
        if (!fDes.exists() || !fDes.isDirectory()) {
            System.out.println("Duong dan ko hop le!");
            return;
        }
        
        // Copy file
        try(
            FileInputStream fis = new FileInputStream(fSrc);
            FileOutputStream fos = new FileOutputStream(destination + "\\" + fSrc.getName());
            ) {
            byte[] b = new byte[4096];
            while (fis.available() > 0) {
                int n = fis.read(b);
                fos.write(b, 0, n);
            }
            fos.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Bai4.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Bai4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
