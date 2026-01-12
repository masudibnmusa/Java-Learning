import java.util.Scanner;

public class pra75 {
    public static int fibonacci(int n){
        int a = 0;
        int b = 1;

        for (int i = 1; i<=n; i++){
            System.out.print(a+" ");
            int next = a + b;
            a = b;
            b = next;
        }
        return 1;
    }
    public static void main(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the num:");
        int n = sc.nextInt();

        int fibo = fibonacci(n);

        sc.close();

    }
}
