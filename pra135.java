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
class Truck extends Vehicle{
    String type = "Truck";
    Truck(int no,String name,String phone){
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
class ParkingLot{
    String name;
    int capacity;
    String watchMan;
    String watchManPhone;
    ParkingLot(String name,int capacity,String watchMan,String watchManPhone){
        this.name = name;
        setCapacity(capacity);
        this.watchMan = watchMan;
        this.watchManPhone = watchManPhone;
    }
    void setCapacity(int capacity){
        if(capacity<=0){
            throw new IllegalArgumentException("Capacity cant be negative");
        }
        this.capacity = capacity;
    }
    void dispalyParkingLot(){
        System.out.println("Paking Lot Name : "+name);
        System.out.println("Paking Lot Capacity : "+capacity);
        System.out.println("Paking Lot Watch Man name : "+watchMan);
        System.out.println("Paking Lot Watch Man Phone : "+watchManPhone);
    }
}
class ParkingSlot{
    int slotNo;
    Vehicle vehicle;
    ParkingLot parkingLot;
    ParkingSlot(int slotNo,Vehicle vehicle, ParkingLot parkingLot){
        setSlotno(slotNo);
        this.vehicle = vehicle;
        this.parkingLot = parkingLot;
    }
    void setSlotno(int slotNo){
        if(slotNo<=0){
            throw new IllegalArgumentException("cant be  negative");
        }
        this.slotNo = slotNo;
    }
    void displaySlot(){
        System.out.println("Slot Number : "+slotNo);
        System.out.println("Owner's Name : "+vehicle.name);
        System.out.println("Parking Lot  Name : "+parkingLot.name);
    }
} 
public class pra135 {
    public static void main(String[] args){
        //classes
        Vehicle v1 = new Bike(101, "Masud", null);
        Vehicle v2 = new Truck(102, "Rakib", null);
        Vehicle v3 = new Car(103, "mahim", null);

        ParkingLot p1 = new ParkingLot("West Zone", 1200, "Mahin", null);
        ParkingSlot slot1 = new ParkingSlot(1, v1, p1);
        
        //Operations
        v1.displayVehicle();
        System.out.println();
        v2.displayVehicle();
        System.out.println();
        v3.displayVehicle();
        System.out.println();
        System.out.println();
        System.out.println();

        p1.dispalyParkingLot();
        System.out.println();

        slot1.displaySlot();
    }
}
