import java.util.Scanner;

public class pra64 {
    public static void calaculatefactorial(int n) {
        
        int fact = 1;

        for (int i = 1; i<=n; i++){
            fact=fact*i;
        }
        System.out.println("factorial is:"+fact);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();

        calaculatefactorial(n);

    }
}
