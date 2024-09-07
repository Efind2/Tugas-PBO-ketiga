/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas3;


public class Utama {
    public static void main(String[]Args){
        
        Hewan kambing = new Hewan();
        kambing.berkembang();
        kambing.bernafas();
        kambing.jenisMakanan("tumbuhan ");
        System.out.println("");
 
        Tumbuhan jambu = new Tumbuhan();
        jambu.berkembang();
        jambu.bernafas("stomata");
        System.out.println("");
        
        Mamalia macan = new Mamalia();
        macan.jenisMakanan();
        
    }
}
