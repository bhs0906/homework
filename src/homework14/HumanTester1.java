package homework14;

public class HumanTester1 {

    public static void main(String[] args) {
        Human1 gildong = new Human1("길동", 170, 60, new Day(1975, 3, 12));
        Human1 chulsu = new Human1("철수", 166, 72, new Day(1987, 10, 7));
		
        System.out.println("gildong = " + gildong);
        System.out.println("chulsu = " + chulsu);
    }
}