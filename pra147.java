class Book{
    String title;
    String author;
    int price;
    Book(String title,String author,int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void displayBook(){
        System.out.println("Title  : "+title); 
        System.out.println("Author : "+author); 
        System.out.println("Price  : "+price); 
    }
}
public class pra147 {
    public static void main(String[] args){
        Book b1 = new Book("amar book","masud",1200);
        Book b2 = new Book("amar book","masud",1200);
        b1.displayBook();
        System.out.println();
        b2.displayBook();
        //main
    }
}
