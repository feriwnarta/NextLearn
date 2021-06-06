/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relasi_depedency;


class Customer {
    private String nama;
    private int totalBelanja;
    private int idPelanggan;

    public Customer(String nama, int idPelanggan, int totalBelanja) {
        this.nama = nama;
        this.idPelanggan = idPelanggan;
        this.totalBelanja = totalBelanja;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(int idPelanggan) {
        this.idPelanggan = idPelanggan;
    }
    
     public int getTotalBelanja() {
        return totalBelanja;
    }

    public void setTotalBelanja(int totalBelanja) {
        this.totalBelanja = totalBelanja;
    }
    
}

class Orders {
    private String tanggal;
    
    public Orders(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public void preSales(Customer c){
        System.out.println("Tanggal       : " + tanggal);
        System.out.println("Customer      : " + c.getNama());
        System.out.println("id            : " + c.getIdPelanggan());
        System.out.println("total belanja : " + c.getTotalBelanja());
    }
    
    public void datfarPesanan(){
        System.out.println("masih banyak");
    }
    
}


public class DepedencyApp {
    public static void main(String[] args) {
        // depedency merupakan hubungan yg sepihak
        // depedency hubungan lemah
        // analogi (pemeran utama, pemeran pegganti)
        // keberadaan kelas pegganti akan ada jika method di kelas utama
        // menggunakan kelas pengganti tsb
        // kelas pegganti keberadaanya tidak tetap tergantung kelas utama
        // jika kelas utama tidak membutuhkan kelas pengganti maka
        // kelas pengganti tidak akan terpakai
        
        // keberadaan cust hanya ada saja tidak terpakai
        // cust akan terpakai jika order memakainya (menggunakan method)
        Customer cust = new Customer("saepudin", 2, 1000);
        
        Orders order = new Orders("29 april 2021");
        System.out.println(order.getTanggal());
        order.datfarPesanan();
        
        // objek customer akan terpakai jika oder ingin menggukan kelas tsb
        // dengan cara order memanggil method yg menhubungkan dengan objek cust
        
        // kelas customer terpakai di kelas order
        // order.preSales(cust);
        
        // resiko depedency ada nullpointer exception jika objek null
        // atau eror runtime jika lupa masukan argumen objek
        // error tidak memasukan argumen
        // order.preSales(); -> error
        
        
        // objek cust dengan tipe null
        // null pointer exception
        // Customer cust2 = null;
        // order.preSales(cust2); -> error null exception
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
