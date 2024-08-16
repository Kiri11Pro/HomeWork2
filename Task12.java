import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество учеников");
        int n = scan.nextInt();
        int pie100 = 2 * n;
        double pie60 = 0.6 * n * 2 + 0.4 * n;
        double pie1 = 0.01 * n * 2 + 0.99 * n;
        double milk = 200.0 / 900.0;
        double milk100 = Math.ceil (n * milk);
        double milk60 = Math.ceil(n * 0.6 * milk);
        double milk1 = Math.ceil(n * 0.01 * milk);
        System.out.println("Для школы, где у 100% учеников вес меньше 30 кг\n" + "Пирожков " + pie100 + "\nУпаковок молока " + milk100);
        System.out.println("Для школы, где у 60% учеников вес меньше 30 кг\n" + "Пирожков " + pie60 + "\nУпаковок молока " + milk60);
        System.out.println("Для школы, где у 1% учеников вес меньше 30 кг\n" + "Пирожков " + pie1 + "\nУпаковок молока " + milk1);
    }
}
