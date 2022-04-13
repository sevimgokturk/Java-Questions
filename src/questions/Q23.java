package questions;

import java.util.ArrayList;
import java.util.List;

public class Q23 {
        /*
    find number of occurences in a string,array, or a list
     */
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(2);

        List<Integer> list2= new ArrayList<>();

        for (int i=0 ; i<list.size() ; i++){
            if (!list2.contains(list.get(i))){
                list2.add(list.get(i));
            }
        }

        for (int i=0 ; i<list2.size() ; i++){
            int counter=0;
            for (int j=0 ; j<list.size() ; j++){
                if(list2.get(i)==list.get(j))
                    counter++;
            }
            System.out.println(list2.get(i)+" "+ counter);

        }

    }
}
