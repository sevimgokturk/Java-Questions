package triangle;

import java.util.Scanner;

import static triangle.IsSide.isSide;
import static triangle.IsTriangle.isTriangle;
import static triangle.PerimeterAndArea.perimeterAndArea;
import static triangle.TypeOfTriangle.typeOfTriangle;

public class Triangle {
    static double side1;
    static double side2;
    static double side3;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 side of a triangle");

         side1 = isSide();
        System.out.println("The first side: "+ side1);

         side2 = isSide();
        System.out.println("The second side: "+ side2);

        isTriangle();

        typeOfTriangle();

        perimeterAndArea();

    }
}
