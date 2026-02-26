import java.util.Scanner;
public class pra151 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];

        System.out.println("Enter the 5 number : ");

        for(int i = 0;i<a.length;i++){
            a[i] = sc.nextInt();
        }

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
