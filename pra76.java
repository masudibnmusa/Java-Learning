class pen{
    String colour;
    String type;

    public void write(){
        System.out.println("writting something!");
    }
}
public class pra76 {
    public static void main(String[] args) {
        pen pen1 = new pen();
        pen1.colour = "blue";
        pen1.type = "Marker";

        pen1.write();
        System.out.println(pen1.type);
        System.out.println(pen1.colour);
    }
    
}
