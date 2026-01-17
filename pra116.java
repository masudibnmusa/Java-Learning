abstract class Device {
    protected int deviceId;
    protected String name;
    protected double powerUsage;
    protected boolean isOn;
    Device(int deviceId,String name,Double powerUsage){
        this.deviceId = deviceId;
        this.name = name ;
        this.powerUsage = powerUsage;
        this.isOn = false; 
    }
    public abstract void turnON();
    public abstract void turnOff();

    public double getPowerusage(){
        return powerUsage;
    }
    public boolean getStatus(){
        return isOn;
    }
} 
class Light extends Device{
    private int brightness;
    Light(int deviceId,String name,int brightness){
        super(deviceId, name, 60.00);
        this.brightness = brightness;
    }
    @Override
    public void turnON(){
        if (isOn){
            System.out.println("Light is already on");
        }else{
            isOn = true;
            System.out.println("Light is on");
        }
    }
    @Override
    public void turnOff(){
        if(!isOn){
            System.out.println("Ligth is already off");
        }else{
            isOn = false;
            System.out.println("light is off");
        }
    }
}
class Fan extends Device{
    private int speedLevel;
    Fan(int deviceId,String name , int speedLevel){
        super(deviceId, name, 120.00);
        this.speedLevel= speedLevel;
    }
    @Override
    public void turnON(){
        if(isOn){
            System.out.println("Fan is already on ");
        }else{
            isOn = true;
            System.out.println("Fan is on");
        }
    }
    @Override
    public void turnOff(){
        if(!isOn){
            System.out.println("Fan is already off");
        }else{
            isOn = false;
            System.out.println("Fan is off");
        }
    }
}
class Ac extends Device{
    double temperaure;
    Ac(int deviceId,String name, double temperaure){
        super(deviceId, name, 150.00);
        this.temperaure = temperaure;
    }
    @Override
    public void turnON(){
        if(isOn){
            System.out.println("Ac is already on");
        }else{
            isOn = true;
            System.out.println("Ac is on");
        }
    }
    @Override
    public void turnOff(){
        if(!isOn){
            System.out.println("Ac is already off");
        }else{
            isOn = false;
            System.out.println("Ac is off");
        }
    }
}
public class pra116 {
    public static void main(String [] args){
        //mian...
        Device[] devices = {
            new Ac(1, "Room's Ac", 19),
            new Fan(2, "Cilling Fan", 86),
            new Light(3, "Table Light", 120)
        };
        for (Device d1 : devices){
            d1.turnON();
            System.out.println(d1.getPowerusage());
            System.out.println(d1.getStatus());
            d1.turnOff();
            System.out.println(d1.getStatus());
        }
    }
}
