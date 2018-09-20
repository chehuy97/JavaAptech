/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class GameDemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b, result;
        int total = 0;
        int score = 0;
        Random r = new Random();
        System.out.print("Nhap thoi gian choi(phut): ");
        int time = s.nextInt();
        
        
        TimeOut t = new TimeOut(time, total, score);
        t.start();
        // bat dau choi
        // random ra cac phep tinh
        while (true) {
            a = r.nextInt(31);      // sinh ngau nhien  1 so nguyen trong 0 - 30
            b = r.nextInt(31);
            System.out.print(a + " + " + b + " = ");
            t.setTotal(++total);
            result = s.nextInt();
            if (result == a + b) {
                t.setScore(++score);
            }
        }
    }
}
