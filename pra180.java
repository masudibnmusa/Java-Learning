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
            if(b==0){
                throw new MyEx("cant divisible by zero !");
            }
            int result = a/b;
            System.out.println(result);
        }catch(MyEx e){
            System.out.println(e.getMessage());
        }
    }
}
