abstract class Leave{
    protected int id;
    protected String name;
    protected int time;
    Leave(int id,String name,int time){
        setId(id);
        this.name = name ;
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
        System.out.println("Employee name : "+name);
        System.out.println("Time of leave : "+time);
    }  
}
class CasualLeavae extends Leave{
    private String leaveType = "Casual Leave";
    CasualLeavae(int id,String name,int time){
        super(id, name, time);
    }
    @Override
    void showLeavedetails(){
        super.showLeavedetails();
        System.out.println("Cause of leave : "+leaveType);
    }
}
class SickLeave extends Leave{
    private String leaveType = "Sick Leave";
    SickLeave(int id,String name,int time){
        super(id, name, time);
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
    Employee(int id,String name,String email){
        setid(id);
        this.name = name;
        this.email = email;
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
    void displayEmployeeinfo(){
        System.out.println("Employee Id    : "+getId());
        System.out.println("Employee name  : "+getName());
        System.out.println("Employee Email : "+getEmail());
    }
} 
public class pra125 {
    public static void main(String[] args) {
        Leave l1 = new SickLeave(101, "Masud", 2); 
        Leave l2 = new CasualLeavae(101, "Masud", 3);
        l1.showLeavedetails();
        System.out.println();
        l2.showLeavedetails();
        System.out.println();
        Employee e1 = new Employee(101, "Masud", "masudibnmusa10@gamil.com");
        e1.displayEmployeeinfo();
    }
    //main
}
