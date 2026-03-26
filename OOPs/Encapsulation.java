package OOPs;
// Polymorphism  -->  Binding data items.
class Students{
    private String name;
    private int age;
    private int roll_no;
    void setter(String name,int age,int roll_no){
        this.name=name;
        this.age=age;
        this.roll_no=roll_no;
    }
    void getter(){
        System.out.println(name);
        System.out.print(age);
        System.out.println(roll_no);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Students s1= new Students();
        s1.setter("Vishal", 23, 143);   
        s1.getter();
    }
}
