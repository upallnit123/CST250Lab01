package edu.ru.csthwk1b;

/**
 *
 * @author upall
 */
public class MainClass2 {

    public static void main(String[] args){
        
        //int[] inputArray = new inputArray[15];
        removeElement[] inputArray;
    
    }
    /**
     * @param inputArray
     * @param n
     * @return 
     */

    
    public static int[] removeElement(int[] inputArray, int n) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15};
        n = 7;
        //int[] inputArray = new inputArray[8];
        for (int index = 0; index < inputArray.length; index++){
            //System.out.println("This is the original array: ");
            //System.out.print
            if (inputArray[index] != n){
                inputArray[index] = arr[index];}
    
        System.out.println("This is the original array: ");
        System.out.print(arr[index]);
        System.out.println("This is the modified array: ");
        System.out.print(inputArray[index]);
        }
        return inputArray;
    }
   
}