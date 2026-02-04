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
class Car extends Vehicle{
    private String type = "Car";
    Car(int no,String name,String phone){
        super(no, name, phone);
    }
    @Override
    void displayVehicle(){
        System.out.println("Vehicle Number is : "+no);
        System.out.println("Ower Name  is : "+name);
        System.out.println("Ower's Phone number is : "+phone);
        System.out.println("Vehicle Type is : "+type );
    }
}
class Bike extends Vehicle{
    private String type = "Bike";
    Bike(int no,String name,String phone){
        super(no, name, phone);
    }
    @Override
    void displayVehicle(){
        System.out.println("Vehicle Number is : "+no);
        System.out.println("Ower Name  is : "+name);
        System.out.println("Ower's Phone number is : "+phone);
        System.out.println("Vehicle Type is : "+type );
    }
}
class Truck extends Vehicle{}  
public class pra135 {
    public static void main(String[] args){
        //main
    }
}
