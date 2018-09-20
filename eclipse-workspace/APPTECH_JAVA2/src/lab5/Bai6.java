/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Bai6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        File f;
        do {
        System.out.print("Nhap duong dan toi file (.txt): ");
        String path = s.nextLine();
        f = new File(path);
        } while (!f.exists() || !f.isFile());
        try(
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(f)));
            ){
            String line;
            int soTu = 0;
            while ((line = br.readLine()) != null) {
                String[] a = line.split("[ -]");
                soTu += a.length;
            }
            for (String string : args) {
				System.out.println(string);
			}
            System.out.println("So tu trong file: " + soTu);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Bai6.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Bai6.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
