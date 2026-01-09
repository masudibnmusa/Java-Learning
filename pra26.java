import java.util.*;
public class pra26 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        if(n==0){
            System.out.println(n+" is zero");
        }else if (n%2==0){
            System.out.println(n+" is positive");
        }else{
            System.out.println(n+" is negative");
        }
    }
}
