/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Ex01TryWithResourceDemo {
    public static void main(String[] args){
        String path = "Data.txt";
        try (BufferedReader br = new BufferedReader(
                                    new InputStreamReader(
                                            new FileInputStream(path)))){
            String line  = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ex01TryWithResourceDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ex01TryWithResourceDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
