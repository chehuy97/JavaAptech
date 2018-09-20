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
public class Ex03MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 50; i < 60; i++) {
            System.out.print(i + ", ");
            Tools.sleep(500);
        }
    }
    
}
