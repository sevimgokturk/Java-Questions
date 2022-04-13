package questions;

import java.util.Scanner;

public class Q16 {
        /*
    Write a code to calcuate n factorials
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number to calculate the factorials");
        int n=scan.nextInt();
        if(n<0){
            System.out.println("must be positive");
        } else if (n==0) {
            System.out.println("1");
        }else {
            int factorial = 1;
            for (int i = 1; i < n + 1; i++) factorial = factorial * i;
            System.out.println(factorial);
        }

    }
}
