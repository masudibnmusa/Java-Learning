abstract class Wallet{
    protected int walletId;
    protected String owner;
    protected double bal;
    Wallet(int walletId,String owner,double bal){
        this.walletId = walletId;
        this.owner = owner;
        if(bal<0){
            throw new IllegalArgumentException("balance cant be zero");
        }
        this.bal = bal;
    }
    double getBal(){
        return bal;
    }
    void addBal(double amount){
        if(amount>0){
            bal +=amount;
            System.out.println("Amount Credited : "+bal);
        }else{
            System.out.println("Amount must be greater than 0 Taka");
        }
    }
    void transferAmount(double amount){
        System.out.println(amount+" taka is successfully trasfered");
    }
    void walletInfo(){
        System.out.println("Wallet Id       : "+walletId);
        System.out.println("Owner name      : "+owner);
        System.out.println("Current Balance : "+getBal());
    }
}
class MobileWallet extends Wallet{
    MobileWallet(int walletId,String owner,double bal){
        super(walletId,owner,bal);
    }
    @Override
    void addBal(double amount){
        super.addBal(amount);
    }
    @Override
    void transferAmount(double amount){
        super.transferAmount(amount);
    }
    @Override
    void walletInfo(){
        super.walletInfo();
    }
}
class CryptoWallet extends Wallet{
    CryptoWallet(int walletId,String owner,double bal){
        super(walletId, owner, bal);
    }
    @Override
    void addBal(double amount){
        super.addBal(amount);
    }
    @Override
    void transferAmount(double amount){
        super.transferAmount(amount);
    }
    @Override
    void walletInfo(){
        super.walletInfo();
    }
}
public class pra121 {
    public static void main(String[]args){
        //main
    }
}
