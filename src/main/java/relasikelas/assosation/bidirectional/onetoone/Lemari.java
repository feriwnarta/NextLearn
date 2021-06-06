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
public class Lemari {
    private int pintu;
    private Ruangan ruang;

    public Lemari(int pintu) {
        this.pintu = pintu;
    }

    public int getPintu() {
        return pintu;
    }

    public void setPintu(int pintu) {
        this.pintu = pintu;
    }

    public Ruangan getRuang() {
        return ruang;
    }

    public void setRuang(Ruangan ruang) {
        this.ruang = ruang;
    }
    
    public void displayFromLemari(){
        System.out.println("Lemari dengan " + pintu + " pintu");
    }
}
