import java.util.List;

class User{
    private int id;
    private String userName;
    User(int id,String userName){
        setId(id);
        setUserName(userName);
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setUserName(String userName) {
        if(userName == null || !userName.equals(userName.toLowerCase())){
            throw new IllegalArgumentException("Username must be in lowercase");
        }
        this.userName = userName;
    }
    public int getId() {
        return id;
    }
    public String getUserName() {
        return userName;
    }
    void displayInfo(){
        System.out.println("User ID   : "+getId());
        System.out.println("User Name : "+getUserName());
    }
}
class Admin extends User{
    Admin(int id,String userName){
        super(id, userName);
    }
    @Override
    void displayInfo(){
        System.out.println("Admin Info");
        super.displayInfo();
    }
}
class Teacher extends User{
    Teacher(int id,String userName){
        super(id, userName);
    }
    @Override
    void displayInfo(){
        System.out.println("Teacher Info");
        super.displayInfo();
    }
}
class Student extends User{
    Student(int id,String userName){
        super(id, userName);
    }
    @Override
    void displayInfo(){
        System.out.println("Student Info");
        super.displayInfo();
    }
}
interface Question {
    void display();
    boolean checkAnswer(String answer);
    int getMark();
}
class mcqQestion implements Question{
    private String question ;
    private List<String>options;
    private String correctAnswer;
    private int marks;

    mcqQestion(String question,List<String>option,String correctAnsewer,int marks){
        setMarks(marks);
        setOptions(option);
        setCorrectAnswer(correctAnsewer);
        setMarks(marks); 
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public void setOptions(List<String> options) {
        this.options = options;
    }
    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
    public String getQuestion() {
        return question;
    }
    public List<String> getOptions() {
        return options;
    }
    public String getCorrectAnswer() {
        return correctAnswer;
    }
    public int getMarks() {
        return marks;
    }
}
public class pra171 {
    public static void main(String[]args){
    }
}
