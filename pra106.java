class Shape{
    public void calculateArea(){
        System.out.println("The area is : ");
    }
}
class Rectangle extends Shape{
    double length;
    double width;

    Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }
    public void calculateArea(){
        double Area = length*width;
        System.out.println("The area is : "+Area);
    }
}
class Circle extends Shape{
    double redius;
    Circle(double redius){
        this.redius = redius;
    }
     public void calculateArea(){
        double Area = Math.PI * (redius*redius);
        System.out.println("The area is : "+Area);
    }
}
public class pra106 {
    public static void main(String[] args){
        //main.......
        Shape s1 = new Rectangle(12,12);
        Shape s2 = new Circle(12);
        s1.calculateArea();
        s2.calculateArea();
    }
}
