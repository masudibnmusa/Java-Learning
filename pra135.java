abstract class Vehicle{
    protected int no;
    protected String name;
    protected String phone;
    Vehicle(int no,String name,String phone){
        setNo(no);
        this.name = name;
        this.phone = phone;
    }
    void setNo(int no){
        if(no <=0){
            throw new IllegalArgumentException("Vehicle number cant be negative");
        }
        this.no = no;
    }
    abstract void displayVehicle();
}
public class pra135 {
    public static void main(String[] args){
        //main
    }
}
