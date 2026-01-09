import java.util.Scanner;

public class pra30 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the age:");
        int age = sc.nextInt();

        if (age >=18){
            System.out.println("The person is eligible for vote");
        }else{
            System.out.println("not eligible");
        }
        sc.close();
    }
}
