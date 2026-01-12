import java.util.Scanner;
public class pra69 {
    public static double circumference(int r){
        double circumference = 2 * Math.PI * r;
        return circumference; 
    } 
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the  value of r");
        int r = sc.nextInt();

        double circumference = circumference(r);
        System.out.println("The circumference is : "+circumference);

        sc.close();
    }
}
