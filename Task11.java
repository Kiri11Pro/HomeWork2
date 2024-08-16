import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество секунд до нового года");
        int time = scan.nextInt();
        int day = time / 86400;
        int hour = (time - day * 86400) / 3600;
        int min = (time - day * 86400 - hour * 3600) / 60;
        int sec = time - day * 86400 - hour * 3600 - min * 60;
        System.out.println("До НОВОГО ГОДА осталось \n" + day + " дней, " + hour + " часов, " + min + " минут, " + sec + " секунд");
    }
}
