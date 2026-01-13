class Shape{
    
    public void area(){
        System.out.println("Display Area");
    }

}

class Triangle extends Shape{
    public void area(float l,float w){
        System.out.println(0.5*l*w);
    }
}
class EqualTriangle extends Triangle{
    public void area(int l ,int h){
        System.out.println(0.5*h*l);
    }
}
public class pra90 {
    public static void main (String[] args){
        Triangle t1 = new Triangle();
        t1.area(100, 50);
        EqualTriangle t2 = new EqualTriangle();
        t2.area(2, 3);
    }
}
