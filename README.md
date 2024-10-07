# Implementasi abstract, overload, dan override
Hallo Semuanya 😄👋
Ini adalah tugas untuk memenuhi mata kuliah Pemograman Berorientasi objek
disini saya mengemplementasikan abstract, overload, dan override pada java. Disini saya menggunakan class MakhluqHidup sebagai abstract yang diturunkan ke class Hewan dan Tumbuhan. 

## Aplikasi
- IDE NetBeans
- JDK 16

## Kode abtract MakhluqHidup
disini saya sudah mengimplementasikan overload yaitu membuat method yang memiliki nama sama dan parameter berbeda. pada kode ini saya membuat method berkembang yang memiliki parameter string dan metod yang tidak ada parameternya.
    
    public abstract class MakhluqHidup {
    
    public abstract void berkembang();
    
    public void bernafas(){
    System.out.println("bernafas dengan organ paru-paru");
    }
    public void bernafas(String nafas){
    System.out.println("bernafas mengunakan "+nafas);
    }
    }

## Kode override Hewan
pada kode ini saya mengimplementasikan override saya mengambil atribut di abstract class(MakhluqHidup), yaitu atribut berkembang.
   
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
Cukup itu penjelasan mengenai  implementasi abstract, overload, dan override pada java. 
semoga hal tersebut bisa membantu anda terimakasih 😄

