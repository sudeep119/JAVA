package DSA.Practice;

public class LongestWord {
    
    public static void main(String[] args) {
        
        String str="i love java programming";
        String longest[]=str.split(" ");

        String ans="";

        for(String s:longest){
            ans=s.length()>ans.length()?s:"";
        }

        System.out.println(ans);
    }
}
