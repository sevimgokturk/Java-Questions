package questions;

import java.util.Scanner;

public class Q06 {
            /*
        write a method that find the maximum number from an int array
         */
            public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                System.out.println("enter length of array: ");
                int length = scan.nextInt();
                int arr []=  new int[length];
                System.out.println("enter the elements: ");
                for (int i=0 ; i<length; i++){
                    arr[i]=scan.nextInt();
                }
                System.out.println("max= " +maxNumOfArray(arr));
            }

            public static int maxNumOfArray ( int array []){
                int max = -1000000;
               for ( int w : array){
                   max= w>max ? w :max;
               }
               return max;

            }
}
