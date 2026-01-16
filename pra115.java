abstract  class Account {
    protected int accNo;
    protected String name ;
    protected double bal;
    Account(int accNo,String name,double bal){
        this.accNo = accNo;
        this.name = name ;
        if (bal<0){
            throw new IllegalArgumentException("something went wrong");
        }
        this.bal = bal ;
    }
    void checkBalance(){
        System.out.println("Current Balance is : "+bal);
    }
    void withdraw(double ammount){
        if (ammount>0){
            bal -=ammount;
            System.out.println("Widrawed ammount is : "+ammount);
        }else{
            System.err.println("Ammount must be greater than 1");
        }
    }
    void deposit(double ammount){
        if (ammount>0){
            bal +=ammount;
            System.out.println("Deposited ammount is : "+ammount);
        }else{
            System.err.println("Ammount must be posistve!");
        }
    }

}
class SavingAccount extends Account{
    SavingAccount(int accNo,String name,double bal){
        super(accNo, name, bal);
    }
    @Override
    void checkBalance(){
        System.out.println("Current balance is : "+ bal);
    }
    @Override
    void withdraw(double ammount){
        super.withdraw(ammount);
    }
    @Override
    void deposit(double ammount){
        super.deposit(ammount);
    }

}
class CurrentAccount extends Account{
    CurrentAccount(int accNo,String name,double bal){
        super(accNo, name, bal);
    }
    @Override
    void checkBalance(){
        super.checkBalance();
    }
    @Override
    void deposit(double ammount){
        super.deposit(ammount);
    }
    @Override
    void withdraw(double ammount){
        super.withdraw(ammount);
        
    }
}
public class pra115 {
    public static void main(String[]args){
        //main
        Account[] accounts = {
            new CurrentAccount(112, "Masud", 120000),
            new SavingAccount(133, "Masud", 200000)

        };
        for (Account a1 : accounts){
            a1.checkBalance();
            a1.deposit(20000);
            a1.withdraw(1000);
            a1.checkBalance();
        }
    }
}
