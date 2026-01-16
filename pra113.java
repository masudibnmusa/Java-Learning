abstract class Transport{
    protected double distance;
    Transport(double distance){
        if (distance <= 0){
            throw new IllegalArgumentException("Distance must be positive");
        }else{
            this.distance = distance;
        }
    }
    abstract void calFare();

    public double getDistance(){
        return distance ;
    }
}
class Bus extends Transport{
    Bus(double distance){
        super(distance);
    }
    void calFare(){
        double fare = getDistance()*2;
        System.out.println("Bus fare is : "+fare);
    }
}
class Train extends Transport{
    Train(double distance){
        super(distance);
    }
    void calFare(){
        double fare = getDistance()*1.5;
        System.out.println("Train fare is : "+fare);
    }
}
class Metro extends Transport{
    Metro(double distance){
        super(distance);
    }
    void calFare(){
        double fare = getDistance()*3;
        System.out.println("Metro fare id : "+fare);
    }
}
public class pra113 {
    public static void main (String[] args){
        //main....
        Transport[] transports = {
            new Bus(12),
            new Metro(12),
            new Train(12)
        };
        for (Transport t1 :transports){
            t1.calFare();
        }
    }
}
