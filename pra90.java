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
class Circle extends Shape{

    public void area(int a, int b){
        System.out.println(0.5*a*b);
    }
}
public class pra90 {
    public static void main (String[] args){
        Triangle t1 = new Triangle();
        t1.area(100, 50);
        EqualTriangle t2 = new EqualTriangle();
        t2.area(2, 3);
        Circle c1 = new Circle();
        c1.area(23, 12);
    }
}
