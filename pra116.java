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
    Light(int deviceId,String name,Double powerUsage){
        super(deviceId, name, powerUsage);
        this.brightness = brightness;
    }
}
public class pra116 {
    public void main(String [] args){
        //mian...
    }
}
