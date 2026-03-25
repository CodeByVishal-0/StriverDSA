package OOPs;

class A{
    void methodA(){
        System.out.println("Method A");
    }
}
class B extends A{
    void methodB(){
        System.out.println("Method B");
    }
}
class C extends B{
    void methodC(){
        System.out.println("Method C");
    }
}
public class MultiLevelInheritance {
    public static void main(String[] args){
        C obj =new C();

        obj.methodA();
        obj.methodB();
        obj.methodC();
    }
}
