package DSA.Practice;

public class RevString {
    
    public static void main(String[] args) {
        
        String name="I love java programming";
        String ans="";

        String arr[]=name.split(" ");

        for(int i=arr.length-1;i>=0;i--){
            ans=ans+arr[i]+" ";
        }

        System.out.println(ans);
    }
}
