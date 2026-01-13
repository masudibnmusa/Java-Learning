import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void calculateSalary(double percent) {
        double bonus = salary * (percent / 100);
        double totalSalary = salary + bonus;

        System.out.println("Employee: " + name);
        System.out.println("Basic Salary: " + salary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + totalSalary);
        System.out.println("----------------------");
    }
}

public class pra87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i+1));

            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // clear buffer

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Basic Salary: ");
            double salary = sc.nextDouble();

            employees[i] = new Employee(id, name, salary);
        }

        System.out.print("\nEnter Bonus (%): ");
        double percent = sc.nextDouble();

        System.out.println("\n=== Salary Details ===");
        for (Employee emp : employees) {
            emp.calculateSalary(percent);
        }

        sc.close();
    }
}
