import java.io.IOException;

class StudentData{
    String name;
    String id;
    String dept;
    void savaStudentData(String name,String id,String dept)throws IOException{
        if(name == null || name.trim().isEmpty() || id == null || id.trim().isEmpty() || dept == null || dept.trim().isEmpty()) {
            throw new IOException("name ,id , dept cant be negative");
        }else{
            System.out.println("Name is "+name+" id: "+id+" dept "+dept);
        }
    }
}
public class try1 {
    public static void main(String[] args) {
        StudentData sd = new StudentData();

        try{
            sd.savaStudentData("Masud", "SWE-001", "Software Engineering");
            sd.savaStudentData("", "SWE-002", "Software Engineering");

        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
