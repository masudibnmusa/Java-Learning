import java.util.Scanner;

public class pra68 {
    public static int great(int a,int b){
        if (a > b){
            System.out.println("Greater is: "+a);
        }else{
            System.out.println("Greater is: "+b);
        }
        return 1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st number:");
        int a = sc.nextInt();
        System.out.print("Enetr the 2nd number:");
        int b = sc.nextInt();

        int greater = great(a, b);
        
    }
}
