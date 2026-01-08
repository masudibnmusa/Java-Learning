import java.util.Scanner;
public class pra8 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value of r:");
        float r = sc.nextFloat();
        sc.nextLine();

        double area = 3.11416 * r * r;

        System.out.println("The area of the circle is :"+area);
        sc.close();
    }
}
