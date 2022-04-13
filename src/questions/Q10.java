package questions;

import java.util.Random;
import java.util.Scanner;


public class Q10 {
        /*
    write a method that can divide two numbers without using division operator
     */
        public static void main(String[] args) {
            Scanner scan =new Scanner(System.in);
            System.out.println("enter an integer as a dividend number: ");
            int dividend =scan.nextInt();
            System.out.println("enter an integer as a divisor number: ");
            int divisor =scan.nextInt();
            divisionOperation(dividend,divisor);
        }
        public static void divisionOperation (int dividend, int divisor){
            if(divisor==0|| divisor>dividend){
                System.out.println("dividing number must be less than number and different from zero.");
            }else {
                int remainder = dividend % divisor;
                int d = dividend - remainder;
                Random rand = new Random();
                do {
                    int randomQuotient = rand.nextInt(dividend);
                    if (divisor * randomQuotient == d) {
                        System.out.println("Quotient is : " + randomQuotient);
                        break;
                    }
                } while (true);
            }
        }


}
