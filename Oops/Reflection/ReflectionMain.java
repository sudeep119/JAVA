package Oops.Reflection;

import java.sql.Ref;

public class ReflectionMain {
    
    public static void main(String[] args) {
        
        //Class class1=Class.forName("ReflectionDemo");

        ReflectionDemo demo=new ReflectionDemo();
        demo.getClass();

        Class refc=ReflectionDemo.class;
        System.out.println(refc.getClassLoader());
        System.out.println(refc.getName());
        System.out.println(refc.getConstructors()[0]);
        
    }
}
