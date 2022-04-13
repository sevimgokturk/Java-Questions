package questions;

import java.util.*;

public class Q03 {
        /*
    Write a return method that can reverse String
    ex:reversed("ABCD") => DCBA
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a string");
        String str = scan.next();
        System.out.println(reverse(str));
    }
    public static String reverse(String str){
        List<String> list = Arrays.asList(str.split(""));
        List<String> reverseList= new ArrayList<>();
        for (int i =list.size()-1; i>-1; i--){
           reverseList.add(list.get(i));
        }
        return String.join("",reverseList);
    }


}
