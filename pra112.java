import java.util.ArrayList;

class Product {
    private int id;
    private String name;
    private double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        setPrice(price);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be positive");
        }
        this.price = price;
    }
}

class OrderItem {
    private Product product;
    private int quantity;

    OrderItem(Product product, int quantity) {
        this.product = product;
        setQuantity(quantity);
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 1) {
            throw new IllegalArgumentException("Quantity must be at least 1");
        }
        this.quantity = quantity;
    }

    public double getSubtotal() {
        return product.getPrice() * quantity;
    }
}

class Order {
    private ArrayList<OrderItem> items;

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public double calculateTotal() {
        double total = 0;

        for (OrderItem item : items) {
            total += item.getSubtotal();
        }

        if (total > 5000) {
            total = total * 0.9; // 10% discount
        }

        return total;
    }

    public void displayOrder() {
        System.out.println("----- Order Details -----");

        for (OrderItem item : items) {
            System.out.println(
                item.getProduct().getName() +
                " | Qty: " + item.getQuantity() +
                " | Subtotal: " + item.getSubtotal()
            );
        }

        System.out.println("Final Total: " + calculateTotal());
    }
}

public class pra112 {
    public static void main(String[] args) {

        Product p1 = new Product(1, "Laptop", 4000);
        Product p2 = new Product(2, "Headphone", 1200);

        OrderItem item1 = new OrderItem(p1, 1);
        OrderItem item2 = new OrderItem(p2, 2);

        Order order = new Order();
        order.addItem(item1);
        order.addItem(item2);

        order.displayOrder();
    }
}
