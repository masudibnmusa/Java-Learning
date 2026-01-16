abstract class Person {
    protected String name ;
    protected int age;
    Person(String name , int age){
        this.name = name;
        this.age = age;
    }
    abstract void displayinfo();
}
class Doctor extends Person{
    private String speciality;
    private double confee;

    Doctor(String name ,int age,String speciality,double confee){
        super(name, age);
        this.speciality = speciality;
        this.confee = calConfee();
    }
    private double calConfee(){
        switch (speciality.toLowerCase()) {
            case "cardio":
                return 1500;
            case "newro":
                return 1800;
            case "general":
                return 800;
            default:
                return 100;
        }
    }
    public double getConfee(){
        return confee;
    }
    @Override
    void displayinfo(){
        System.out.println("Dovtor's name: "+name);
        System.out.println("Age : "+age);
        System.out.println("Specilization : "+speciality);
        System.out.println("Consultation fee : "+confee);
    }
}
class Patient extends Person{
    private String disease;
    Patient(String name, int age, String disease){
        super(name, age);
        this.disease = disease;
    }
    @Override
    void displayinfo(){
        System.out.println("Patient name : "+name );
        System.out.println("patient age : "+age);
        System.out.println("Disease : "+disease);
    }
}
class Appointment{
    private Doctor doctor;
    private Patient patient;
    private double confee;

    Appointment(Doctor doctor,Patient patient){
        this.doctor = doctor;
        this.patient = patient ;
        if (confee <0){
            System.err.println("Invalid");
        }else{
            this.confee = doctor.getConfee();
        }

    }
    public void displayApp(){
        System.out.println("-------app infoo-------");

        Person p1 = doctor;
        Person p2 = patient;

        p1.displayinfo();
        System.out.println();
        p2.displayinfo();
        
        System.out.println("Total Confee: "+confee);
    }
}
public class pra111 {
    public static void main(String[] args){
        //main....
        Doctor d1 = new Doctor("DR. tayeb", 53, "newro", 1200);
        Patient p1 = new Patient("Masud", 21, "Short time memory lost");
        Appointment app1 = new Appointment(d1, p1);
        app1.displayApp();
    }
}