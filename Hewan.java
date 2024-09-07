/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas3;

/**
 *
 * @author Achmad
 */
public  class Hewan extends MakhluqHidup {

    public Hewan(){
        System.out.println("Hallo ini hewan");
    
    }
    @Override
    public void berkembang() {
      System.out.println("berkembang dengan melahirkan");  
    }

    public void jenisMakanan() {
        System.out.println("Memakan Daging");
    }

    public void jenisMakanan(String makanan) {
        System.out.println("Memakan " + makanan);
    }


}
