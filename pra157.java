interface RunnableTask{
    void run();
}
abstract class Machine{
    abstract void start();
}
class Robot extends Machine implements RunnableTask{
    @Override
    public void start(){
        System.out.println("Robot starting.....");
    }
    @Override
    public void run(){
        System.out.println("");
    }
}
public class pra157 {
    public static void main(String[] args){
        //mian
        
    }
}
