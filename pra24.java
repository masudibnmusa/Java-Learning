import java.util.Scanner;
public class pra24 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the 1st number:");
        int a = sc.nextInt();

        System.out.print("Enter the 2nd number:");
        int b = sc.nextInt();

        if (a==b){
            System.out.println("Equal");
        }else{
            if (a>b){
                System.out.println("Greater");
            }else{
                System.out.println("Smaller");
            }
        }
    }
}
