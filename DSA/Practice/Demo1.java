package DSA.Practice;

public class Demo1 extends Tshirt {
   
    @Override
    public boolean equals(Object obj){
        System.out.println("Yes");
        return true;
    }
    public static boolean chech(){
        String s1="Hello";
        String d2="Bii";
        Tshirt demo=new Demo1();
        return demo.equals(demo);
    }
    public static void main(String[] args) {
          
          String d2="Bii";
            System.out.println(Demo1.chech());
        }
    }
