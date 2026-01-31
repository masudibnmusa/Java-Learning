abstract class Product{
    protected int quantity;
    protected double price;
    Product(int quantity,double price){
        setQuantity(quantity);
        setPrice(price);
    }
    void setQuantity(int quantity){
        if(quantity <0){
            throw new IllegalArgumentException("quantity cant be negative");
        }
        this.quantity = quantity;
    }
    void setPrice(double price){
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
    Vegetable(int quantity,double price){
        super(quantity, price);
    }
    @Override
    void displayInfo(){
        System.out.println("Quantity of the vegetable is  : "+quantity);
        System.out.println("The price of the vegetable is : "+price);
    }
}
class Dairy extends Product{
    Dairy(int quantity,double price){
        super(quantity, price);
    }
    @Override
    void displayInfo(){
        System.out.println("Quantity of the dairy is  : "+quantity);
        System.out.println("The price of the dairy is : "+price);
    }
}
class Cart{
    
    Fruit fruit;
    Vegetable vegetable;
    Dairy dairy;
    Cart(Fruit fruit,Vegetable vegetable, Dairy dairy){
        this.fruit = fruit;
        this.vegetable = vegetable;
        this.dairy = dairy;
    }
    void totalPrice(){
        System.out.println("Toatal Payable ammount is : "+(fruit.price+vegetable.price+dairy.price));
    }
}
public class pra133 {
    public static void main(String[] args){
        //main
        Dairy p1 = new Dairy(1, 100);
        Fruit p2 = new Fruit(1, 100);
        Vegetable p3 = new Vegetable(1, 100);

        Cart c1 = new Cart(p2, p3, p1);
        c1.totalPrice();
    }
}
