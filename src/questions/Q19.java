package questions;

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a str to check if it is alphanumeric. ");
        String str = scan.next();
        String a=  str.replaceAll("\\p{Punct}", "");
        if(str.length()>a.length()) System.out.println(" not alphanumeric");
        else System.out.println("alphanumeric");




    }
}
