abstract class User{
    protected int userId;
    protected String name;
    protected String phone;
    User(int userId,String name,String phone){
        setId(userId);
        this.name = name;
        this.phone = phone;
    }
    void setId(int userId){
        if(userId<=0){
            throw new IllegalArgumentException("Id cant be negative");
        }
        this.userId = userId;
    }
    abstract void displayInfo();
}
class Trainer extends User{
    private String userType = "Trainer";
    Trainer(int userId,String name,String phone){
        super(userId, name, phone);
        this.userType = userType;
    }
    @Override
    void displayInfo(){
        System.out.println("User Id    : "+userId);
        System.out.println("User Name  : "+name);
        System.out.println("User Phone : "+name);
        System.out.println("User Type  : "+userType);
    }
}
class Member extends User{
    private String userType = "Member";
    Member(int userId,String name,String phone){
        super(userId, name, phone);
        this.userType = userType;
    }
    @Override
    void displayInfo(){
        System.out.println("User Id    : "+userId);
        System.out.println("User Name  : "+name);
        System.out.println("User Phone : "+name);
        System.out.println("User Type  : "+userType);
    }
}
abstract class Workout{
    protected String name;
    protected int duration;
    protected int caloriesBurned;
    protected String level;
    Workout(String name,int duration,int caloriesBurned,String level){
        this.name = name;
        setDuration(duration);
        setCaloriesBurned(caloriesBurned);
        this.level = level;
    }
    void setDuration(int duration){
        if(duration<=0 || duration >25){
            throw new IllegalArgumentException("Duration cant be less than 0 and getter than 25 second");
        }
        this.duration = duration;
    }
    void setCaloriesBurned(int caloriesBurned){
        if(caloriesBurned<0){
            throw new IllegalArgumentException("User cant burned negative callories");
        }
        this.caloriesBurned = caloriesBurned;
    }
    abstract void displayWorkout();
}
class CardioWorkout extends Workout{

}
class StrengthWorkout extends Workout{

}
public class pra132 {
    public static void main(String [] args){
        //main
    }
}
