import java.util.Scanner;

public class  prar72{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int positive = 0;
        int negative = 0;
        int zero = 0;

        System.out.print("Enter a number: ");
        String num = sc.nextLine();

        // check for negative sign
        if (num.charAt(0) == '-') {
            negative++;
            num = num.substring(1); // remove the minus for positive check
        }

        // check if the number (after minus) is zero
        if (num.equals("0")) {
            zero++;
        } else {
            positive++;
        }

        System.out.println("Positive count: " + positive);
        System.out.println("Negative count: " + negative);
        System.out.println("Zero count: " + zero);

        sc.close();
    }
}
