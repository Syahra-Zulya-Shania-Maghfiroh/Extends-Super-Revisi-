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
public class Transaksi extends Penginapan{
    //mendefinisikan variable
    int total, bayar = 300000, kembalian;
    
    //method konstruktor pada subclass 2 (itu yang menjadi alasan kenapa selamat datang tetap muncul di output)
    void transaksi(){
        super.akhir();//pemanggilan super pada method akhir di superclass
        total = hari*harga_sewa;    //rumus total penyewaan
        System.out.println("Total yang Harus dibayar : "+total);    //output dari pemasukan nilai
        System.out.println("Jumlah uang yang dibayar : "+bayar);    //output dari pemasukan nilai
        kembalian = bayar-total;    //rumus kembalian dari penyewaan
        System.out.println("Kembalian Anda : "+kembalian);  //output dari keseluruhan nilai (nilai akhir)
}
}