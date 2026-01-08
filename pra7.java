import java.util.Scanner;
public class pra7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:");
        String Name = sc.nextLine();
        System.out.print("Enter your age:");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your Adress:");
        String address = sc.nextLine();
        System.out.println(Name);
        System.out.println(age);
        System.out.println(address);
         
    }
}
