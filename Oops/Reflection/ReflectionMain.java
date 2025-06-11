package Oops.Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Ref;

public class ReflectionMain {
    
    public static void main(String[] args) throws IllegalAccessException,ClassNotFoundException,InstantiationException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, NoSuchFieldException{
        
        //Class class1=Class.forName("ReflectionDemo");

        

        Class refc=ReflectionDemo.class;
        ReflectionDemo obj=(ReflectionDemo)refc.newInstance();
        obj.Hello();
        Method method=refc.getDeclaredMethods()[0];
        method.invoke(obj);
        System.out.println(refc.getClassLoader());
        System.out.println(refc.getName());
        System.out.println(refc.getConstructors()[0]);
        System.out.println(refc.getFields()[0]);

        Method me=refc.getMethod("Hello");
        me.invoke(obj);

        Field field=refc.getField("name");
        field.set(obj, "Sudeep");

        ReflectionDemo demo=new ReflectionDemo();
        demo.getClass();
        System.out.println(obj.name);

    }
}
