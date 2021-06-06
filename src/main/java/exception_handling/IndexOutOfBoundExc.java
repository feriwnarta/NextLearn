/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception_handling;

import java.util.Scanner;

/**
 *
 * @author Feri Winarta
 */
public class IndexOutOfBoundExc {
    
    public static void main(String[] args) {
        int[] data = new int[]{1,2,3,4,5};
        try {
            for(int i = 0; i < 10; i++){
                System.out.println(data[i]);
            }
        } catch(ArrayIndexOutOfBoundsException ex) {
            System.err.println("array lebih nih bos");
        }
    }
}
