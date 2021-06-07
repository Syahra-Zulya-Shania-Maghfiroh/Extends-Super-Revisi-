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
public class Sewa extends Penginapan{
    //mendefinisikn variable
    String nama = "Rara", alamat = "Blitar";
    
    //method konstruktor
    public Sewa (){
            //pemanggilan konstruktor di anak konstruktor
        super.cover();  //pemanggilan super pada method cover di superclass
        System.out.println("Nama : "+nama); //output dari pemasukan nilai
        System.out.println("Alamat : "+alamat); //output dari pemasukan nilai
    }
    //menerapkan method dengan menggunakan parameter
    void penyewaan (int hari, int harga_sewa){
        super.keterangan(); //pemanggilan super pada method keterangan di superclass
        System.out.println("Jumlah Hari : "+hari);  //output dari pemasukan nilai
        System.out.println("Harga Sewa /hari : "+harga_sewa);   //output dari pemasukan nilai
}
}