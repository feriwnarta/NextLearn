/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relasikelas.assosation.bidirectional.onetoone;

public class BidirectionalOneToOneApp {
    public static void main(String[] args) {
        Ruangan ruang = new Ruangan("4 X 3");
        Lemari lemari = new Lemari(2);
        
        // objek ruang memakai relasi asosiation dan mengakses
        // method didalam objek lemari
        ruang.setLemari(lemari);
        System.out.print("ruangan dengan ukuran " + ruang.getUkuran() + " memiliki ");
        ruang.getLemari().displayFromLemari();
        
        System.out.println("");
        
        // objek lemari memakai relasi asosiation dan mengakses
        // method didalam objek ruang
        lemari.setRuang(ruang);
        System.out.print("lemari " + lemari.getPintu() + " dua pintu " + " berada di ");
        lemari.getRuang().displayFromRuangan();

    }
}
