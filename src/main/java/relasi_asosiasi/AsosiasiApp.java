/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relasi_asosiasi;

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
    
    public Orders(String tanggal) {
        this.tanggal = tanggal;
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

public class AsosiasiApp {
    public static void main(String[] args) {
        // depedency hubungan terjadi hanya di method saja
        // tidak mempunyai atribut kelas lain didalamnya
        
        // asosiasi hampir serupa
        // akan tetapi asosiasi memiliki atribut dari kelas lain, sedangkan
        // depedency tidak memiliki atribut kelas lain
        // yg nanti akan dihubungkan melalui method setter
        
        // objek customer berdiri sendiri dan belum berelasi dengan objek
        // Customer
        Customer cust = new Customer("sapeudin", 3, 1200);
        
        Orders order = new Orders("29 April 2021");
        order.datfarPesanan();
        order.getTanggal();
        //  order.preSales(); // ERROR -> Null Pointer Exception
        order.setCust(cust); // -> Objek cust sudah beralasi dengan objek order
        // didalam asosiasi relasi terjadi melalui method setter
        
        String namaCust = order.getCust().getNama();
        System.out.println("Nama Customer " + namaCust);
        
        order.preSales(); // -> tidak null karena atribut objek cust
        // sudah diinisialiasi pada method setter (setCust)
        
        
        // kesimpulan
        // asosiasi kelas mempengaruhi life cycle parentnya
        // tetapi tidak mempengaruhi childnya
        
        
        Customer cust2 = new Customer("sodin", 4, 1900); // -> berdiri sendiri
        Orders order2 = new Orders("29 April 2021"); // -> bergantung dengan child
        
        
        // jika order tidak buat, customer bisa tetap ada dan bisa berelasi
        // dengan order lain
        
        // akan tetapi order tidak bisa berdiri sendiri / membuthukan childnya
        // karena jika customer tidak ada, maka tidak ada penjualan
        
        
    }    
}
