import java.util.Scanner;

public class pra138 {
    public static void main(String[] args) {
        //main
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number");
        int a = sc.nextInt();

        System.out.print("Enetr the 2nd number");
        int b = sc.nextInt();

        int result = a +b;
        System.out.println("The result is : "+result);

        int anotherresult = a-b;
        System.out.println("Another result is : "+anotherresult);
    }
}
