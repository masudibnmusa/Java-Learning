abstract class Taxi{
    protected int taxiId;
    protected String ownerName;
    protected String phone;
    Taxi(int taxiId,String ownerName,String phone){
        setTaxiId(taxiId);
        setOwnerName(ownerName);
        setPhone(phone);
    }
    private void setTaxiId(int taxiId) {
        if(taxiId<=0){
            throw new IllegalArgumentException("Id cant be negative");
        }
        this.taxiId = taxiId;
    }
    private void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    private  void setPhone(String phone) {
        this.phone = phone;
    }
    abstract void showTexi();
}
class NormalTaxi extends Taxi{
    NormalTaxi(int taxiId,String ownerName,String phone){
        super(taxiId,ownerName,phone);
    }
    @Override
    void showTexi(){
        System.out.println("Normal Taxi Id    : "+taxiId);
        System.out.println("Normal Taxi owner : "+ownerName);
        System.out.println("Normal Taxi phone : "+phone);
    }
}
class PremiumTaxi extends Taxi{
    PremiumTaxi(int taxiId,String ownerName,String phone){
        super(taxiId, ownerName, phone);
    }
    @Override
    void showTexi(){
        System.out.println("Premium Taxi Id    : "+taxiId);
        System.out.println("Premium Taxi owner : "+ownerName);
        System.out.println("Premium Taxi phone : "+phone);
    }
}

public class pra137 {
    public static void main(String[] args){
        //maingti 
        Taxi t1 = new NormalTaxi(101, "Masud", "01964332844");
        Taxi t2 = new PremiumTaxi(202, "Mahin", "01518361192");

        t1.showTexi();
        System.out.println();
        t2.showTexi();

    }
}
