import java.util.Scanner;
public class pra23 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check:");
        int x = sc.nextInt();

        if (x%2==0){
            System.out.println("The number "+x+" is Even");
        }else{
            System.out.println("The number "+x+" is Odd");
        }
        sc.close();

    }
}
