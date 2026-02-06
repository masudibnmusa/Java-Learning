abstract class LibraryUser{
    protected int userId;
    protected String userName;
    protected String email;
    LibraryUser(int userId,String userName,String email){
        setId(userId);
        this.userName = userName;
        this.email = email;
    }
    private void setId(int userId){
        if(userId<=0){
            throw new IllegalArgumentException("User Id cant be negative");
        }
        this.userId = userId;
    }
    void displayUserInfo(){
        System.out.println("User Name : "+userId);
        System.out.println("User Name : "+userName);
        System.out.println("User Name : "+email);
    }
}
class Student extends LibraryUser{
    Student(int userId,String userName,String email){
        super(userId, userName, email);
    }
    @Override
    void displayUserInfo(){
        super.displayUserInfo();
        System.out.println("User Type : Student");
    }
}
class Teacher extends LibraryUser{
    Teacher(int userId,String userName,String email){
        super(userId, userName, email);
    }
    @Override
    void displayUserInfo(){
        super.displayUserInfo();
        System.out.println("User Type : Faculty");
    }
}
abstract class Book{
    protected int bookId;
    protected String bookTitle;
    protected String author;
    protected int stock;
    Book(int bookId,String bookTitle,String author,int stock){
        setBookid(bookId);
        this.bookTitle = bookTitle;
        this.author = author;
        setStock(stock);
    }
    private void setBookid(int bookId){
        if(bookId<=0){
            throw new IllegalArgumentException("Book Id cant be negative");
        }
        this.bookId = bookId;
    }
    private void setStock(int stock){
        if(stock<0){
            throw new IllegalArgumentException("Stock cant be negative");
        }
        this.stock = stock;
    }
    abstract void displayBook();
}
class TextBook extends Book{
    TextBook(int bookId,String bookTitle,String author){
        super(bookId, bookTitle, author, bookId);
    }
    @Override
    void displayBook(){
        System.out.println("Book's Id : "+bookId);
        System.out.println("Book's Title : "+bookTitle);
        System.out.println("Book's Author : "+author);
        System.out.println("Book Type : Text Book");
        System.out.println("Stock : "+stock);
    }
}
class Novel extends Book{
    Novel(int bookId,String bookTitle,String author,int stock){
        super(bookId, bookTitle, author, stock);
    }
    @Override
    void displayBook(){
        System.out.println("Book's Id : "+bookId);
        System.out.println("Book's Title : "+bookTitle);
        System.out.println("Book's Author : "+author);
        System.out.println("Book Type : Novel");
        System.out.println("Stock : "+stock);
    }
}
class ReferenceBook extends Book{
    ReferenceBook(int bookId,String bookTitle,String author,int stock){
        super(bookId, bookTitle, author, stock);
    }
    @Override
    void displayBook(){
        System.out.println("Book's Id : "+bookId);
        System.out.println("Book's Title : "+bookTitle);
        System.out.println("Book's Author : "+author);
        System.out.println("Book Type : Reference Book");
        System.out.println("Stock : "+stock);
    }
}
public class pra136 {
    public static void main(String[] args) {
        //main
        LibraryUser u1 = new Student(101, null, null); 
        LibraryUser u2 = new Teacher(102, null, null);
        
        Book b1 = new Novel(201, null, null, 0);
        Book b2 = new TextBook(202, null, null);
        Book b3 = new ReferenceBook(203, null, null, 0);

        u1.displayUserInfo();
        System.out.println();
        u2.displayUserInfo();
        System.out.println();
        System.out.println();
        b1.displayBook();
        b2.displayBook();
        b3.displayBook();
    }
}
