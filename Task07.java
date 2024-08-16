import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите величину вклада");
        double dep = scan.nextDouble();
        System.out.println("Введите годовой процент");
        double pc = scan.nextDouble();
        double pc1 = dep / 100 * pc;
        double pc2 = (dep + pc1) / 100 * pc;
        double sum = dep + pc1 + pc2;
        System.out.println("Сумма вклада через 2 года = " + sum);
    }
}
