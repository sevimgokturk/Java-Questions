package questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q04 {
        /*
    Write a return method  that can find the unique characters from the String
    Ex:unique("AAAABBBCCCDEF") => "DEF"
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a string");
        String str = scan.next();
        System.out.println(uniqueElements(str));

    }
    public static String uniqueElements (String str){
        List<String> list = Arrays.asList(str.split(""));
        List<String> uniqueList =new ArrayList<>();
       for (String w : list){
           if(list.lastIndexOf(w)==list.indexOf(w)){
             uniqueList.add(w);
           }
       }
       return String.join("",uniqueList);
    }



}
