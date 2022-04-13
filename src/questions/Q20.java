package questions;

import java.util.*;
import java.util.stream.IntStream;

public class Q20 {
        /*
    given two ordered arrays, merge them breaking the order
    ex: [1,4,6,8]
        [3,5,6,7];  =>[1,3,4,5,6,6,7]
     */

    public static void main(String[] args) {
        int arr1[]={1,4,6,8};
        int arr2[]={3,5,6,7};

        List<Integer> list= new ArrayList<>();
        for (int w: arr1) list.add(w);
        for (int w: arr2) list.add(w);
        list.sort(Comparator.naturalOrder());
        System.out.println(list);









    }
}
