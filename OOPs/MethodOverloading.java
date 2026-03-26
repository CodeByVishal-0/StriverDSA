package OOPs;



public class MethodOverloading {
    public static int sum(int a ,int b){
        return a+b;
    }
    public static String sum(String a,String b){
        return a+b;
    }
    public static int sum(int a ,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(sum(1,2,3));
        System.out.println(sum(1,2));
        System.out.println(sum("Vishal","Prajapati"));
    }
}
