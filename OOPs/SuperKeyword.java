package OOPs;

class Animals {
    String color="white";
    void eat(){
        System.out.println("eating......");
    }
}
class a1 extends Animals{
    String color="red";
    void eat(){
        System.out.println("eats......");
    }
    a1(){
        System.out.println("a1 is created");
    }
}
class Dog extends a1{
    String color="black";
    // super for variable
    void printColor(){
        System.out.println(color);
        System.out.println(super.color);
    }
    //super for methods
    void eat(){
        System.out.println("eats grass");
    }
    void work(){
        super.eat();
        eat();
    }

    // super for constructor
    Dog(){
        super();
        System.out.println("Dog is created");
    }
}

public class SuperKeyword {
    public static void main(String[ ]args){
        Dog d1 = new Dog();
        d1.work();
        d1.printColor();
    }
}
