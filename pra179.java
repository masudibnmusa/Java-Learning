class MyException extends Exception{
    public MyException(String message){
        super(message);
    }
}
interface Transection {
    void sendMoney(int amount)throws MyException;
    void cashIn(int amount) throws MyException;
    void cashOut(int amount) throws MyException;
}
abstract class Account{
    private int acc;
    private int bal;
    Account(int acc,int bal)throws MyException{
        setAcc(acc);
        setBal(bal);
    }
    public void setAcc(int acc) throws MyException{
        if(acc<0){
            throw new MyException("Acco No cant be zero!");
        }
        this.acc = acc;
    }
    public void setBal(int bal)throws MyException {
        if(bal<0){
            throw new MyException("Initailal balance cant be negative!");
        }
        this.bal = bal;
    }
    public int getAcc() {
        return acc;
    }
    public int getBal() {
        return bal;
    }
    void checkBalance(){
        System.out.println("Main Balance : "+getBal());
    }
    void accDetails(){
        System.out.println("Acc No : "+getAcc());
    }
    void updateBalance(int bal){
        this.bal = bal;
    }
}
class SavingAccount extends Account implements Transection{
    SavingAccount(int acc,int bal) throws MyException{
        super(acc, bal);
    }
    @Override
    void checkBalance() {
        super.checkBalance();
    }
    @Override
    void accDetails() {
        super.accDetails();
    }
    @Override
    public void cashIn(int amount)throws MyException {
        if(amount<=0){
            throw new MyException("amount cant be negative or zero !");
        }
        updateBalance(getBal()+amount);
        System.out.println("CashIn Successfully!");
    }
    @Override
    public void cashOut(int amount)throws MyException {
        if(amount<=0){
            throw new MyException("Amount cant be negative or zero !");
        }
        updateBalance(getBal()+amount);
        System.out.println("Cash out Successfully!");
    }
    @Override
    public void sendMoney(int amount)throws MyException {
        if(amount<=0){
            throw new MyException("Amount cant be negative or zero !");
        }
        updateBalance(getBal()+amount);
        System.out.println("Fund transfered Successfully!");
    }
}
public class pra179 { 
    public static void main(String[] args)throws MyException{
        //main
        SavingAccount a1 = new SavingAccount(12, 2000);
        a1.checkBalance();
        a1.accDetails();
        a1.cashIn(200);
        a1.cashOut(200);
        a1.sendMoney(200);
        a1.checkBalance();
        
    }
}
