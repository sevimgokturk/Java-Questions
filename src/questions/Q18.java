package questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q18 {
    /*
  write the fibonacci series up to n-th terms
   */
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter a number as a length of an array to create a fibonacci series");
        int n= scan.nextInt();

        int arr[]=new int[n];
        arr[1]=1;
        arr[2]=1;

        for (int i=3; i<n ; i++){
            arr[i]=arr[i-1] +arr[i-2];
        }
        System.out.println(Arrays.toString(arr));




    }
}
