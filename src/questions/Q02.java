package questions;

import java.util.HashSet;
import java.util.Scanner;

public class Q02 {
    /*
Write a return method that can remove the duplicated values
from String
Ex: removeDup("AAAABBBCCC") = "ABC"
 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a string");
        String str = scan.next();
        System.out.println(uniqueElements(str));;
    }
    public static String uniqueElements (String str){
        char strchar[]=str.toCharArray();
        HashSet<String> uniqueElementsHasSet = new HashSet<String>();;
        int i=0;
       for (char w : strchar){
               uniqueElementsHasSet.add(String.valueOf(w));
       }
       String result = String.join("",uniqueElementsHasSet);
        return result;
    }

}
