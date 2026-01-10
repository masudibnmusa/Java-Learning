import java.util.Scanner;

public class pra50 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number:");
        int n = sc.nextInt();

        int i = 1 ;
        int  sum = 0;
        while (i<=n) {
            sum = sum +i;
            i++;
            
        }
        System.out.println(sum);
        sc.close();
    }
}
