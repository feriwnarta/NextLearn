/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception_handling;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Feri Winarta
 */
public class RutimeExWithBigDecimal {
    public static void main(String[] args) {
        // runtime exception / unchekedException
        // pembagian big decimal ada error aritmatik
        // dimana hasil pembagian harus dibulatkan 
        
        BigDecimal bg1 = new BigDecimal(22);
        BigDecimal bg2 = new BigDecimal(7);
        
        // handling exception big decimal
        try {
            System.out.println(bg1.divide(bg2));
        } catch(ArithmeticException ex){
            System.err.println(bg1.divide(bg2, 7, RoundingMode.CEILING));
        }
        
        
    }
}
