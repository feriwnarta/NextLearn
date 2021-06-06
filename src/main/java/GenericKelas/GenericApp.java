/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericKelas;

/**
 *
 * @author Feri Winarta
 */
public class GenericApp {
    
    public static void main(String[] args) {
        DataClass<Integer, Integer> data = new DataClass<>();
        data.setData1(10);
        data.setData2(20);
        
        
        
        
    }
    
    public static void hasilKali(DataClass<? extends Object> data){
        
    }
}
