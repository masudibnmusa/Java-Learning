class calculator{
    int a ;
    int b;
    calculator(int a , int b){
        this.a = a;
        this.b = b;
    }

    public int add(){
        int result = this.a+this.b;
        return result;
    }

    public int sub(){
        int result = this.a-this.b;
        return result;
    }

    public int multi(){
        int result = this.a*this.b;
        return result;
    }

    public int div(){
        int result= this.a/this.b;
        return result;
    }
}

public class pra81 {
    public static void main(String[] args){
        calculator c1 = new calculator(12,23);
        System.out.println(c1.add()); 
        System.out.println(c1.sub()); 
        System.out.println(c1.multi()); 
        System.out.println(c1.div()); 

    }
}
