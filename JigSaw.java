public class JigSaw{
    int instance = 3;
    static double check = 10.5;
    public void puzzle0(){
        System.out.println(instance);
        System.out.println(check);
    }
    public void puzzle1(){
        int rubics = 50;
        check = 15.5;
        instance = 6;
        System.out.println(rubics);
        System.out.println(instance);
    }
}
public class Sudoku extends JigSaw{
    public void puzzle2(){
        System.out.println(instance);
        System.out.println(check);
    }
    public static void main(String[] args) {
        Sudoku solve1 = new Sudoku();
        Sudoku solve2 = new Sudoku();
        solve1.puzzle0();
        solve2.puzzle1();
        solve1.puzzle2();
    }
}

