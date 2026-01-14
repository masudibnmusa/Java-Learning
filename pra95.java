class Rectangle{
    int length;
    int width;
    Rectangle(int length,int width){
        this.length = length;
        this.width = width;
    }
    public void calculateArea(){
        int area = length*width;
        System.out.println("Area is : "+area);
    }
    public void calPerimeter(){
        int perimeter = 2*(length+width);
        System.out.println("Perimeter is : "+perimeter);
    }
}
public class pra95 {
    public static void main(String[] args){
        Rectangle r1 = new Rectangle(12,12);
        r1.calPerimeter();
        r1.calculateArea();
    }
}
