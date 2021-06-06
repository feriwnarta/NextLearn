/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relas_composition;

/**
 *
 * @author Feri Winarta
 */
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
    private Customer cust;
    
    // kalo di tambahin parameter Customer cust, jadinya bertipe aggregasi
    // dengan langsung inisialiasi objek customer didalam
    // konstruktor, maka dapat langsung menghidari null pointer
    // jika customer di nullin sama saja
    // dan lifecyle customer bergantung dengan order
    // jika order mati customer ikut mati
    public Orders(String tanggal) {
        this.tanggal = tanggal;
        cust = new Customer("29 April 2021", 24, 12000);
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public Customer getCust() {
        return cust;
    }

    public void setCust(Customer cust) {
        this.cust = cust;
    }

    public void preSales(){
        System.out.println("Tanggal       : " + tanggal);
        System.out.println("Customer      : " + cust.getNama());
        System.out.println("id            : " + cust.getIdPelanggan());
        System.out.println("total belanja : " + cust.getTotalBelanja());
    }
    
    public void datfarPesanan(){
        System.out.println("masih banyak");
    }
    
}

public class CompositionApp {
    public static void main(String[] args) {
        // kalo di tambahin parameter Customer cust, jadinya bertipe aggregasi
        // dengan langsung inisialiasi objek customer didalam
        // konstruktor, maka dapat langsung menghidari null pointer
        // jika customer di nullin sama saja
        // dan lifecyle customer bergantung dengan order
        // jika order mati customer ikut mati
        Orders order = new Orders("29 April 2021");
        order.preSales();
        
        
    }
}
