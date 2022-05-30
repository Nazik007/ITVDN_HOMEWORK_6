import java.util.Scanner;

public class Delivery {
    public static void main(String[] args) {
        int i = 1, factorial = 1, number;
        System.out.println("Введіть кількість клієнтів, яким треба доставити товар :");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        while(i <= number) {
            factorial = factorial * i;
            i++;
        }
        System.out.println("Кількість маршрутів, які має здійснити машина є : " + factorial);
    }
}
