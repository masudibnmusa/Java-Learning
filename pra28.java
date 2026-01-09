import java.util.Scanner;

public class pra28 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("input marks:");
        int marks = sc.nextInt();

        if (marks>=80){
            System.out.println("A");
        }else if (marks>=60){
            System.out.println("B");
        }else if(marks>=40){
            System.out.println("C");
        }else if (marks<40){
            System.out.println("Fail");
        }else if (marks>100){
            System.out.println("invalid marks!");
        }
    }
}
