import java.util.Scanner;

public class pra70 {
    public static int eligible(int age){
        if (age >=18){
            System.out.println("The person is eligible");
        }else{
            System.out.println("The person is not eligible");
        }
        return 1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ente the age:");
        int age = sc.nextInt();

        int eligible = eligible(age);

        sc.close();
    }
}
