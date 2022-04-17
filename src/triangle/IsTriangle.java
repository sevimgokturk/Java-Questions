package triangle;

import static triangle.IsSide.isSide;
import static triangle.Triangle.side1;
import static triangle.Triangle.side2;
import static triangle.Triangle.side3;

public class IsTriangle {
    public static void isTriangle() {
        boolean notTriangle =true;
        do {
            System.out.println("Enter the third side: ");
             side3 = isSide();
            if (side1 < side2 + side3 && side1 > Math.abs((side2 - side3)) && //Math.abs() ==>Absolute value
                    side2 < side1 + side3 && side2 > Math.abs((side1 - side3)) &&
                    side3 < side2 + side1 && side3 > Math.abs((side2 - side1))) {
                System.out.println(" It is a triangle");

                notTriangle=false;
            } else {
                System.err.println("don't able to create a triangle with this number.");
                System.out.println("enter another number for third side pls. ");
            }
        }while (notTriangle);
        System.out.println("First: "+side1+"  second: "+side2+"  third: " + side3);

    }
}
