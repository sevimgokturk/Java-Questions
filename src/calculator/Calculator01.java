package calculator;

import static calculator.IsNumber02.isNumberr;
import static calculator.IsOperator03.isOperator;

public class Calculator01 {
    public static void main(String[] args) {

        System.out.println("enter two number to calculate them.");

        double num1= isNumberr();
        System.err.println("first number is : "+ num1);

        double num2= isNumberr();
        System.err.println("second number is : "+ num2);


        System.out.println("Chose the operation: ");
        System.out.println("for addition       : 1 ");
        System.out.println("for subtraction    : 2 ");
        System.out.println("for multiplication : 3 ");
        System.out.println("for division       : 4 ");
        System.out.println("for power          : 5 ");
        System.out.println("Please enter your chosen number: ");

        int operator = isOperator();

        switch (operator){
            case 1:
                Addition11.additionOp(num1,num2);
                break;

            case 2:
                Subtraction12.subtraction(num1,num2);
                break;

            case 3:
                Multiplication13.multiplication(num1,num2);
                break;

            case 4:
                Division14.division(num1,num2);
                break;

            case 5:
                Power15.power(num1,num2);
        }


    }
}
