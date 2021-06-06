/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generic;

import java.util.Iterator;

/**
 *
 * @author Feri Winarta
 */
public class CollectorApplication {
    public static void main(String[] args) {
        Collector<Integer> c1 = new Collector<>();
        c1.add(1);
        c1.add(2);
        c1.add(3);
        c1.add(4);
        c1.add(5);
        c1.add(6);
        c1.add(7);
        c1.add(8);
        c1.add(9);
        c1.add(10);
        
        // for each buatan sendiri
        for(Integer data : c1) {
            System.out.println(data);
        }
        
//        c1.add(11);
//        c1.add(1);
//        c1.add(2);
//        c1.add(3);
//        c1.add(4);
//        c1.add(5);
//        c1.add(6);
//        c1.add(7);
//        c1.add(8);
//        c1.add(9);
//        c1.add(9);
//       Iterator i = c1.iterator();
//       while(i.hasNext()) {
//           System.out.println(i.next());
//       }
       
//        c1.forEach();
        
        
        
        
        
        
        
        
        
        
        
    }
}
