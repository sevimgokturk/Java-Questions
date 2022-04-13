package questions;

public class Q21Permutation {
        /*
    Amazon interview question
    string permutation
    write a method that takes string and two integer index value as a parameter
    then print out on the console all permutations of that string.
    these permutations must be done on bounded part of the string which is from startindex to endindex.
    Both indexes are inclusive.
    permute("ABCD",1,2);  => ABCD, ACBD
     */
    public static void main(String[] args) {
        String str ="ABCDE";
        int startindex=0;
        int endindex=3;
        permutation(str,startindex,endindex);
    }

    public static void permutation ( String str,int  startindex, int endindex ) {
        char arr[]=new  char [str.length()];
        char temp;
        for(int i=0; i<str.length(); i++){
            arr[i]=str.charAt(i);
        }
        for(int i=0; i<str.length(); i++){
            for(int j=0; j<str.length(); j++){
                if(i!=startindex && i!=endindex && j!=startindex && j!= endindex){
                    temp=  arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    System.out.println(arr);

                }

            }
        }








    }
}
