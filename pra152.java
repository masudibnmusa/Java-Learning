class User{
    private int id;
    private String name;
    private String phone;
    User(int id,String name,String phone){
        this.id = id;
        this.name = name;
        this.phone = phone;
    }
    public void setId(int id) {
        if(id<=0){
            throw new IllegalArgumentException("Id cant be negative");
        }
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getPhone() {
        return phone;
    }
    void displayUserInfo(){
        System.out.println("User id           : "+getId());
        System.out.println("User Name         : "+getName());
        System.out.println("User Phone number :"+getPhone());
    }
}
class Driver extends User{
    Driver(int id,String name,String phone){
        super(id, name, phone);
    }
    @Override
    void displayUserInfo(){
        System.out.println("Driver info");
        super.displayUserInfo();
    }
}
class Rider extends User{
    Rider(int id,String name,String phone){
        super(id, name, phone);
    }
    @Override
    void displayUserInfo(){
        System.out.println("Ride Info");
        super.displayUserInfo();
    }
}
class Vehicle{
    int vehicleId;
    String vehicleType;
    Vehicle(int vehicleId,String vehicleType){
        setVehicleId(vehicleId);
        setVehicleType(vehicleType);
    }
    public void setVehicleId(int vehicleId) {
        if(vehicleId<=0){
            throw new IllegalArgumentException("vehicle id cant be negative");
        }
        this.vehicleId = vehicleId;
    }
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
    void showVehicle(){
        System.out.println("Vehicle Id   : "+vehicleId);
        System.out.println("Vehicle Type : "+vehicleType);
    }
}
class Car extends Vehicle{
    Car(int vehicleId,String vehicleType){
        super(vehicleId, vehicleType);
    }
    @Override
    void showVehicle(){
        System.out.println("Car Info");
        super.showVehicle();
    }
}
class CNG extends Vehicle{
    CNG(int vehicleId,String vehicleType){
        super(vehicleId, vehicleType);
    }
    @Override
    void showVehicle(){
        System.out.println("CNG Info");
        super.showVehicle();
    }
}
class Bike extends Vehicle{
    Bike(int vehicleId,String VehicleType){
        super(vehicleId, VehicleType);
    }
    @Override
    void showVehicle(){
        System.out.println("Bike Info");
        super.showVehicle();
    }
}
public class pra152 {
    public static void main(String [] args){
        //main
        User u1 = new User(101, "null", "null");
        User u2 = new Driver(202, "null", "null");
        User u3 = new Rider(303, "null", "null");

        Vehicle v1 = new Car(303, null);
        Vehicle v2 = new Bike(301, null);
        Vehicle v3 = new CNG(303, null);
        u1.displayUserInfo();
        u2.displayUserInfo();
        u3.displayUserInfo();
        System.out.println();
        System.out.println();
        v1.showVehicle();
        System.out.println();
        v2.showVehicle();
        System.out.println();
        v3.showVehicle();
    }
}
