class Student{
    String name ;
    int roll ;

    public void printName(String name){
        System.out.println(name);
    }

    public void printRoll(int roll){
        System.out.println(roll);
    }

    public void printDetails(String name, int roll){
        System.out.println(name);
        System.out.println(roll);
    }
}
public class pra89 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.printDetails("Masud", 2);
        s1.printName("Masud");
        s1.printRoll(2);
    }
}

//compile polymorphisom 