import java.util.Scanner;

class Employee{
    int id;
    String name ;
    double salary;

    Employee(int id,String name,double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void calculateSalary(double percent){
        double totalSalary = this.salary +(this.salary*(percent/100));
        System.out.println("The total salary is: "+totalSalary);
    }
}
public class pra86 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        

        System.out.println("Enter the number of employees:");
        int n = sc.nextInt();

        Employee[] employees = new Employee[n];
            

        for (int i = 0; i<n; i++){
            
            System.out.print("Enetr the id:");
            int id = sc.nextInt();
            sc.nextLine();
            
            System.out.print("Enetr the name:");
            String name = sc.nextLine();

            System.out.print("Enetr the basic salary:");
            double salary = sc.nextDouble();

            
            employees[i] = new Employee(id, name, salary);
            
        }
        System.out.print("Enter Bonus:");
        double bonus = sc.nextDouble();

        for (Employee cal :employees){
            cal.calculateSalary(bonus);
        }
        sc.close();

    }
}
