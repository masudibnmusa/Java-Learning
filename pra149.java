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
    Spell(String name){
        this.name = name;
        effect = "Frezzing";
    }
    void updateInfo(String name){
        this.name = name;
    }
    void updateInfo(int power){
        this.power = power;
    }
    void updateInfo(String name,String effect){
        this.name = name;
        this.effect = effect;
    }
    void printSpell(){
        if(power>0){
            System.out.println(name+" spell requires "+power+" wands of power");
        }else{
            System.out.println(name+" spell is "+effect);
        }
    }
}
public class pra149 {
    public static void main(String[] args){
        Spell expelliarmus = new Spell();
        Spell lumos = new Spell("Lumos","Illuminating");
        Spell petrificus = new Spell("Petrificus Tolas");
        
        expelliarmus.printSpell();
        lumos.printSpell();
        petrificus.printSpell();

        expelliarmus.updateInfo("Stupefy");
        lumos.updateInfo(5);
        petrificus.updateInfo("imperico", "Controlling");

        expelliarmus.printSpell();
        petrificus.printSpell();
        lumos.printSpell();
    }
}
