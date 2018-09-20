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
public class Ex04ThreadStateDemo {
    public static void main(String[] args) {
        Ex02MyThread t = new Ex02MyThread();
//        Ex02MyThread t1 = new Ex02MyThread();
//        t.setName("main");
        System.out.println("Name of thread t: " + t.getName());
//        System.out.println("Name of thread t1: " + t1.getName());
        System.out.println(t.getState());        
        t.start();      // chay mat 5s
        System.out.println(t.getState());
        
        while (t.getState().toString().equals("RUNNABLE")){
            
        }
        System.out.println(t.getState());
        Tools.sleep(7000);
        System.out.println(t.getState());
//        System.out.println("End of main");

//        System.out.println("Name of main thread: " + Thread.currentThread().getName());
    }
}
