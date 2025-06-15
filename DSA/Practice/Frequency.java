package DSA.Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Frequency {
    public static void main(String[] args) throws IOException{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int N=Integer.parseInt(br.readLine());

        String str[]=br.readLine().split(" ");

        int arr[]=new int[str.length];

        for(int i=0;i<str.length;i++){
            arr[i]=Integer.parseInt(str[i]);
        }

        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        System.out.println(map);

    }
}
