/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Feri Winarta
 */
public class RegexApp {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("feri"); // yg ingin dicari
        Matcher match = pattern.matcher("saya adalah feRi winarta"); // string asal pencarian
        
        boolean isFound = match.find();
        
        if(isFound){
            System.out.println("Ketemu !!!!");
        } else {
            System.out.println("tidak ketemu");
        }
        
        // patter parameter firs paramater
//        Pattern pattern2 = Pattern.compile("[0-9]");
//        Matcher matcher2 = pattern2.matcher("5");
//        boolean isFound2 = matcher2.find();
//        System.out.println(isFound);

        String value = "Feri winarta";
        
        String[] regex = value.split("\\d");
        
        for(String data : regex) {
            System.out.println(data);
        }
        
        
        
        
        
        
        
        
            
    }
}
