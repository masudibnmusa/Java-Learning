import java.util.InputMismatchException;
import java.util.Scanner;

public class pra181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter the 1st number : ");
            double a = sc.nextInt();
            System.out.print("Enter the 2nd number :");
            double b = sc.nextInt();

            double result = a/b;
            System.out.println(result);

        }catch(ArithmeticException e){
            System.out.println("Error:not divisible by zero");
        }catch(InputMismatchException e){
            System.out.println("Wrong Input!");
        }
    }
}
