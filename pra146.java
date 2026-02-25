class Student {
    int id;
    String name;
    Student(String name,int id){
        this.name = name ;
        setId(id);
    }
    public void setId(int id) {
        if(id <= 0){
            throw new IllegalArgumentException("Id cant be negative");
        }
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
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
