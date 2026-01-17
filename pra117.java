abstract class User{
    protected int id;
    protected String name;
    protected String phone;
    User(int id,String name , String phone){
        this.id = id;
        this.name = name;
        this.phone = phone;
    }
    void showDetails(){
        System.out.println("User Details");
        System.out.println("Id : "+id);
        System.out.println("Name : "+name);
        System.out.println("Phone : "+phone);
    };
}
class Customer extends User{
    Customer(int id,String name, String phone){
        super(id, name, phone);
    }
    @Override
    void showDetails(){
        System.out.println("Customer");
        super.showDetails();
    }
}
class DeliveryPartner extends User{
    DeliveryPartner(int id,String name,String phone){
        super(id, name, phone);
    }
    @Override
    void showDetails(){
        System.out.println("Delivery Partner");
        super.showDetails();
    }
}
abstract class Order{
    protected double distance;
    protected int baseAmmount;
    Order(double distance,int baseAmmount){
        setDistance(distance);
        setBaseammount(baseAmmount);
    }
    void setDistance(double distance){
        if (distance<0){
            throw new IllegalArgumentException("Distance cant be negative");
        }else{
            this.distance = distance;
        }
    }
    void setBaseammount(int baseAmmount){
        if(baseAmmount<0){
            throw new IllegalArgumentException("Ammount can't be negative");
        }else{
            this.baseAmmount= baseAmmount;
        }
    }
    void displayOrder(){
        System.out.println("Distance is : "+distance);
        System.out.println("Ammount is : "+baseAmmount);
    }
}
class RestuarentOrder extends Order{
    RestuarentOrder(double distance ,int baseAmmount){
        super(distance, baseAmmount);
    }
    @Override
    void displayOrder(){
        super.displayOrder();
    }
}
class GroceryOrder extends Order{
    GroceryOrder(double distance,int baseAmmount){
        super(distance,baseAmmount);
    }
    @Override
    void displayOrder(){
        super.displayOrder();
    }
}
public class pra117 {
    public static void main(String[] args) {
        //main
    }
}
