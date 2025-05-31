package DSA.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class dsa1 {
    public static void main(String[] args) {
       
        int candidates[]={2,3,6,7};
        int target=7;
        ArrayList<Integer> list=new ArrayList<>();
        Set<ArrayList<Integer>>listt=new HashSet<>();
        uniquePaths(candidates,target,list,listt);

        System.out.println(new ArrayList<>(listt));
        
    }
    public static void uniquePaths(int arr[],int target,ArrayList<Integer> list, Set<ArrayList<Integer>>listt) {
       
        if(target==0){
            List<Integer>nlist=list.stream().sorted().collect(Collectors.toList());
            listt.add(new ArrayList<>(nlist));
            return;
        }
        if(target<0){
            return;
        }

        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
            uniquePaths(arr, target-arr[i],list,listt);
            list.remove(list.size()-1);
        }
    }
}

