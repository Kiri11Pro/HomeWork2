import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        double x = scan.nextDouble();
        double y = Math.round(x);
        if ((x - y) != 0)
        System.out.println("Число имеет вещественную часть");
        else
            System.out.println("Число не имеет вещественной части");

    }
}
