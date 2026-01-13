class Book{
    String title;
    String author;
    int price;

    Book(String title,String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void displayBook(){
        System.out.println("The title of the book is:"+this.title);
        System.out.println("The Author of the book is:"+this.author);
        System.out.println("The price of the book is:"+this.price);
    }
}
public class pra85 {
    public static void main(String[] args) {
        Book b1 = new Book("Silicon vally", "Masud", 1000);
        b1.displayBook();
    }
}
