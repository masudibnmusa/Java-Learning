class MyEx extends Exception{
    public MyEx(String message){
        super(message);
    }
}
public class pra180 {
    public static void main(String[] args)throws MyEx{
        //main
        int a = 5;
        int b = 0;
        if(b==0){
            throw new MyEx("cant divisible by zero !");
        }else{
            int result = a/b;
            System.out.println(result);
        }
    }
}
