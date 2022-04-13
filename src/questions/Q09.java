package questions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Q09 {
            /*
        Write a function that given an integer N(1<N<100),
        returns an array containing N unique integers that sum up to 0.
        The function can return any such array. for ex: N=4
        the function could return
        [1-0,-3,2]
        [-2,1,-4,5]
        [1,-1,1,3] would be incorrect because 1 occurs twice.
        N=3 one of the possible answers is [-1,0,1]
         */
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter size of list between 1-100 : ");
        int N = scan.nextInt();
        HashSet<Integer> hashSet= new HashSet<>();
        for ( int i =0; i<N-1 ; i++){
         hashSet.add(ThreadLocalRandom.current().nextInt());
        }
        int sum=0;
        for (int w : hashSet){
            sum=sum+w;
        }
        hashSet.add(-sum);
        System.out.println(hashSet);
    }


}
