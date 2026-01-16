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

}
public class pra115 {
    public static void main(String[]args){
        //main
    }
}
