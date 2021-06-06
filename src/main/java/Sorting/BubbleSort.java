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
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {10,5,20,7,8,4};
        System.out.println("array sebelum sort");
        for(int data : array){
            System.out.print(data + " ");
        }
        
        System.out.println("\narray sesudah sorting");
        int data[] = bubbleSort(array);
        for(int result : data){
            System.out.print(result + " ");
        }
        System.out.println("");
    }
    
    static int[] bubbleSort(int[] array) {
        for(int i = 0; i < array.length; i++){
            for(int j = 1; j < array.length - i; j++){
                if(array[j-1] > array[j]){
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
