package questions;

public class Q14Permutation {
    /*
 Given an array of n characters  ex:"ABCD" n=4
 print all permutation from the given characters
  */
    public static void main(String[] args) {
        String str ="ABCD";
        permutation("", str);
    }

    private static void permutation(String prefix, String str) {
        int length = str.length();
        if (length == 0) System.out.println(prefix);
        else {
            for (int i = 0; i < length; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, length));
        }
    }
}
