import java.util.Scanner;
public class pra35 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("-----Price Chart-----");
        System.out.println("1.Banana");
        System.out.println("2.Mango");
        System.out.println("3.Jackfruite");
        System.out.println("4.Papaya");
        System.out.println("5.Lichi");
        System.out.println("Chose an option:");

        String ch = sc.nextLine();

        switch (ch) {
            case "1":
                System.out.println("Price of the banana is 20 taka");
                break;
            case "2":
                System.out.println("Price of the mango is 30 taka");
                break;
            case "3":
                System.out.println("Price of the jackfruite is 20 taka");
                break;
            case "4":
                System.out.println("Price of the papaya is 20 taka");
                break;
            case "5":
                System.out.println("Price of the lichi is 20 taka");
                break;
            default:
                System.out.println("wrong Input");
        }
        sc.close();

    }
}
