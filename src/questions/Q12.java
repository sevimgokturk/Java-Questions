package questions;

public class Q12 {
        /*
      swap two number without using third element
     */
    public static void main(String[] args) {
        int a= 1;
        int b=2;
         b=a+b;
         a = b-a;
         b= b-a;
        System.out.println("a= "+a +"  "+ "b="+b);

    }
}
