package calculator;

import java.util.Scanner;

public class IsOperator03 {
    static Scanner scanner=new Scanner(System.in);
    static String operator="";

    public static int isOperator(){
        boolean notWorking=true;
        do{
            try {
                System.out.println("enter the number of operator: ");
                operator= scanner.next();
                Integer.parseInt(operator);
                do{
                    if(Integer.parseInt(operator)>0 && Integer.parseInt(operator)<6){
                        break;
                    }else {
                        System.out.println("The range is between  1-5 !!");
                        System.out.println("enter the number of operator: ");
                        operator= scanner.next();
                    }
                }while (Integer.parseInt(operator)<1 || Integer.parseInt(operator)>5);

                notWorking =false;
            }catch (NumberFormatException e){
                System.out.println("it is not a number!");

            }

        }while (notWorking);

        return Integer.parseInt(operator);

    }








}
