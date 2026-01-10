import java.util.Scanner;

public class pra48 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String pass = "masud";
        String given_pass;

        do {
            System.out.println("Enter the pass:");
            given_pass = sc.nextLine();

            if (!given_pass.equals(pass)){
                System.out.println("Wrong pass");
            }
        }while (!given_pass.equals(pass));
        System.out.println("welcome");
        sc.close();
    }
}
