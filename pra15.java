import java.util.Scanner;
public class pra15 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of Sphere:");
        float r = sc.nextFloat();

        double vol = (4/3)*Math.PI*r*r*r;
        double area = 4*Math.PI*r*r;

        System.out.println("The Volume of the Sphere is:"+vol);
        System.out.println("The Area of the Sphere is:"+area);
    }
}
