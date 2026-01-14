class Student{
   int id;
   String name;
   double marks;

   Student(int id,String name,double marks){
      this.name = name ;
      this.id = id;
      this.marks = marks;
   }

   public void display(){
      System.out.println("The id of the student is:"+id);
      System.out.println("The name of the student is:"+name);
      System.out.println("The mark the student is:"+marks);
   }
}

public class pra91{
   public static void main(String[] args) {
      Student s1 = new Student(171, "Masud", 98.5);
      s1.display();
   }
} 