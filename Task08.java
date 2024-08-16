import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите время между вспышкой и раскатом грома в секундах");
        final int t = scan.nextInt();
        final  int V = 335;
        int S = V * t;
        System.out.println("Расстояние до места удара молнии = " + S + 'м');
    }
}
