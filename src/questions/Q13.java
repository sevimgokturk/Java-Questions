package questions;

import java.util.ArrayList;
import java.util.List;

public class Q13 {
        /*
    Given a list of people's names: ["Ahmed", "John", "Eric",...]
    write a method to remove all the names  Ahmed
     */
        public static void main(String[] args) {
            List<String> names =new ArrayList<>();
            names.add("Ahmed");
            names.add("Ahmed");
            names.add("Ahmed");
            names.add("John");
            names.add("Eric");
            names.add("John");
            ArrayList<String> names2 =new ArrayList<>();
            for (String w: names){
                if(!w.equals("Ahmed")){
                    names2.add(w);
                }
            }
            System.out.println(names2);




        }
}
