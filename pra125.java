abstract class Leave{
    protected int id;
    protected Employee employee;
    protected int time;
    Leave(int id,Employee employee,int time){
        setId(id);
        this.employee = employee;
        setTime(time);
    }
    void setTime(int time){
        if(time<0){
            throw new IllegalArgumentException("Time cant be negative");
        }
        this.time = time;
    }
    void setId(int id){
        if (id<0){
            throw new IllegalArgumentException("Id can't be negative");
        }
        this.id = id;
    }
    void showLeavedetails(){
        System.out.println("Employee Id   : "+id);
        System.out.println("Employee name : "+employee.getName());
        System.out.println("Time of leave : "+time);
    }  
}
class CasualLeavae extends Leave{
    private String leaveType = "Casual Leave";
    CasualLeavae(int id,Employee employee,int time){
        super(id, employee, time);
    }
    @Override
    void showLeavedetails(){
        super.showLeavedetails();
        System.out.println("Cause of leave : "+leaveType);
    }
}
class SickLeave extends Leave{
    private String leaveType = "Sick Leave";
    SickLeave(int id,Employee employee,int time){
        super(id, employee, time);
    }
    @Override
    void showLeavedetails(){
        super.showLeavedetails();
        System.out.println("Cause of leave : "+leaveType);
    }
}
class Employee{
    private int id;
    private String name;
    private String email;
    private String position;
    Employee(int id,String name,String email,String position){
        setid(id);
        this.name = name;
        this.email = email;
        this.position = position;
    }
    void setid(int id){
        if(id<0){
            throw new IllegalArgumentException("Id can't be negative");
        }
        this.id = id;
    }
    int getId(){
        return id;
    }
    String getName(){
        return name;
    }
    String getEmail(){
        return email;
    }
    String getPosition(){
        return position;
    }
    void displayEmployeeinfo(){
        System.out.println("Employee Id       : "+getId());
        System.out.println("Employee name     : "+getName());
        System.out.println("Employee Email    : "+getEmail());
        System.out.println("Employee position : "+getPosition());
    }
} 
public class pra125 {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Masud", "masudibnmusa10@gamil.com","Manager");
        Employee e2 = new Employee(102, "Mahin", "mahinkhan@gamil.com","Senior Software Engineer");
        Leave l1 = new SickLeave(101, e1, 2);
        Leave l2 = new SickLeave(102, e2, 5);
        System.out.println("Leave and Employee details");
        l1.showLeavedetails();
        System.out.println();
        e1.displayEmployeeinfo();
        System.out.println();
        System.out.println("Leave and Employee details");
        l2.showLeavedetails();
        System.out.println();
        e2.displayEmployeeinfo();
    }
    //main
}
