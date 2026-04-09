class IDoNotLikeZeroException extends Exception {
}

public class pra173 {

    static int devide(int x, int y) throws IDoNotLikeZeroException {
        if (y == 0)
            throw new IDoNotLikeZeroException();
        return x / y;
    }

    public static void main(String[] args) {
        int x = 100;
        int y = 0;
        int z;

        try {
            z = devide(x, y);
            System.out.println("executing here");
        } catch (IDoNotLikeZeroException e) {
            System.out.println("Cannot divide by zero!");
        }

        try {
            int something = devide(500, y);
        } catch (IDoNotLikeZeroException e) {
            System.out.println("Again division by zero!");
        }

        System.out.println("program is still running");
    }
}