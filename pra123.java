

class BankAccount {
    private int accNo;
    private String name;
    private double bal;

    BankAccount(int accNo, String name, double bal) {
        this.accNo = accNo;
        this.name = name;
        if(bal<0){
            throw new IllegalArgumentException("balance cant be negative");
        }
        this.bal = bal ;
    }

    void deposit(double amount) {
        bal += amount;
        System.out.println("You are Deposited: "+amount);
    }

    void withdraw(double amount) {
        if (amount <= bal) {
            bal -= amount;
             System.out.println("You are withdrawning: "+amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void display() {
        System.out.println("\n--- Accont Deatiles ---");
        System.out.println("account no: "+accNo);
        System.out.println("Name:"+name);
        System.out.println("Balance: "+bal);
    }

}

public class pra123 {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
       // System.out.print("Enter account number: ");
      //  int accNo =sc.nextInt();
        //sc.nextLine();

        //System.out.print("Enter acc holder name: ");
       // String name = sc.nextLine();

       // System.out.print("Enter initial balance: ");
       // double bal = sc.nextDouble();

        //BankAccount acc = new BankAccount(accNo,name, bal);
        BankAccount b1 = new BankAccount(101, "Masud",12345);

        b1.deposit(2000);
        b1.display();


       // System.out.print("Emter deposit amount: ");
       // acc.deposit(sc.nextDouble());

       // System.out.print("enter withdraw amount: ");
        //acc.withdraw(sc.nextDouble());
        
        
        //acc.display();

       // sc.close();
    }
}
