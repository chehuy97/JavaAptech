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
public class ThiTruong {
    public static void main(String[] args) {
        StringBuilder khoHang = new StringBuilder();
        NhaSX Honda = new NhaSX("Honda", khoHang);
        NhaSX SYM = new NhaSX("SYM", khoHang);
        NhaTD TienThu = new NhaTD("Tien Thu", khoHang);
        Honda.setName("Thread Honda");
        SYM.setName("Thread SYM");
        TienThu.setName("Thread Tien Thu");
        
        Honda.start();
        SYM.start();
        TienThu.start();
                
    }
}
