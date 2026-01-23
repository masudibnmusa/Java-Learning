class Student{
    int id;
    String name;
    String email ;
    Student(int id,String name,String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }
    void displayInfo(){
        System.out.println("Id   : "+id);
        System.out.println("Name : "+name);
        System.out.println("Email: "+email);
    }
}
public class pra126 {
    public static void main(String[]args){
        //main
        Student s1 = new Student(11, "Masud", "masudibnmusa10@gmail.com");
        s1.displayInfo();
    }
}
