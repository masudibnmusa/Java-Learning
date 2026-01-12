import java.util.Scanner;

public class pra66 {
    public static int calAvg(int a,int b,int c){
        int avg = (a+b+c)/3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number:");
        int a = sc.nextInt();
        System.out.print("Enter 2st number:");
        int b = sc.nextInt();
        System.out.print("Enter 3st number:");
        int c = sc.nextInt();

        int avg = calAvg(a,b,c);
        System.out.println("The average of the three number is:"+avg);

        sc.close();
    }
}
