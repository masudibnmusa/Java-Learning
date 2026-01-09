import java.util.Scanner;

public class pra27 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number:");
        int a = sc.nextInt();
        System.out.print("Enter 2st number:");
        int b = sc.nextInt();

        if (a>b){
            System.out.println(a+" is greater then "+b);
        }else if (a==b){
            System.out.println(a+" and "+b+" is equal");
        }else{
            System.out.println(b+" is greater than "+a);
        }
    }
}
