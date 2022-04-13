package questions;

import java.util.Arrays;
import java.util.Scanner;

public class Q01 {
    /*
Write a return method that checks if a string is build out
of the same letters as another string.
Ex: same("abc","cab") =>true , same("abc","abcc") = > false

 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a string");
        String str1 = scan.next();
        System.out.println("enter another string");
        String str2 = scan.next();
        System.out.println(isSameBuilt(str1,str2));

    }
    public static boolean isSameBuilt(String str1, String str2){
        char str1char[]=str1.toCharArray();
        char str2char[]=str2.toCharArray();
        Arrays.sort(str1char);
        Arrays.sort(str2char);
        boolean isTrue =Arrays.equals(str1char,str2char);
        return isTrue;
    }

}
