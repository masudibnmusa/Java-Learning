abstract class Product{
    protected int quantity;
    protected double price;
    Product(int quantity,double price){
        setQuantity(quantity);
        setPrice(quantity);
    }
    void setQuantity(int quantity){
        if(quantity <0){
            throw new IllegalArgumentException("quantity cant be negative");
        }
        this.quantity = quantity;
    }
    void setPrice(int price){
        if(price <0){
            throw new IllegalArgumentException("Price cant be negative");
        }
        this.price = price;
    }
    abstract void displayInfo();
}
class Fruit extends Product{
    Fruit(int quantity,double price){
        super(quantity, price);
    }
    @Override
    void displayInfo(){
        System.out.println("Quantity of the fruit is  : "+quantity);
        System.out.println("The price of the fruit is : "+price);
    }
}
class Vegetable extends Product{

}
class Dairy extends Product{

}
private class Cart{

}
public class pra133 {
    public static void main(String[] args){
        //main
    }
}
