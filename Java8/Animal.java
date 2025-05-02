package Java8;

@FunctionalInterface
public interface Animal {
    
    public void run();

   public default void eat(){
        System.out.println("Eating is default");
    }

    public static void bite(){
        System.out.println("Eating is static");
    }
}
