package OOPs;

interface Animal{
    void run();
}

class Lion implements Animal{
    public void run(){
        System.out.println("Lion runs.");
    }
}

class Tiger implements Animal{
    public void run(){
        System.out.println("Tiger runs.");
    }
}

public class Interface {
    public static void main(String[] args){
        Animal l1 = new Lion();
        l1.run();

        Tiger t1= new Tiger();
        t1.run();
    }
}
