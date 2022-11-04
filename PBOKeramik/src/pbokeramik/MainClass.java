/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbokeramik;

/**
 *
 * @author user
 */
public class MainClass {
    public static void main(String[] args) {
        Keramik akses = new Keramik();
        
        akses.setLuasTanah(100);
        akses.setPanjang_A(25);
        akses.setLebar_A(25);
        akses.setPanjang_B(30);
        akses.setLebar_B(30);
        akses.setPanjang_C(50);
        akses.setLebar_C(50);
        akses.infoKeramik();
        akses.hitungHarga();
    }
}
