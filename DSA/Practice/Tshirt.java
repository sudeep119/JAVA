package DSA.Practice;

public class Tshirt {
    
    String brand;
    int size;
    String color;

    @Override
    public boolean equals(Object obj){
        if(obj==null){
            System.out.println("Give proper tshirt");
            return false;
        }
        if(obj!=null){

            Tshirt tshirt1=this;
            Tshirt tshirt2=(Tshirt)obj;

            if(tshirt1.brand.equals(tshirt2.brand)&&tshirt1.color.equals(tshirt2.color)&&tshirt1.size==tshirt2.size){
                System.out.println("Both tshirts are same");
                return true;
            }

        }
        System.out.println("Both tshirts are different");
        return false;
    }
    public static void main(String[] args) {
        
        Tshirt tshirt1=new Tshirt();
        tshirt1.brand="Gucci";
        tshirt1.color="red";
        tshirt1.size=32;

        Tshirt tshirt2=new Tshirt();
        tshirt2.brand="Gucci";
        tshirt2.color="red";
        tshirt2.size=32;

        System.out.println(tshirt1.equals(tshirt2));
    }

    
}