import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите рост");
        final int height = scan.nextInt();
        System.out.println("Введите вес");
        final int weight = scan.nextInt();
        if (weight == height - 110)
            System.out.println("Ваш вес идеален");
        else if (weight < height - 110)
            System.out.println("Вам надо набрать вес");
        else
            System.out.println("Вам надо сбросить вес");
    }
}
