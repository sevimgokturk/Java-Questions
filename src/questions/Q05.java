package questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q05 {
        /*
    write a return method that can verify if a password is valid or not
    requirements:
    -password must be at least 6 characters and should not contain space
    -password should contain at least one upper case letter
    -password should contain at least one lowercase letter
    -password should contain at least one special character
    -password should contain at least one digit
    if all requirements are met then return true else return false
    !!!!! it is not working!!!!! Handle it !!!!!!!!!!
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your password: ");
        String str = scan.next();
        List<String> password = new ArrayList<>();
       boolean sixCharacter= str.length()>6;
       boolean noSpace= !str.contains(" ");
       boolean upperCase = str.contains("[A-Z]");
       boolean lowerCase = str.contains("[a-z]");
       boolean specialCharacter= str.contains("[p{Punct}]");
       boolean digits = str.contains("[\\0-9]");
       if( sixCharacter ==true &&
       noSpace==true&&
       upperCase==true&&
       lowerCase==true&&
       specialCharacter==true&&
       digits==true){
           System.out.println("valid");
       }else {
           System.out.println("-password must be at least 6 characters and should not contain space \n" +
                   "    -password should contain at least one upper case letter\n" +
                   "    -password should contain at least one lowercase letter\n" +
                   "    -password should contain at least one special character\n" +
                   "    -password should contain at least one digit\n" +
                   "    if all requirements are met then return true else return false");
       }



    }
}
