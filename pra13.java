import java.util.Scanner;
public class pra13 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side of a square:");
        int a = sc.nextInt();
        
        double area = a*a;
        double perimeter = 4 * a;

        System.out.println("The area of the square is:"+area);
        System.out.println("The perimeter of the square is:"+perimeter);
    }
}
