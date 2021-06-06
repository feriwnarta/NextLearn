/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relasikelas.assosation.bidirectional.onetoone;

/**
 *
 * @author Feri Winarta
 */
public class Ruangan {
    private String ukuran;
    private Lemari lemari;

    public Ruangan(String ukuran) {
        this.ukuran = ukuran;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public Lemari getLemari() {
        return lemari;
    }

    public void setLemari(Lemari lemari) {
        this.lemari = lemari;
    }
    
    public void displayFromRuangan(){
        System.out.println("ruangan dengan ukuran " + ukuran);
    }
}
