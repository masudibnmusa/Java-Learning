import java.util.ArrayList;

public class pra182 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Masud");
        list.add("Mahim");
        list.add("Manna");
        list.add("Mamun");
        list.add("Mama");
        for (String lst : list){
            System.out.println(lst);
        }
        System.out.println();
        list.clear();
        for (String lst : list){
            System.out.println(lst);
        }
        System.out.println();

        ArrayList<Integer> num = new ArrayList<>();
        num.add(10); 
        num.add(12); 
        num.add(13); 
        num.add(14); 
        num.add(15);
        for(int set : num){
            System.out.println(set);
        }
        System.out.println();

        num.addFirst(9);
        num.add(1, 11);
        num.addLast(16); 
        for(int set : num){
            System.out.println(set);
        }
        System.out.println();
        num.removeLast();
        num.remove(0); 
        for(int set : num){
            System.out.println(set);
        }
    }
}
