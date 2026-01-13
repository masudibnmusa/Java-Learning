class Shape{
    
    String colour ;

}

class Triangle extends Shape{

}
public class pra90 {
    public static void main (String[] args){
        Triangle t1 = new Triangle();
        t1.colour = "Blue";
        System.out.println(t1.colour);
    }
}
