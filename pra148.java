class Programming{
    String programmingName;
    String creator ;
    
    void setData(String programmingName,String creator){
        this.programmingName = programmingName;
        this.creator = creator;
    }
    void display(){
        System.out.println("Programming Name : "+programmingName);
        System.out.println("Cretor : "+creator);
    }
}
class Java extends Programming{
    double version;
    void setJavaData(double version){
        this.version = version;
    }
    @Override
    void display(){
        super.display();
        System.out.println("Version : "+version);
    }
}
class Python extends Java{
    String paradiagram;
    void setPythonData(String paradiagram){
        this.paradiagram = paradiagram; 
    }
    @Override
    void display(){
        super.display();
        System.out.println("Paradiagram : "+paradiagram);
    }
} 
public class pra148 {
    public static void main(String [] args){
        //main
        Python p = new Python();
        p.setData("Python","Van de russo");
        p.setJavaData(12.9);
        p.setPythonData("objecte oriented");
        p.display();
    }
}
