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
public class Bai5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        File f;
        do {
        System.out.print("Nhap duong dan toi thu muc: ");
        String path = s.nextLine();
        f = new File(path);
        } while (!f.exists() || !f.isDirectory());
        
        // tinh dung luong cua thu muc
        long size = getSize(f);
        if (size < 1024) {
            System.out.println("Size: " + size + "b");
        } else if (size < 1024 * 1024) {
            double dSize = 1.0 * size / 1024;
            System.out.printf("Size: %.2f Kb" , dSize);
        } else if (size < 1024 * 1024 * 1024) {
            double dSize = 1.0 * size / 1024 / 1024;
            System.out.printf("Size: %.2f Mb" , dSize);
        } else {
            double dSize = 1.0 * size / 1024 / 1024 / 1024;
            System.out.printf("Size: %.2f Gb" , dSize);
        }
    }
    
    // Ham tinh dung luong cua thu muc hoac file
    private static long getSize(File f) {
        long size = 0;
        for (File file: f.listFiles()) {
            if (file.isFile()) {
                size += file.length();
            } else {
                size += getSize(file);
            }
        }
        return size;
    }
}
