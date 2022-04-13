package questions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;

public class Q22 {

    /*
    interview question: find duplicates or uniques in a string, array or list!
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
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i=0 ; i<list.size() ; i++){
            for (int j=0 ; j<list.size() ; j++){
                if(i!=j && list.get(i)==list.get(j)){
                   hashSet.add(list.get(i)) ;
                }
            }
        }
        System.out.println("duplicated "+hashSet);

    }
}
