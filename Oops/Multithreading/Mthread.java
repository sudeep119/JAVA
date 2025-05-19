package Oops.Multithreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Mthread {
    
    public static void main(String[] args) {
        Thread thread1=new Thread(()->System.out.println("Hello"));
        thread1.start();

        Thread1 t1=new Thread1();
        Thread1 t2=new Thread1();
        t1.start();
        t2.start();

        Callthread tc1=new Callthread();
        ExecutorService service=Executors.newFixedThreadPool(2);
        Future<String> str=service.submit(()->"Hello world");

        try{
            System.out.println(str.get());
        }catch(Exception e){
            throw new ClassCastException();
        }
        System.out.println(tc1);
    }
}
