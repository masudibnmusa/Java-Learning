class Account{
    private int accNum;
    private double bal;

    Account(int accNum,double bal){
        this.accNum = accNum;
        this.bal = bal;
    }
    //getter
    public int getAccnum(){
        return accNum;
    }
    public double getBal(){
        return bal;
    }
    //setter
    public void setAccnum(int accNum){
        this.accNum = accNum;
    }
    public void setget(double bal){
        if (bal<=0){
            System.out.println("invalid ammount");
        }else{
            this.bal = bal;
        }
    }
    public void calculateInterest(double percent){
        double interest = bal*(percent/100);
        System.out.println("Interest is : "+interest);
    }
}
class SavingAccount extends Account{
    SavingAccount(int accNum,double bal){
        super(accNum, bal);
    }
    public void calculateInterest(double percent){
        double interest = getBal()*(percent/100);
        System.out.println("Highest Interest for Saving Account is : "+interest);
    }
}
class CurrentAccount extends Account{
    CurrentAccount(int accNum,double bal){
        super(accNum, bal);
    }
    public void calculateInterest(double percent){
        double interest = getBal()*(percent/100);
        System.out.println("lowest Interest for Current Account is : "+interest);
    }
}
public class pra105{
    public static void main(String[] args) {
        //main...
        Account ac1 = new SavingAccount(111,22033);
        Account ac2 = new CurrentAccount(122, 33334);
        ac1.calculateInterest(7);
        ac2.calculateInterest(5);
    }
}