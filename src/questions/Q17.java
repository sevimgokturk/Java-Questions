package questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q17 {
            /*
        Find the sum of all digits in integer
         */
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter a integer to calculate sum of the digits.");
        String num = scan.next();

        List<String> list = Arrays.asList(num.split(""));
        int sum=0;

        for (int i=0; i<list.size(); i++){
            sum = sum+ Integer.parseInt(list.get(i));
        }

        System.out.println(sum);

    }
}
