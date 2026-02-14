class Student{
    int id;
}
public class pra139 {
    public static void main(String[] args){
        //main
        int [] a = new int[20];
        a [0] = 58;
        a [1] = 20;
        System.out.println(a[1]);

        Student[] students = new Student[50];
        students[0] = new Student();
        students[0].id = 101;
        System.out.println(students[0].id);
    }
}
