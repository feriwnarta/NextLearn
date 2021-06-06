/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

/**
 *
 * @author Feri Winarta
 */
public class BubbleSort2 {
    
    public static void main(String[] args) {
        int[] array = {10,20,5,2,12,8,7};
        System.out.println("array sebelum sorting");
        for(int data : array){
            System.out.print(data + " ");
        }
        System.out.println("");
        bubbleSort(array);
        
        
        
    }
    
    static void bubbleSort(int[]array){
        // berfungsi menggeser index perulangan saat perbandingan
        for(int i = 0; i < array.length; i++){
            for(int j = 1; j < array.length - i; j++){
                if(array[j-1] > array[j]){
                    int swap = array[j-1];
                    array[j-1] = array[j];
                    array[j] = swap;
                }
            }
        }
        System.out.println("sesudah sorting denga bubble sort : ");
        for(int data : array){
            System.out.print(data + " ");
        }
        System.out.println("");
    }
}
