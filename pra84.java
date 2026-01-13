class Rectangle{
    float length;
    float width;

    Rectangle(float length,float width){
        this.length = length;
        this.width = width;
    }

    public void calArea(){
        double area = this.length *this.width;
        System.out.println("The area is: "+area);
    }

    public void calPerimeter(){
        double perimeter = 0.5*this.length * this.width;
        System.out.println("The perimeter is: "+perimeter);
    }
}

public class pra84 {
    public static void main(String[] args){
    
    Rectangle r1 = new Rectangle(12, 12);
    r1.calArea();
    r1.calPerimeter();
    }
}
