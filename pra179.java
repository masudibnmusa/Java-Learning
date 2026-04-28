class MyException extends Exception{
    public MyException(String message){
        super(message);
    }
}
interface Transection {
    void sendMoney(int amount);
    void cashIn(int amount);
    void cashOut(int amount);
}
class Account{
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
}
public class pra179 { 
    public static void main(String[] args)throws MyException{
        //main
        Account a1 = new Account(12, 2000);
        a1.checkBalance();
        a1.accDetails();
    }
}
