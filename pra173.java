
class IDoNotLikeZeroException extends Exception{
 
}
 
 
public class pra173 {
 
    static int devide (int x, int y) throws IDoNotLikeZeroException{
        if ( y == 0)
            throw new IDoNotLikeZeroException();
        return x/y;
    }
 
    public static void main(String[] args) {
        int x  = 100;
        int y = 0;
        int z;
        try {
            z = devide(x,y);
            System.out.println("executing here");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception occured!");
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
 
 
        int something = devide(500, y);
        System.out.println("program is still running");
    }
}