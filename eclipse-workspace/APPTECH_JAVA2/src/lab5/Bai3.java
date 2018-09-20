/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        File f;
        do {
        System.out.print("Nhap duong dan toi thu muc: ");
        String path = s.nextLine();
        f = new File(path);
        } while (!f.exists() || !f.isDirectory());
        
        System.out.print("Nhap 1 so n (KB): ");
        int n = s.nextInt();
        
        for (File file: f.listFiles()) {
            if (file.length()> n * 1024) {
                System.out.println(file.getName());
            }
        }
    }
}
