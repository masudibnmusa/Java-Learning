import java.util.Scanner;

public class pra62 {
    static int calculateSum(int a ,int b){
        int sum = a + b;
        return sum;
    }
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st number:");
        int a = sc.nextInt();
        System.out.print("Enter the 2st number:");
        int b = sc.nextInt();

        int sum = calculateSum(a, b);
        System.out.println("sum is : "+sum);
    }
}
