/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relasikelas.assosation.bidirectional.onetomany;

import java.util.LinkedList;

/**
 *
 * @author Feri Winarta
 */
public class OneToManyApp {
    
    public static void main(String[] args) {
        LinkedList<Mahasiswa> dataMhs = new LinkedList<>();    
        Dosen dosen = new Dosen("Pujitono", dataMhs);
        
        Mahasiswa mhs1 = new Mahasiswa("adin",2020141,"IF21");
        Mahasiswa mhs2 = new Mahasiswa("aduy",2020142,"IF21");
        Mahasiswa mhs3 = new Mahasiswa("adeng",2020143,"IF21");
        
        dataMhs.add(mhs1);
        dataMhs.add(mhs2);
        dataMhs.add(mhs3);
        
        dosen.setMhs(dataMhs);
        
        // dosen.getMhs(), mereturn sebuah nilai bertipe linked list, lalu hasil return tersebut
        // ditaro keadalam linkedlist result
        LinkedList<Mahasiswa> result = dosen.getMhs();
        // for each isi linked list, result bertipe linkedlist<Mahasiswa>, nilai linked mereturn nilai Mahasiswa
        // sehingga hasil linked result dapat ditaruh kedalam tipe mahasiswa 
        for(Mahasiswa data : result) {
            System.out.println("Nama  : " + data.getNama());
            System.out.println("Nim   : " + data.getNim());
            System.out.println("Kelas : " + data.getKelas());
            System.out.println("");
        }
        
        
        
        
        
    }
}
