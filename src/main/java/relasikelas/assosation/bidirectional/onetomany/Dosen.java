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
public class Dosen {
    private String namaDosen;
    private LinkedList<Mahasiswa> mhs;

    public Dosen(String namaDosen, LinkedList<Mahasiswa> mhs) {
        this.namaDosen = namaDosen;
        this.mhs = mhs;
    }

    public String getNamaDosen() {
        return namaDosen;
    }

    public void setNamaDosen(String namaDosen) {
        this.namaDosen = namaDosen;
    }
    
    public void setMhs(LinkedList<Mahasiswa> mhs){
        this.mhs = mhs;
    }
    
    public LinkedList<Mahasiswa> getMhs(){
        return mhs;
    }
    
    
}
