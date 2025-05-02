package Java8;

public class AnimalRunner {
    
    public static void main(String[] args) {
        Animal animal=new Dog();
        animal.run(); //Normal way of calling
        animal.eat(); //default method

        Animal animal2=()->System.out.println("This is lambda"); //Calling method through lambda expression
        animal2.run();
    }
}
