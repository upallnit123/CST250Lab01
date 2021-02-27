/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ru.cst250hwk1;

/**
 *
 * @author upall
 */
public class MainClass {
    public static void main(String[] args){
        String[] wArray1 = {"this", "that", "what", "how"};

        String[] wArray2 = new String[4];
        StringBuilder str1;
        str1 = new StringBuilder(wArray1[4]);
        
        StringBuilder str2;
        str2 = new StringBuilder(wArray2[4]);
        
        for (int index = 0; index < wArray1.length; index++) {
            str2.insert(0, "_");
            str2.append(wArray1[index]);
            
            System.out.println(wArray1[index]);
            System.out.println(wArray2[index]);
        }
    }
    
}
