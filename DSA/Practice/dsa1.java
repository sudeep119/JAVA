package DSA.Practice;

import java.util.Arrays;

public class dsa1 {
    public static void main(String[] args) {
        int n=30;
        uniquePaths(n);
       
    }
    public static void uniquePaths(int n) {
       
            for(int i=2;i<Integer.MAX_VALUE;i++){
                if(n==0)
                break;
                if(isPrime(i)){
                    System.out.println(i);
                    n--;
                }
            }
    }

    public static boolean isPrime(int n) {
       
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}

