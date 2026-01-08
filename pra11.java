import java.util.*;
public class pra11 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length:");
        int a = sc.nextInt();

        System.out.print("Enter Width:");
        int b = sc.nextInt();

        double area = a*b;

        double perimeter = 2*(a+b);

        System.out.println("Area is"+area);
        System.out.println("Perimeter is"+perimeter);

    }
}