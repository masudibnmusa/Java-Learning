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
public class pra117 {
    public static void main(String[] args) {
        //main
    }
}
