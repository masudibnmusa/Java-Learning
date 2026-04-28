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
}
public class pra179 {
    public static void main(String[] args) {
        //main
    }
}
