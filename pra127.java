abstract class Items {
    protected int id;
    protected String name;
    protected int quantity;
    protected boolean isSelleble;

    Items(int id, String name, int quality) {
        this.id = id;
        this.name = name;
        setQuantity(quality);
    }

    void setId(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("Id cant be negative");
        }
        this.id = id;
    }

    void setQuantity(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("quantity cant be negative");
        }
        this.quantity = quantity;
    }
    void setStatus(boolean isSelleble){
        this.isSelleble = isSelleble;
    }
    boolean getStatus(){
        return isSelleble;
    }

    abstract void displayInfo();
}

class Perishable extends Items {
    protected String expireDate;
    Perishable(int id, String name, int quantity, String expireDate) {
        super(id, name, quantity);
        this.expireDate = expireDate;
    }
    
    @Override
    void displayInfo() {
        System.out.println("Item Id              : " + id);
        System.out.println("Item Name            : " + name);
        System.out.println("Item Quantity        : " + quantity);
        System.out.println("Item Expire Date     : " + expireDate);
        System.out.println("Item Sellable status : " + getStatus());
    }
}
class ElectricalItem extends Items{
    ElectricalItem(int id,String name,int quantity){
        super(id, name, quantity);
    }
    @Override
    void displayInfo(){
        System.out.println("Item Id              : " + id);
        System.out.println("Item Name            : " + name);
        System.out.println("Item Quantity        : " + quantity);
        System.out.println("Item Sellable status : " + getStatus());
    }
}

public class pra127 {
    public static void main(String[] args) {
        // main
        Items i1 = new ElectricalItem(102, "Fan", 2);
        Items i2 = new Perishable(101, "Sugar Canal", 5, "22-12-22");
        i2.setStatus(false);
        i1.displayInfo();
        System.out.println();
        i2.setStatus(true);
        i2.displayInfo();
        
    }
}
