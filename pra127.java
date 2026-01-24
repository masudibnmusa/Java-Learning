abstract class Items {
    protected int id;
    protected String name;
    protected int quantity;
    protected boolean isSelleble = false;

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

    abstract void displayInfo();

    abstract boolean isSelleble(boolean isSelleble);
}

class Perishable extends Items {
    protected String expireDate;

    Perishable(int id, String name, int quantity, String expireDate) {
        super(id, name, quantity);
        this.expireDate = expireDate;
    }

    @Override
    void displayInfo() {
        System.out.println("Item Id          : " + id);
        System.out.println("Item Name        : " + name);
        System.out.println("Item Quantity    : " + quantity);
        System.out.println("Item Expire Date : " + expireDate);
    }

    @Override
    boolean isSelleble(boolean isSelleble) {
        isSelleble = true;
        return isSelleble;
    }
}
class ElectricalItem extends Items{
    ElectricalItem(int id,String name,int quantity){
        super(id, name, quantity);
    }
    @Override
    void displayInfo(){
        System.out.println("Item Id          : " + id);
        System.out.println("Item Name        : " + name);
        System.out.println("Item Quantity    : " + quantity);
    }
    @Override
    boolean isSelleble(boolean isSelleble){
        isSelleble = true;
        return isSelleble;
    }
}

public class pra127 {
    public static void main(String[] args) {
        // main
    }
}
