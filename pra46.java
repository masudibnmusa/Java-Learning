import java.util.Scanner;

public class pra46 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) { 
            boolean isPrime = true;

            if (i <= 1) {
                isPrime = false;
            } else {
                for (int j = 2; j * j <= i; j++) { 
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            System.out.println(i + ": " + (isPrime ? "Prime" : "Not prime"));
        }

        sc.close();
    }
}
