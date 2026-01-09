import java.util.Scanner;

public class pra29 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the year:");
        int a = sc.nextInt();

        if (a%400==0){
            System.out.println("The year is a leap year");
        }else{
            if (a % 4 == 0 && a % 100 != 0){
                System.out.println("The year is leap year");
            }else{
                System.out.println("year is not a leap year");
            }
        }
        sc.close();

    }
}
