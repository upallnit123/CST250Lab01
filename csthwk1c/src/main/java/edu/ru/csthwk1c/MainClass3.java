/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ru.csthwk1c;

import java.util.Arrays;

/**
 *
 * @author upall
 */
public class MainClass3 {
    
    public static void main(String[] args){
        
        int[] array1 = {45,21,22,31,44,65,12,56,78,19,100};
        int[] array2 = new int[15];
        
         
        for(int index = 0; index < array1.length; index++){
            if(array1[index] % 2 != 0){
                array2[index] = array1[index];
            }       
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}
