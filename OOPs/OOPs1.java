package OOPs;
public class OOPs1 {

    // Attributes
    String name;
    int roll_no;
    // final --> values cannot be assigned by objects and it's value remains same for all the instances of the class; 
    final String college="GCET";

    // method
    public void printData(){
        System.out.println(name);
        System.out.println(roll_no);
        System.out.println(college);
    }
    public static void main(String[] args){
        OOPs1 obj1= new OOPs1();
        obj1.name="vishal";
        obj1.roll_no=143;
        // obj1.college="IIT";  can't assign
        obj1.printData();

    }
}
