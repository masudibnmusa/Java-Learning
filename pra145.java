class Calculator{
    void add(int a ,int b){
        System.out.println("Summation of a and b is : "+(a+b));
    }
    void add(int a,int b,int c){
        System.out.println("Sum of three number is : "+(a+b+c));
    }
    void add(double a,double b){
        System.out.println("Sum of the two number is : "+(a+b));
    }
}
public class pra145 {
    public static void main(String[] args){
        Calculator c1 = new Calculator();
        c1.add(2.5, 2.5);
        c1.add(2,3);
        c1.add(2,3,4);
    }
}
