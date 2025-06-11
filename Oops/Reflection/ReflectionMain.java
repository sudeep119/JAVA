package Oops.Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Ref;

public class ReflectionMain {
    
    public static void main(String[] args) throws IllegalAccessException,ClassNotFoundException,InstantiationException, IllegalArgumentException, InvocationTargetException{
        
        //Class class1=Class.forName("ReflectionDemo");

        ReflectionDemo demo=new ReflectionDemo();
        demo.getClass();

        Class refc=ReflectionDemo.class;
        ReflectionDemo obj=(ReflectionDemo)refc.newInstance();
        obj.Hello();
        Method method=refc.getDeclaredMethods()[0];
        method.invoke(obj);
        System.out.println(refc.getClassLoader());
        System.out.println(refc.getName());
        System.out.println(refc.getConstructors()[0]);
        System.out.println(refc.getFields()[0]);

        
    }
}
