import java.util.Scanner;

public class pra18 {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the distance traveled in km:");
        float a = sc.nextFloat();

        System.out.print("Enter the time in hr:12");
        float b = sc.nextFloat();

        float speed = a/b;

        System.out.println("The speed is:"+speed);

        sc.close();
    }
}
