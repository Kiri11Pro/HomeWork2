import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ширину прямоугольника");
        final double w = scan.nextDouble();
        System.out.println("Введите высоту прямоугольника");
        final double h = scan.nextDouble();
        double P = (w + h) * 2;
        double S = w * h;
        System.out.println("Периметр = " + P);
        System.out.println("Площадь = " + S);
    }
}
