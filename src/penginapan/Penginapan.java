/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penginapan;

/**
 *
 * @author MOKLET-01
 */
public class Penginapan {
    //mendefinisikan variable
    int harga_sewa = 105000, hari = 2;


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //inisialisasi objek
        Sewa objek = new Sewa();
        objek.penyewaan(2, 105000); //pemanggilan method penyewaan dengan pengisian parameternya
        Transaksi proses = new Transaksi();
        proses.transaksi(); //pemanggilan method transaksi
     
    }
    //method konstruktor pada superclass
    public Penginapan(){
        System.out.println("==========================================");
        System.out.println("**__SELAMAT DATANG DI PENGINAPAN BARU__**");
    }
    //method cover
    void cover(){
        System.out.println("==========================================");
        System.out.println("~~~BERIKUT IDENTITAS ANDA~~~");
    }
    //method keterangan
    void keterangan(){
        System.out.println("==========================================");
        System.out.println("~~~BERIKUT RINCIAN SEWA~~~");
    }
    //method akhir
    void akhir(){
        System.out.println("==========================================");
        System.out.println("~~~NOTA~~~");
    }

    }
    
    

