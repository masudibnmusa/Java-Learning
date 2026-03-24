import java.util.Scanner;

public class pra166 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();
        System.out.println("Enter the second number : ");
        int b = sc.nextInt();

        int sum = a + b;
        int sub = a - b;
        int multi = a*b;
        int div = a/b;
        System.out.println("Sum is : "+sum);
        System.out.println("Sub is : "+sub);
        System.out.println("Multi is : "+multi);
        System.out.println("Div is : "+div);
        System.out.println("that all my codding can do !");
    }
}
