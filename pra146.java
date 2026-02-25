class Student {
    int id;
    String name;
    Student(String name,int id){
        this.name = name ;
        this.id = id;
    }
    void displayStudent(){
        System.out.println("Name : "+name);
        System.out.println("Id : "+id);
    }
}
public class pra146 {
    public static void main(String[] args){
        //main
        Student s1 = new Student("MAsud",  171);
        s1.displayStudent();
    }
}
