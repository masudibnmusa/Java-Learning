

    class student{
        String name ;
        int roll;
        float marks;

        //constructor ;
        student(String name,int roll,float marks){
            
            this.name = name ;
            this.roll = roll ;
            this.marks = marks; 
            
        }

        //methods;
        public void dispalyInfo(){
            System.out.println(this.name);
            System.out.println(this.roll);
            System.out.println(this.marks);
        }


    }
    public class pra80 {
    public static void main(String[] args){
        student s1 = new student("Masud", 1, 98);
        s1.dispalyInfo();
        System.out.println("----------------");
        student s2 = new student("Rakib", 2, 99);
        s2.dispalyInfo();
    }
}
