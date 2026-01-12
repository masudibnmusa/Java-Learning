import java.util.Scanner;
public class pra74 {
    public static int findGdc(int a ,int b){
        int gdc = 1;
        int min = Math.min(a, b);

        for (int i = 1; i<=min; i++){
            if (a%i==0 && b%i==0){
                gdc = i;
            }
        }
        return gdc;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enetr the 1st number:");
        int a = sc.nextInt();
        System.out.print("Enter the 2nd number:");
        int b = sc.nextInt();

        int gdc = findGdc(a, b);

        System.out.println("The greatest Divisor is :"+gdc);

        sc.close();
    }
}
