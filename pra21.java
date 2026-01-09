import java.util.Scanner;
public class pra21 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length:");
        float l = sc.nextFloat();

        System.out.print("width:");
        float w = sc.nextFloat();

        System.out.print("height:");
        float h = sc.nextFloat();

        double vol = l*h*w;
        double tsa = 2*((l*w)+(w*h)+(h*l));

        System.out.println("The volume id :"+vol);
        System.out.println("Total Surface Area is is :"+tsa);

    }
}
