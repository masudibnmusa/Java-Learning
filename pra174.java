import java.util.Scanner;

public class pra174 {
    public static void main(String[] args) {
        System.out.println("New environment installed successfully");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name :");
        String name = sc.nextLine();
        System.err.println("Welcome"+name);
    }
}
