  public class Abstraction{
    public static void main(String[] args) {
        Horse h=new Horse();
        h.walk();
        h.eat();

        Chicken c=new Chicken();
        c.walk();
        c.eat();

   
        
    }
}

abstract class Animal{
    void eat(){
        System.out.println("animal eats");

    }
       abstract void walk();
}

class Horse extends Animal{
    void walk(){
        System.out.println("walks on 4 llages");

    }
}

class Chicken extends Animal{
    void walk(){
        System.out.println("walks on 2 lages");
    }
}