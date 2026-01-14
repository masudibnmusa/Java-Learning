import java.util.Scanner;

public class pra92 {

    public static void main(String[] args) {
        String name = "Masud Ibn Musa";
        String id = "242-35-171";
        String school = "Katiadi govt. high school";
        int num = 10;
        System.out.printf(name);
        System.out.println(id);
        System.out.println(school);
        System.out.println(num);

        Scanner sc = new Scanner(System.in);

        System.out.println("what ? ");
        String a = sc.nextLine();

        String b = "Pronob is gay";

        String c = "who is pronob";

        if (c.equals(a)){
            System.out.println("Reply = "+b);
        }else{
            System.out.println("Reply = idont know");
        }
    }
}