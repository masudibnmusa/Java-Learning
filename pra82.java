class bankAcount{
    private String accNo ;
    private String accHolder ;
    private double bal ;

    bankAcount(String accNo,String accHolder,double bal){
        this.accNo = accNo;
        this.accHolder = accHolder;
        this.bal = bal;
    }

    public void deposite(double amount){
        if (amount>0){
            this.bal +=amount;
            System.out.println("Deposited balance is: "+amount);
        }else{
            System.out.println("Invalid amount");
        }

    }

    public void withdraw(double amount){
        if (amount <0){
            System.out.println("not enogh money");
        }else{
            this.bal -= amount;
            System.out.println("Withdrawed amount is:"+amount);
        }
    }

    public void display(){
        System.out.println("Current balance is :"+this.bal);
    }
}
public class pra82 {
    public static void main(String[] args){
        bankAcount ac1 = new bankAcount("1234", "Masud", 12000);
        ac1.display();

        ac1.deposite(5000);
        ac1.display();

        ac1.withdraw(3000);
        ac1.display();
    }
}
