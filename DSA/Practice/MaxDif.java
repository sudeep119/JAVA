package DSA.Practice;

import java.util.Arrays;

public class MaxDif {
    
    public static void main(String[] args) {
        int arr[]={-5,-10,-5};
        System.out.println(maxAdjacentDistance(arr));

    }

     public static int maxAdjacentDistance(int[] arr) {
        Arrays.sort(arr);
        if(arr[arr.length-1]<0)
        return Math.abs(arr[0]-arr[1]);
        else
        return Math.abs(arr[0]-arr[arr.length-1]);
    }
}
