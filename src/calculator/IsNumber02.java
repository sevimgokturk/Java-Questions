package calculator;

import java.util.Scanner;

public class IsNumber02 {
    static Scanner scanner=new Scanner(System.in);
    static String num="";

    public static double isNumberr(){

        boolean notWorking=true;

        do{
            try {
                System.out.println("enter a number: ");
                num= scanner.next();
                Double.parseDouble(num);
                notWorking =false;
            }catch (NumberFormatException e){
                System.out.println("it is not a number!");

            }

        }while (notWorking);
        return Double.parseDouble(num);
    }
}
