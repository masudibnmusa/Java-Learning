import java.util.Scanner;
class Student {

    private int id;
    private String name;
    private int marks1, marks2, marks3;

    Student(int id, String name, int m1, int m2, int m3) {
        this.id = id;
        this.name = name;
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
    }

    int getTotal(){
        return marks1 + marks2 + marks3;
    }

    int getAverage(){
        return getTotal()/3;
    }

    void display(){
        System.out.println("\n--- Student Details ---");
        System.out.println("ID: "+id);
        System.out.println("name: "+name);
        System.out.println("Totel Marks: "+getTotal());
        System.out.println("Avwrage: "+getAverage());
    }
}

public class pra122{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student id: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks 1:");
        int m1 = sc.nextInt();
        

        System.out.print("Enter marks 2:");
        int m2 = sc.nextInt();

        System.out.print("Enter marks 3:");
        int m3 = sc.nextInt();

        Student s1 = new Student(id, name, m1,m2,m3);
        s1.display();
    }
}