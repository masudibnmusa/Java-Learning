import java.util.Scanner;
class MyException  extends Exception{
    public MyException(String message){
        super(message);
    }
}

public class pra175 {
    public static void main(String[] args) {
        System.out.print("Enter your age :");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.nextLine();
        if (age <18){
            try{
                throw new MyException("Not possible");
            }catch (MyException e){
                System.out.println("Exception: "+e.getMessage());
            }
        }else{
            System.out.println("THe age is :"+age);
        }
        sc.close();
    }
}
