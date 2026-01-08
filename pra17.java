import java.util.Scanner;
public class pra17 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Temperature in Celcius:");
        float c = sc.nextInt();

        double f = (9.0/5.0)*c+32;
        double k = c+273.15;
        
        System.out.println("The temperature in fahrenheit is :"+f);
        System.out.println("The temperature in kelvin is :"+k);

        sc.close();
    }
}
