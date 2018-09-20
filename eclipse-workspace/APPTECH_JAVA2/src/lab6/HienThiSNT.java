/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author Admin
 */
public class HienThiSNT extends Thread{
    private int a;
    private int b;

    public HienThiSNT(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // ham kiem tra 1 so co la so nguyen to?
    private boolean isSNT(int n) {
        if (n < 2) { 
            return false;
        } 
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void run() {
        for (int i = a; i <= b; i++) {
            if (isSNT(i)) {
                System.out.print(i + ", ");
                Tools.sleep(500);
            }
        }
    }
    
    
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    
}
