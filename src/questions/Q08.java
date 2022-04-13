package questions;

import java.util.*;

public class Q08 {
            /*
        Write a return method that can sort an int array in ascending order
        without using the sort method of the Arrays class
         */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter length of array: ");
        int length = scan.nextInt();
        Integer arr []=  new Integer[length];
        System.out.println("enter the elements: ");
        for (int i=0 ; i<length; i++){
            arr[i]=scan.nextInt();
        }
        ascendingOrderArray(arr);
    }

    public static void ascendingOrderArray( Integer arr []) {
       for ( int i =0; i< arr.length; i++){
           for (int j=i+1; j< arr.length; j++){
               int temporal ;
               if( arr[i]>arr[j]){
                   temporal=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temporal;
               }
           }
       }
        System.out.println(Arrays.toString(arr));
    }



}
