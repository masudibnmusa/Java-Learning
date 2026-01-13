import java.util.Scanner;

class Emplyee{
    int id;
    String name ;
    double salary;

    Emplyee(int id,String name ,double salary){

        this.name = name ;
        this.id = id;
        this.salary = salary ;
    }

    public void calculateSalry(double percent){
        double totalsalary = this.salary +(this.salary*(percent/100));
        System.out.println("Basic salary is :"+this.salary);
        System.out.println("bonus is :"+percent);
        System.out.println("Toatal salary is: "+totalsalary);
    }
}
public class pra83 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enther the id:");
        int id = sc.nextInt();
        System.out.println("Enther the basic name:");
        String name = sc.nextLine();
        sc.nextLine();
        System.out.println("Enther besic salary:");
        double salary = sc.nextDouble();
        
        Emplyee e1 = new Emplyee(id, name, salary);
        e1.calculateSalry(12);
    }
}
