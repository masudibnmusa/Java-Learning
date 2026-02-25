class Spell{
    String name;
    String effect;
    int power;
    Spell(){
        name = "Unknown";
        effect = "Mystrous";
    }
    Spell(String name,String effect){
        this.name = name;
        this.effect = effect;
    }
    void printSpell(){
        System.out.println(name+" spell is "+effect);
    }
}
public class pra149 {
    public static void main(String[] args){
        Spell expelliarmus = new Spell();
        Spell lumos = new Spell("Lumos","Illuminating");
        expelliarmus.printSpell();
        lumos.printSpell();
    }
}
