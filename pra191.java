import java.util.Collections;
import java.lang.annotation.Target;
import java.util.ArrayList;
public class pra191 {
    public static void main(String[] args){
        //main
        ArrayList<String> CityA = new ArrayList<>();
        ArrayList<String> CityB= new ArrayList<>();

        CityA.add("Sophia");
        CityA.add("Emma");
        CityA.add("Olivia");

        CityB.add("Liam");
        CityB.add("Noah");
        CityB.add("Ava");

        ArrayList<String> FinalList = new ArrayList<>(CityA);
        FinalList.addAll(CityB);

        FinalList.removeLast();

        System.out.println(CityA);
        System.out.println(CityB);
        System.out.println(FinalList);

        String target = "Sophia";
        if(FinalList.contains(target)){
            int index = FinalList.indexOf(target);
            System.out.println("Index no "+index +","+ target+" is ready to dance");
        }else{
            System.out.println(target+" is not in the competition");
        }
    }
}
