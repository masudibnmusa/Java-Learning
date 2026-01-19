abstract class Person {
    protected String name;
    protected int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Polymorphic method
    abstract void displayInfo();
}
class Doctor extends Person {
    private String specialization;
    private double consultationFee;

    Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
        this.consultationFee = calculateFee();
    }

    private double calculateFee() {
        switch (specialization.toLowerCase()) {
            case "cardiologist":
                return 1500;
            case "neurologist":
                return 1800;
            case "general":
                return 800;
            default:
                return 1000;
        }
    }

    public double getConsultationFee() {
        return consultationFee;
    }

    @Override
    void displayInfo() {
        System.out.println("Doctor Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Specialization: " + specialization);
        System.out.println("Consultation Fee: " + consultationFee);
    }
}
class Patient extends Person {
    private String disease;

    Patient(String name, int age, String disease) {
        super(name, age);
        this.disease = disease;
    }

    @Override
    void displayInfo() {
        System.out.println("Patient Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Disease: " + disease);
    }
}

class Appointment {
    private Doctor doctor;
    private Patient patient;
    private double consultationFee;

    Appointment(Doctor doctor, Patient patient) {
        this.doctor = doctor;
        this.patient = patient;
        this.consultationFee = doctor.getConsultationFee();

        if (consultationFee <= 0) {
            throw new IllegalArgumentException("Invalid consultation fee");
        }
    }

    public void displayAppointment() {
        System.out.println("\n--- Appointment Details ---");

        Person p1 = doctor;   
        Person p2 = patient;  

        p1.displayInfo();
        System.out.println();
        p2.displayInfo();

        System.out.println("\nTotal Fee: " + consultationFee);
    }
}
public class pra110 {
    public static void main(String[] args) {

        Doctor d1 = new Doctor("Dr. Ahmed", 45, "Cardiologist");
        Patient p1 = new Patient("Masud", 22, "Heart Problem");

        Appointment app = new Appointment(d1, p1);
        app.displayAppointment();


        p1.displayInfo();
        
    }
}

