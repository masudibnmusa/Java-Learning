class pen{
    String colour;
    String type;

    public void write(){
        System.out.println("writting something!");
    }
    public void printColoour(){
        System.out.println(this.colour);
    }
    public void printType(){
        System.out.println(this.type);
    }
}
public class pra77 {
    public static void main(String[] args) {
        pen pen1 = new pen();
        pen1.colour = "blue";
        pen1.type = "Marker";

        pen1.write();
        System.out.println(pen1.type);
        System.out.println(pen1.colour);
        pen1.printColoour();

        System.err.println("--------------");
        pen pen2 = new pen();
        pen2.colour = "Black";
        pen2.type = "Ball pen";
        pen2.printColoour();
        pen2.printType();

    }
    
}
