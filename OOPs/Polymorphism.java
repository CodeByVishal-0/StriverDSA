package OOPs;
// method overloading and method overriding is called Polymorphism

// Types of Polymorphism 1.Runtime Polymorphism 2. Compile time poplymorphism
// 1. Runtime Polymorphism --> Method Overriding (dynamic binding or late binding)
// 2. COmpile Time Polymorphism --> Method Overloading (static binding or early binding)

class OverloadingDemo{
    void sum(int a,int b){
        System.out.println(a+b);
    }
    void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }
    void sum(double a,double b){
        System.out.println(a+b);
    }
}

// Override Example
class Mummy{
    void work(){
        System.out.println("ghar ka kaam");
    }
}
class Child extends Mummy{
    @Override
    void work(){
        System.out.println("mummy khana bana do.");
    }
}
class Husband extends Mummy{
    @Override
    void work(){
        System.out.println("Chai banado");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        OverloadingDemo d1= new OverloadingDemo();
        d1.sum(1, 2.5); 
        d1.sum(1, 2); 
        d1.sum(1, 2,5); 

        Child child = new Child();
        child.work();

        Husband husband = new Husband();
        husband.work();
    }
}
