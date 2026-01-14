class Mobile{
    private String brand;
    private String model;
    private double price;

    Mobile(String brand,String model,double price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    //getter
     public String getBrand(){
        return brand;
     }
     public String getModel(){
        return model;
     }
     public Double getPrice(){
        return price;
     }
    //setter;
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setPrice(double price){
        this.price = price;
    }
}
public class pra98 {
    public static void main(String[] args){
        //main....
        Mobile m1 = new Mobile(null, null, 0);
        m1.setBrand("samsung");
        m1.setModel("s24 ultra");
        m1.setPrice(950000);
        System.out.println(m1.getBrand());
        System.out.println(m1.getModel());
        System.out.println(m1.getPrice());
    }
}
 