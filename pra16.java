import java.util.Scanner;
public class pra16 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the 1st number:");
        int a = sc.nextInt();

        System.out.print("Enter the second number:");
        int b = sc.nextInt();

        double sum = a + b ;
        double diff = a - b ;
        double prod = a*b;
        double qou = a/b;

        System.out.println("The sum of the two number is :"+sum);
        System.out.println("The Difference of the two number is :"+diff);
        System.out.println("The Product of the two number is :"+prod);
        System.out.println("The Qoutient of the two number is :"+qou);
        sc.close();

    }
}
