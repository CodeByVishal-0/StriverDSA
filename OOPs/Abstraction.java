package OOPs;
// Abstraction is the process of hiding certain details and showing only essential information to the user;
abstract class Cars{
    abstract public void print();
    public void color(){
        System.out.println("red");
    }
}
class Tata extends Cars{
    public void print(){
        System.out.println("print");
    }
}
public class Abstraction{
    
    public static void main(String[]args){
        Tata c1 = new Tata();
        c1.print();
        c1.color(); 
    }
}
