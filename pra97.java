class Book{
    String title;
    String author;
    double price;

    Book(String title,String author,double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    public void setPrice(double price){
        this.price = price;
    }

    public void display(){

        System.out.println("Tile is   :"+title);
        System.out.println("Author is :"+author);
        System.out.println("Price is  :"+price);
    }
}
public class pra97 {
    public static void main(String[] args){
        //main
        Book b1 = new Book("The Bokk", "Masud", 1200);
        b1.setPrice(1100);
        b1.display();
    }
}
