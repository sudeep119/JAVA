package Oops.Multithreading;

import java.util.concurrent.Callable;

public class Callthread implements Callable<String>{
    
    @Override
    public String call(){
        return "Hey im callable";
    }
}
