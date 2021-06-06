/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anonymousclass;

/**
 *
 * @author Feri Winarta
 */

class Kompare {
    public static void sortt(String nama, MyInterface my) {
        System.out.println(nama + " melakukan sorting nih");
        my.myMethod();
    }
}

public class AnonymousImplementasi extends Kompare{
    public static void main(String[] args) {
//        MyInterface anonymous = new MyInterface() {
//            @Override
//            public void myMethod() {
//                System.out.println("Hasil anonymous");
//            }  
//        };

        Kompare.sortt("Feri", new MyInterface(){
            @Override
            public void myMethod() {
                System.out.println("Isi method dari MyInterface");
            }
        });

    }
}
