import java.util.Scanner;
public class pra22 {
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Age :");
        int age = sc.nextInt();

        if (age>=18){
            System.err.println("You are an adult!");
        }else{
            System.out.println("You are not an adult!");

            sc.close();
        }

    }
}