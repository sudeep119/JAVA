package Oops.FileHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class BReader {
    
    public static void main(String[] args) throws IOException{
        
        InputStreamReader ir=new InputStreamReader(System.in);

        BufferedReader reader=new BufferedReader(ir);
        
        int T=Integer.parseInt(reader.readLine());
        System.out.println("T is "+T);
        for(int i=0;i<T;i++){
            int N=Integer.parseInt(reader.readLine());
            System.out.println("Array size is "+N);
            String arr[]=reader.readLine().split(" ");
            int sum=0;
            for(String s:arr){
                sum+=Integer.parseInt(s);
            }
            System.out.println("The " + (i + 1) + "th case output sum is " + sum);
        }
    }
}
