import java.util.Scanner;

public class pra61 {
    public static void printName(String name){
        System.out.println("Your name is : "+name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name");
        String name = sc.nextLine();
        printName(name);
    }
}
