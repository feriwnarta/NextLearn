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
public class Collector<T> implements Iterable<T>{
    private T[] data1;
    private int count, index;
    private int arraySize;
    
    public Collector(){
        data1 = new T[10];
        count = 0;
        arraySize = 10;
        index = 0;
    }
    
    public void add(T value){
        if(!bigger()) {
            data1[count] = value;
            count++;
        } else {
            bigger();
            data1[count] = value;
            count++;
        }
    }
    
    private boolean bigger(){
        if(count == data1.length-1){
            countingArray();
            return true;
        }
        return false;
    }
    
    private void countingArray(){
        // bigger array
        arraySize += 10;
        T[] temp = new T[data1.length];
        // copy array data ke temp
        for(int i = 0; i < data1.length; i++){
            temp[i] = data1[i];
        }
        // perbesar ukuran array data
        data1 = new T[arraySize];
        // kopi seluruh element di array temp ke array data yg baru
        for(int i = 0; i < temp.length; i++) {
            data1[i] = temp[i];
        }
    }
    
    public void forEach() {
        for(int i = 0; i < data1.length; i++){
            System.out.print(data1[i] + " ");
        }
        System.out.println("");
    }
    
    // implementasi forEach
    @Override
    public Iterator<T> iterator() {
        Iterator<T> i = new Iterator<T>() {
            @Override
            public boolean hasNext() {
               return data1[index] != null;
            }

            @Override
            public T next() {
                return data1[index++];
            }
        };
        return i;
    };
    
}
