class Account{
    private int accNum;
    private double bal ;

    Account(int accNum,double bal){
        this.accNum = accNum;
        this.bal = bal;
    }
    public void displayAccAndBal(){
        System.out.println("Account Number:"+accNum);
        System.out.println("Main balance : "+bal);
    }
    public void deposite(double ammount){
        if (ammount <=0){
            System.out.println("Invalid ammount");
        }else{
            bal +=ammount;
            System.out.println("Deposited ammount is : "+ammount);
        }
    } 
    public double getBal(){
        return bal;
    }
    public int getAccnum(){
        return accNum;
    }

}
class SavingAccount extends Account{
    double interestRate;
    SavingAccount(int accNum,double bal,double interestRate){
        super(accNum, bal);
        this.interestRate = interestRate;
    }
    public void calculateInterest(){
        double interest = getBal()*(interestRate/100);
        System.out.println("Interest is : "+interest);
    }
    public void displayAccDetails(){
        System.out.println("The account number is : "+getAccnum());
        System.out.println("Main balance is : "+getBal());
    }
}
public class pra101 {
    public static void main(String[] args) {
        //main.....
        SavingAccount ac1 = new SavingAccount(10001, 12000, 8);
        ac1.calculateInterest();
        ac1.displayAccAndBal();
        ac1.deposite(2000);
        ac1.displayAccAndBal();
    }
}
