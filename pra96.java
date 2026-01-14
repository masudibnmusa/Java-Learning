class Employee{
    private int id ;
    private String name ;
    private double basicSalry;

    Employee(int id,String name, double basicSalary){
        this.id = id;
        this.name = name ;
        this.basicSalry = basicSalary;
    }
    //getter
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return basicSalry;
    }
    //setter
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name ;
    }
    public void setSalary(double basicSalary){
        this.basicSalry = basicSalary;
    }
    public void calculateSalary(double percent){
        double totalSalary = basicSalry + (basicSalry*(percent/100));
        System.out.println("Total salary is : "+totalSalary);
    }
}
public class pra96 {
    public static void main(String [] args){
        //main
        Employee e1 = new Employee(171, "Masud", 1200);
        e1.calculateSalary(12);
        Employee e2 = new Employee(0, null, 0);
        e2.setId(232);
        e2.setName("Rakib");
        e2.setSalary(20000);
        e2.calculateSalary(12);
    }
}
