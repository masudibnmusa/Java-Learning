import java.util.Scanner;
public class pra33 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number:");
        float a = sc.nextFloat();

        System.out.print("Enter the second number:");
        float b = sc.nextFloat();
        sc.nextLine();

        System.out.print("Entre operator:");
        String c = sc.nextLine();
        
        switch (c) {
            case "+":
                System.out.println("The sum is :"+(a+b));
                break;
        
            case "-":
                System.out.println("The Subtraction is :"+(a-b));
                break;
            case "*":
                System.out.println("The Multiplication is :"+(a*b));
                break;
            case "/":
                System.out.println("The Division is :"+(a/b));
                break;
            default:
                System.out.println("Something went wrong!");

        }
        sc.close();
    }
}
