import java.util.Scanner;

class MyEx extends Exception{
    public MyEx(String message){
        super(message);
    }
}
public class pra180 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter the first number:");
            int a = sc.nextInt();
            System.out.println("Enter the second number:");
            int b = sc.nextInt();
            if(b==0){
                throw new MyEx("Cant do that");
            }
            int result = a/b;
            System.out.println("Result : "+result);
        }catch(MyEx e){
            System.out.println(e.getMessage());
        }
    }
}
