interface Printer{
    void print();
}
interface Scanner{
    void scan();
}
abstract class Machine{
    abstract void start();
}
class PhotoCopier extends Machine implements Printer,Scanner{
    @Override
    public void start(){
        System.out.println("Starting.....");
    }
    @Override
    public void print(){
        System.out.println("Pritning.....");
    }
    @Override
    public void scan(){
        System.out.println("Scanning.....");
    }
}
class BasicPrinter extends Machine implements Printer{
    @Override
    public void start(){
        System.out.println("Starting.....");
    }
    @Override
    public void print(){
        System.out.println("Printing.....");
    }
}
public class pra153 {
    public static void main (String[]args){
        //main
    }
}
