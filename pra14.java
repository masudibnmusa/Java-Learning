import java.util.*;
public class pra14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base of a cylinder:");
        float r = sc.nextFloat();

        System.err.print("Enter the height of a cylinder:");
        float h = sc.nextFloat();

        double vol = 3.14 *r*r*h;
        double tsa = (2*3.14*r*h)+(2*3.14*r*r);
        double lsa = (2*3.14*r*h);

        System.out.println("The Volume of the cylinder is :"+vol);
        System.out.println("The Total Surface Area is :"+tsa);
        System.out.println("The Lateral Surface Area is :"+lsa);

        sc.close();
    }
}
