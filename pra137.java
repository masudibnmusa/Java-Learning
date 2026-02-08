abstract class Texi{
    protected int taxiId;
    protected String ownerName;
    protected String phone;
    Texi(int taxiId,String ownerName,String phone){
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
public class pra137 {
    public static void main(String[] args){
        //maingti 
    }
}
