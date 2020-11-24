/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119028.latihan62.livingthing;

/**
 *
 * @author RizalSihombing
 * NAMA     : Rizal Sihombing
 * KELAS    : IF1
 * NIM      : 10119028
 * Deskripsi Program : Program ini berisi program untuk menampilkan aktifitas seorang manusia
 */
public abstract class LivingThing {
    
    public abstract void walk(String nama);
    
    public void breath(String nama) {
        System.out.println(nama + " Sedang Bernafas");
    }
    
    public void eat(String nama) {
        System.out.println(nama + " Sedang Makan");
    }
}