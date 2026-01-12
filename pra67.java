import java.util.Scanner;

public class pra67 {
    public static int sumofOdd(int n){
        int sum=0;

        for (int i = 1; i<=n; i++){
            if (i%2!=0){
                sum = sum+i;
            }
        }
        return sum ;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the range:");
        int n =sc.nextInt();

        int sumofOdd = sumofOdd(n);

        System.out.println("The sum of odd numbers is :"+ sumofOdd);

        sc.close();
    }
}
