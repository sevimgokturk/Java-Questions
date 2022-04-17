package triangle;

import static triangle.Triangle.*;

public class PerimeterAndArea {
    public static void  perimeterAndArea(){
        double u=(side1+side2+side3)/2;
        double forArea;
        System.out.println("Perimeter: "+ 2*u);
        forArea=u*(u-side1)*(u-side2)*(u-side3); //  u=perimeter/2 ===> area= √(u(u-a)(u-b)(u-c))
        System.out.println("Area: "+ Math.sqrt(forArea));// Math.sqrt() ===> square a number
    }
}
