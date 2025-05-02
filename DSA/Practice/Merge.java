package DSA.Practice;

import java.util.Arrays;

public class Merge {
    
    public static void main(String args[]){
        int arr[]={3,5,2,1,9,7};
        arr=merge(arr);
        for(int num:arr){
            System.out.print(num+" ");
        }
        
        
    }
    public static int[] merge(int arr[]){

        if(arr.length==1)
        return arr;

    int mid=arr.length/2;
    int first[]=merge(Arrays.copyOfRange(arr, 0, mid));
    int last[]=merge(Arrays.copyOfRange(arr,mid,arr.length));
       
    return mix(first,last);
   

}
public static int[] mix(int[] first, int[] last) {
    int mix[]=new int[first.length+last.length];

    int i=0;
    int j=0;
    int k=0;
    while(i<first.length&& j<last.length){
    if(first[i]<last[j]){
        mix[k]=first[i];
        i++;
        k++;
    }else{
        mix[k]=last[j];
        j++;
        k++;
    }
    
}

    while(i<first.length){
        mix[k]=first[i];
        i++;
        k++;
    }
    while(j<last.length){
        mix[k]=last[j];
        j++;
        k++;
    }
    
    return mix;
}

}
   

