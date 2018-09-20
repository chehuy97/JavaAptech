/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *
 * @author Admin
 */
public class Ex02DemSNT extends Thread{
    int a;
    int b;
    int[] dem;

    public Ex02DemSNT(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        for (int i = a; i <= b; i++) {
            if (isSNT(i)){
                synchronized(dem) {                    
                    dem[0]++;
                }
            }
        }
    }
    
    boolean isSNT(int n) {
        if (n < 2) {
            return false;            
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}
