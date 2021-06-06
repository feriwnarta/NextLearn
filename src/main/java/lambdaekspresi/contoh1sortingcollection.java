/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdaekspresi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Feri Winarta
 */
public class contoh1sortingcollection {
    
    public static void tanpaLambda(List<String> nama){
//        Comparator comparator = new Comparator(){
//            @Override
//            public int compare(Object o1, Object o2) {
//                String s1 = (String)o1;
//                String s2 = (String)o2;
//                return s1.compareTo(s2);
//            }
//        };
        //Collections.sort(nama,comparator);
        
        Collections.sort(nama, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                String s1 = (String)o1;
                String s2 = (String)o2;
                return s1.compareTo(s2);
            }
        });
    }
    
    public static void denganLambda(List<String> nama){
       Collections.sort(nama, (s1,s2) -> s1.compareTo(s2));
    }
    
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        
        list1.add("jamal");
        list1.add("axin");
        list1.add("budi");
        list1.add("zazang");
        list1.add("udin");
        list2.addAll(list1);
        
        System.out.println("isi list 1 dan 2");
        System.out.println(list1);
        
        System.out.println("\nsorting tanpa lambda");
        //System.out.println(list1);
        tanpaLambda(list1);
        System.out.println(list1);
        
        System.out.println("\nsorting dengan lambda");
        //System.out.println(list2);
        denganLambda(list2);
        System.out.println(list2);
        
        
    }
    
}
