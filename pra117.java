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
        System.out.println("Id    : "+id);
        System.out.println("Name  : "+name);
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
    private double distance;
    private int baseAmmount;
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
    void calculateTotal(){
        System.out.println("Total ammoutn is : ");
    }
    double deliveryCharge(){
        return  (distance*12);
        
    }
    void displayOrder(){
        System.out.println("Order detiils");
        System.out.println("Distance is : "+distance);
        System.out.println("Ammount is : "+baseAmmount);
    }
    int getBaseammount(){
        return baseAmmount;
    }
    double getDistance(){
        return distance;
    }
}
class RestuarentOrder extends Order{
    RestuarentOrder(double distance ,int baseAmmount){
        super(distance, baseAmmount);
    }
    @Override
    double deliveryCharge(){
        return (getDistance()*15);
    }

    @Override
    void displayOrder(){
        System.out.println("Restuarent");
        super.displayOrder();
    }
}
class GroceryOrder extends Order{
    GroceryOrder(double distance,int baseAmmount){
        super(distance,baseAmmount);
    }
    @Override
    double deliveryCharge(){
        return (getDistance()*18);
    }
    @Override
    void displayOrder(){
        System.out.println("Grocery");
        super.displayOrder();
    }
}
class ShowOrder{
    private Customer customer;
    private DeliveryPartner deliveryPartner;
    private GroceryOrder groceryOrder;
    private RestuarentOrder restuarentOrder;
    
    ShowOrder(Customer customer,DeliveryPartner deliveryPartner,GroceryOrder groceryOrder,RestuarentOrder restuarentOrder){
        this.customer = customer;
        this.deliveryPartner = deliveryPartner;
        this.groceryOrder = groceryOrder;
        this.restuarentOrder = restuarentOrder;
    }
    public void getShoworder(){
        double totalAmmount ;
        System.out.println("Order Details");
        System.out.println();
        User u1 = customer;
        User u2 = deliveryPartner;
        Order o1 = groceryOrder;
        Order o2 = restuarentOrder;

        u1.showDetails();
        System.out.println();
        u2.showDetails();
        System.out.println();
        o1.displayOrder();
        System.out.println("Delivery Charge for Grocery Order is : "+o1.deliveryCharge());
        System.out.println();
        o2.displayOrder();
        System.out.println("Delivery Charge for Grocery Order is : "+o2.deliveryCharge());
        System.out.println();
        totalAmmount = o1.getBaseammount()+o2.getBaseammount()+o1.deliveryCharge()+o2.deliveryCharge();
        System.out.println("Total amamount is : "+totalAmmount);
    }
}
public class pra117 { 
    public static void main(String[] args) {
        Customer c1 = new Customer(303, "Masud", "01713504283");
        DeliveryPartner d1 = new DeliveryPartner(202, "Mahim", "01912428723");
        GroceryOrder g1 = new GroceryOrder(12, 1600);
        RestuarentOrder r1 = new RestuarentOrder(16, 890);

        ShowOrder s1 = new ShowOrder(c1, d1, g1, r1);
        s1.getShoworder();
    }
}
