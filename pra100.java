class LibraryMember{
    private int memberId ;
    private String name ;
    private int bookIssued;

    LibraryMember(int memberId,String name,int bookIssued){
        this.memberId = memberId;
        this.name = name ;
    }
    public void setBookissued(int bookIssued){
        if (bookIssued>=5){
            System.out.println("maximum 5 is allowed");
        }else{
            this.bookIssued = bookIssued;
        }
    }
    public void getDetails(){
        System.out.println("The name of the member is : "+name);
        System.out.println("The member id is : "+memberId);
        System.out.println("Number of issued book is : "+bookIssued);
    }
}
public class pra100{
    public static void main(String[] args){
        LibraryMember m1 = new LibraryMember(171,"Masud",0);
        m1.setBookissued(6);
        m1.getDetails();
        System.out.println("-----------");
        m1.setBookissued(3);
        m1.getDetails();
    }
}