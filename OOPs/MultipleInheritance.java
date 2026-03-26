package OOPs;

interface X {
    void run();
}

interface Y {
    void run();
}

class Z implements X, Y {
    @Override
    public void run() {
        System.out.println("C class run Method");
    }
}

public class MultipleInheritance {
    public static void main(String[] args){
        Z z = new Z();
        z.run();
    }
}