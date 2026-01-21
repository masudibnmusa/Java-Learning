abstract class Leave{
    protected int id;
    protected String name;
    protected int time;
    Leave(int id,String name,int time){
        this.id = id ;
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
public class pra125 {
    //main
}
