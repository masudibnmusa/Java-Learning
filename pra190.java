interface Teacher{
    void eating();
    void sleeping();
}
interface Assistance extends Teacher{
    void assisting();
}
interface Student{
    void working();
}
class Human implements Assistance ,Student{
    @Override
    public void eating(){
        System.out.println("Teacher is eating...");
    }
    @Override
    public void sleeping() {
        System.out.println("Teacher is sleeping...");
    }
    @Override
    public void assisting() {
        System.out.println("Assistant is assisting...");
    }
    @Override
    public void working() {
        System.out.println("Studnet is working...");
    }
}
public class pra190 {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.eating();
        h1.sleeping();
        h1.assisting();
        h1.working();
    }
}
