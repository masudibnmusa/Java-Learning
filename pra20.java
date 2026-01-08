import java.util.Scanner;
public class pra20 {
    public static void main(String[] ags){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principle:");
        float p = sc.nextFloat();

        System.out.print("Enter rate:");
        float r = sc.nextFloat();

        System.out.print("Enter time:");
        float t = sc.nextFloat();

        double si = (p*r*t)/100;
        double amt = p+si;

        System.out.println("Simple interest is :"+si);
        System.out.println("Total Amount is:"+amt);

        sc.close();

    }
}
