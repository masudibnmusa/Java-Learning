class student{
    String name;
    String age;
    String phone;

    public void printDeatils(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.phone);
    }
}

public class pra78 {
    public static void main(String[] args){

        student s1 = new student();
        s1.name = "Masud";
        s1.age = "12";
        s1.phone = "1234567";

        s1.printDeatils();

        System.out.println("--------------");

        student s2 = new student();

        s2.name = "Tayeb";
        s2.age = "23";
        s2.phone = "01713504283";
        s2.printDeatils();
    }    
}
