package OOPs;

class Employee {
    void salary() {
        System.out.println("Salary= 800000");
    }
}

class HR extends Employee {
    void bonus() {
        System.out.println("Bonus=9000");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        HR obj = new HR();
        obj.salary();
        obj.bonus();
        
    }
}
