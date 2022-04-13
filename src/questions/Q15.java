package questions;

import java.util.ArrayList;
import java.util.List;

public class Q15 {
            /*
        given a list 1,2,3,4,...etc.
        remove all elements greater than 100
         */

    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();
        for (int i =1; i<1000; i++) list.add(i);
        list.removeIf(n->(n>100));
        System.out.println(list);

    }
}
