import java.util.Scanner;

public class pra73 {
    public static double calPower(double x,int n){
        double result = 1;

        for (int i = 1; i<=n; i++){
            result = result *n;
        }
        System.out.println("The solution id : "+result);
        return 1;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of x:");
        int x = sc.nextInt();
        
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        

        double result = calPower(x,n);

        sc.close();

    }
}
