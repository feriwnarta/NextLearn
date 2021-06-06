/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception_handling;

/**
 *
 * @author Feri Winarta
 */
public class ExceptionWithIF {
    public static double exceptionWithIf(int a, int b){
        if(b != 0){
            return a / b;
        } else {
            System.out.println("exception with if error : "  );
            return 0;
        }
    }
    
    public static double exceptionWithTry(int a, int b){
        try {
            return a / b;
        } catch(ArithmeticException e){
            System.out.println("exception with try error : ");
            return 0;
        }
    }
    
    public static void tes(int a, int b){
        System.out.println(a / b);
    }
    
    public static void main(String[] args) {
        // tidak error
        System.out.println("sebelum error");
        int a = 10;
        int b = 5;
        System.out.println(exceptionWithIf(a, b));
        System.out.println(exceptionWithTry(a, b));
        
        // saat terjadi error
        System.out.println("\nsaat terjadi error");
        b = 0;
        exceptionWithIf(a, b);
        exceptionWithTry(a, b);
        
        // tanpa exception - > aritmatik exception byzero
        // tes(a, b);/
    }
}
