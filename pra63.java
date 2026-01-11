import java.util.Scanner;

public class pra63 {
    public static int multi(int a ,int b){
        int multi  = a*b;
        return multi;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the 1st number:");
        int a = sc.nextInt();
        System.out.print("Enter the 1st number:");
        int b = sc.nextInt();

        int sum = multi(a, b);
        System.out.println("The product is:"+sum);
    }
}
