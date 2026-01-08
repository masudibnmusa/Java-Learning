import java.util.Scanner;
public class pra9 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of r:");
        float r = sc.nextFloat();
        sc.nextLine();

        double area = 3.1416 *r*r;
        double cir = 2 * 3.1316 * r;

        System.out.println("The Area is :"+area);
        System.out.println("The Circumference is :"+cir);

    }
}
