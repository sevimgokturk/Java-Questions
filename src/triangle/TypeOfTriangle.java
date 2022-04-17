package triangle;

import static triangle.Triangle.*;

public class TypeOfTriangle {
    public static void typeOfTriangle(){
        if(side1==side2|| side1==side3){
            if(side2==side3){
                System.out.println("Equilateral triangle");
            }else {
                System.out.println("Isosceles triangle");
            }
        }else if (side2==side3){
            System.out.println("Isosceles triangle");
        }else {
            System.out.println("Scalene triangle");
        }
    }
}
