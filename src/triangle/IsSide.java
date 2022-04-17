package triangle;

import static calculator.IsNumber02.isNumberr;

public class IsSide {
    public static double isSide(){
        boolean isZero= true;
        double side;
        do {
             side =isNumberr();
            if(side!=0){
                isZero=false;
            }else {
                System.out.println(" Cannot be zero!");
            }
        }while (isZero);
        return side;



    }
}
