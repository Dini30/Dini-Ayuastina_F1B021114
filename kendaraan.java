/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan_6;

import java.util.Scanner;

abstract class kendaraann {
    
    String Merek;
    int Kecepatan;
    String Jenis;
    
    abstract void Melaju();
    
    void Tampil (){
        System.out.println(" \nJenis "+Jenis);
        System.out.println(" Kecepatan "+Kecepatan);
        System.out.println(" Merek "+Merek);
    }
  
}
class motor extends kendaraann {
    
    motor(String jenis, int kecepatan, String merek){
        this.Jenis = jenis;
        this.Kecepatan=kecepatan;
        this.Merek =merek;
    }
    
    void Melaju(){
        System.out.println("======== Jenis  ========");
        System.out.println("Jenis Motor "+Jenis);
        System.out.println("======== Kecepatan ========");
        System.out.println("Kecepatan Motor "+Kecepatan+" Km/Jam");
        System.out.println("======== Merek ========");
        System.out.println("Merek Motor "+Merek);
    }
}

class mobil extends kendaraann {
    
    mobil(String jenis, int kecepatan, String merek){
        this.Jenis = jenis;
        this.Kecepatan=kecepatan;
        this.Merek =merek;
    }
    
    @Override
    void Melaju(){
        System.out.println("======== Jenis  ========");
        System.out.println("Jenis Mobil "+Jenis);
        System.out.println("======== Kecepatan ========");
        System.out.println("Kecepatan Mobil "+Kecepatan+" Km/Jam");
        System.out.println("======== Merek ========");
        System.out.println("Merek Mobil "+Merek);
    }
}

public class kendaraan{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        String a;
        System.out.print("Masukan Jenis Motor: ");
        a = in.next();
        
        int b;
        System.out.print("Masukan Kecepatan Motor: ");
        b = in.nextInt();
        
        String c;
        System.out.print("Masukan Merek Motor: ");
        c = in.next();
        
        motor motor = new motor(a,b,c);

        motor.Melaju();
        
        String aa;
        System.out.print("Masukan Jenis Mobil: ");
        aa = in.next();
        
        int bb;
        System.out.print("Masukan Kecepatan Mobil: ");
        bb = in.nextInt();
        
        String cc;
        System.out.print("Masukan Merek Mobil: ");
        cc = in.next();
        
        mobil mobil = new mobil(aa,bb,cc);

        mobil.Melaju();

    }
}

