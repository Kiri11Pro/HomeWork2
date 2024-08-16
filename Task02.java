public class Task02 {
    public static void main(String[] args) {
        int n = 678;
        int a = n/100;
        int b = (n-a*100)/10;
        int c = n-a*100-b*10;
        System.out.println("Сумма цифр = " + (a+b+c));
    }
}
