import java.util.Scanner;

class Book{
    String title;
    String author;
    float price;

    Book(String title,String author,float price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display(){
        System.out.println("======Book Details=====");
        System.out.println("Book Tile: "+title);
        System.out.println("Book Author: "+author);
        System.out.println("Book Price: "+price);
    }
}
public class pra88 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of books: ");
        int n = sc.nextInt();
        sc.nextLine();

        Book[] books = new Book[n];

        for (int i = 0;i<n; i++){
            System.out.print("Enter Book's Title : ");
            String title = sc.nextLine();

            System.out.print("Enter Book's Author : ");
            String name = sc.nextLine();

            System.out.print("Enter Book's price : ");
            float price = sc.nextFloat();
            sc.nextLine();

            books[i] = new Book(title, name, price);
        }

        System.out.println("-------Books details-----");
        for (Book bks : books){
            bks.display();
        }
        sc.close();
    }
}
