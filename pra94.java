class BankAcount{
    int accountNumber;
    String accountHolder;
    double balance;

    BankAcount(int accountNumber,String accountHolder,double balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposite(double ammount){
        if (ammount < 0){
            System.out.println("invalid ammount");
        }else{
            balance += ammount;
            System.out.println("Deposited ammount is : "+ammount);
        }
    }
    public void widraw(double ammount){
        if (ammount > balance){
            System.out.println("Not enough balance");
        }else{
            balance -=ammount;
            System.out.println("Widrawed ammount is : "+ammount);
        }
    }
    public void getBalance(){
        System.out.println("Current balance is : "+balance);
    }
}
public class pra94 {
    public static void main(String[] args){
        BankAcount ac1 = new BankAcount(12334, "Masud Ibn Musa", 12000);
        ac1.getBalance();
        ac1.deposite(5000);
        ac1.widraw(2000);
        ac1.getBalance();
    }
}
