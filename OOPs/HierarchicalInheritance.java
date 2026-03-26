package OOPs;

class Parent{
    void print(){
        System.out.println("Parent class");
    }
}
class Child1 extends Parent{
    void printA(){

        System.out.println("Child 1");
    }
}
class Child2 extends Parent{
    void printB(){
        System.out.println("Child 2");
    }
}   
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();
        c1.print();
        c1.printA();
        c2.print();
        c2.printB();


    }
}
