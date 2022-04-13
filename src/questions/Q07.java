package questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Q07 {
        /*
    Write a return method that can find the frequency of characters
    frequencyOfChars("AAABBCDD") =>A3B2C1D2
     */
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter a string to find the frequency of characters: ");
            String str = scan.next();
            findFrequencyOfCharacter(str);
        }
        public static void findFrequencyOfCharacter(String str){
            List<String> list = Arrays.asList(str.split(""));
            HashSet <String> hashSet= new HashSet<>(list);
            for (String w : hashSet){
                int last = list.lastIndexOf(w);
                int first= list.indexOf(w);
                w = w +""+(last-first+1);
                System.out.print(w+" ");
                }
            }

}
