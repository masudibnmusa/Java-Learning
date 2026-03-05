interface Playable {
    void play();
}
abstract class Game{
    abstract void start();
}
class Football extends Game implements Playable{
    @Override
    public void start(){
        System.out.println("Game Started....");
    } 
    @Override
    public void play(){
        System.out.println("Playing football....");
    }
}
class Cricket extends Game implements Playable{
    @Override
    public void start(){
        System.out.println("Game Started....");
    }
    @Override
    public void play(){
        System.out.println("Playing cricket....");
    }
}
public class pra155 {
    public static void main(String []args){
        //main
        
    }
}
