class statickeyword{

    public static void main(String[] args) {
        Horse h=new Horse();
    
        
    }
}
class Animal{
    Animal(){
        System.out.println("animal costructor is called");
    }

}

class Horse extends Animal{
    Horse(){
        super();
        System.out.println("horse constructer is called");
    }
}