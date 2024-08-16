import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите радиус окружности");
        final double R = scan.nextDouble();
        double s = Math.PI * Math.pow(R,2);
        double l = 2 * Math.PI * R;
        System.out.print("Площадь = ");
        System.out.printf("%.2f",s);
        System.out.print("\nДлина = ");
        System.out.printf("%.2f",l);

    }
}
