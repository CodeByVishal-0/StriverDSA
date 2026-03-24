package OOPs;
class Student{

    String name;
    int roll_no;
    Student(String name,int roll_no){
        this.name=name;
        this.roll_no=roll_no;
        System.out.println("Student created Succesfully");
    }
    Student(){
        System.out.println("Default Constructor");
    }
}
public class Constructor {
    public static void main(String[] args){
        Student s1 =  new Student("vishal", 143);
        System.out.println(s1.name);
        System.out.println(s1.roll_no);
        Student s2 =  new Student();
    }
}
