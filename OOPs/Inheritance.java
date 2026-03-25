package OOPs;

// Example 1................
class ParentClass {
    void display(){
        System.out.println("Parent class Method. ");
    }
}

class ChildClass extends ParentClass{
    void show(){
        System.out.println("Child class Method.");
    }
}


// Example 2..........

// Parent class
class Vehicle{
    double price;
    double mileage;
    String color;
    
    void display(){
        System.out.println(price);
        System.out.println(mileage);
        System.out.println(color);
    }
}
// child class
class Car extends Vehicle{
    String ftype;
    boolean sunroof;
    String brand;
    void show(){
        System.out.println(color);
        System.out.println(sunroof);
        System.out.println(brand);
    }
}

public class Inheritance {
    public static void main(String[] args){
        //Example 1
        ChildClass child1= new ChildClass();
        child1.display();
        child1.show();

        // Example 2
        Car car = new Car();
        car.brand="BMW";
        car.sunroof=true;
        car.mileage=20;
        car.price=700000;
        car.color="Black";
        car.ftype="Diesel";

        car.display();
        car.show();
    }
}
