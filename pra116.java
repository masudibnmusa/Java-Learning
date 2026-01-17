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
            System.out.println("Light is on");
        }
    }
    @Override
    public void turnOff(){
        if(!isOn){
            System.out.println("Ligth is already off");
        }else{
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
            System.out.println("Fan is on");
        }
    }
    @Override
    public void turnOff(){
        if(!isOn){
            System.out.println("Fan is already off");
        }else{
            System.out.println("Fan is off");
        }
    }
}
public class pra116 {
    public void main(String [] args){
        //mian...
    }
}
