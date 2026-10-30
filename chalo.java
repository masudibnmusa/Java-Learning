interface Rides{
    void startRide(String startLocation ,String destination);
}
class CNG implements Rides{
    @Override 
    public void startRide(String startLocation ,String destination){
        System.out.println("starting cng from "+startLocation+"to"+destination);
    }
}

class Bike implements  Rides{
    @Override 
    public  void startRide(String startLocation ,String destination){
        System.out.println("starting bike from "+startLocation+"to"+destination);
    }
}
class Car implements  Rides{
    @Override 
    public  void startRide(String startLocation ,String destination){
        System.out.println("starting car from "+startLocation+"to"+destination);
    }
}

class RideServices {
    public Rides getRide(String rideType){
        if(rideType == null){
            return  null;
        }
        if(rideType.equals("CNG")){
            return new CNG();
        }else if(rideType.equalsIgnoreCase("Bike")){
            return new Bike();
        }else if (rideType.equalsIgnoreCase("Car")){
            return new Car();
        }else{
            throw new IllegalArgumentException("Invalid ride type !");
        }
    }
}

public class chalo {
    public static void main(String[] args) {
        RideServices rideServices = new RideServices();
        
        Rides rides = rideServices.getRide("CNG");
        rides.startRide("Daffodil International University", "Mirpur");
    }
}
