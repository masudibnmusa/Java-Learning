import java.util.Scanner;

public class pra12 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Base:");
        int a = sc.nextInt();

        System.out.print("Enter Height:");
        int b = sc.nextInt();

        double area = 0.5 * a * b;
        
        System.out.println("The Area of a Triangle is:"+area);

    }
}
