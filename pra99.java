class Car{
    private String brand;
    private String model;
    private double price;

    Car(String brand,String model,double price){
        this.brand = brand ;
        this.model = model ;
        
    }

    public void setPrice(double price){
        if (price<=0){
            System.out.println("invalid");
        }else{
            this.price = price; 
        }
    }

    public void display(){
        System.out.println(brand);
        System.out.println(model);
        System.out.println(price);
    }

}
public class pra99 {
    public static void main(String[] args) {
        Car c1 = new Car("TATA", "Sieara", 0);
        c1.display();
        c1.setPrice(-122);
        c1.display();
        System.out.println("--------");
        c1.setPrice(1200);
        c1.display();
    }
}
