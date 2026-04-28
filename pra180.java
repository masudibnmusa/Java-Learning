class MyEx extends Exception{
    public MyEx(String message){
        super(message);
    }
}
public class pra180 {
    public static void main(String[] args){
        //main
        try{int a = 5;
            int b = 0;
            int result = a/b;
            System.out.println(result);
        }catch(ArithmeticException e){
            System.out.println("cant devide!");
        }
    }
}
