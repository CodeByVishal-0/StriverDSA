package OOPs;
class Bank{
    void rateOfInterest(){
        System.out.println("Generally Rate of Interest = 9% ");
    }
}
class SBI extends Bank{
    @Override
    public void rateOfInterest(){
        System.out.println("SBI Rate of Interest = 10% ");
    }
}
class UBI extends Bank{
    @Override
    public void rateOfInterest(){
        System.out.println("UBI Rate of Interest = 8% ");
    }
}
class HDFC extends Bank{
}
public class MethodOverriding {
    public static void main(String[] args) {
        SBI sbi1 = new SBI();
        sbi1.rateOfInterest();

        UBI u1= new UBI();
        u1.rateOfInterest();

        HDFC h1= new HDFC();
        h1.rateOfInterest();
    }
}
