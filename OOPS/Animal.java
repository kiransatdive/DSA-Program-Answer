public static void main(String[] args) {
        Fish shark=new Fish();
        shark.eat();
          }   
  
 }
 //base class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");

    }
    void breath(){
        System.out.println("breaths");
    }
}

//Derived classs

class Fish extends Animal{
    it fins;

    void swim(){
        System.out.println("swim in water");
    }
}