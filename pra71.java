import java.util.Scanner;

public class pra71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String passwrod = "Masud";
        String given_pass ;
        
        do {
            System.out.print("Enter the password:");
            given_pass = sc.nextLine();

            if(!given_pass.equals(passwrod)){
                System.out.println("Password not matched");
            }else{
                System.out.println("welcome");
            }
        }while(!given_pass.equals(passwrod));
    }
}
