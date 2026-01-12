import java.util.Scanner;

public class pra65 {
    public static int calFact(int n){
        if (n<0){
            System.out.println("invalid number");
            return -1;
        }
        
        int fact = 1;
        for (int i = 1; i<=n; i++){
            fact = fact*i;
        }
        return fact;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in );
        
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();

        int fact = calFact(n);
        

        System.out.println("The factorial is : "+fact);
        sc.close();

    }
}
