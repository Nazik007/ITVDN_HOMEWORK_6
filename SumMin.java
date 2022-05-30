import java.util.Scanner;

public class SumMin {
    public static void main(String[] args) {

//      Завдання 2, де потрібно вивести суму всіх цифр, які знаходяться між цифрами

        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть число А : ");
        int A = scan.nextInt();
        System.out.println("Введіть число В, яке буде більшим за число А : ");
        int B = scan.nextInt();
        int sum = 0;

        for (int i = A; i < B; i++) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println();

//      Друга частина завдання - де треба вивести всі непарні цифри між даними цифрами

        System.out.println("Знову введіть нове число С : ");
        int C = scan.nextInt();
        System.out.println("Тепер введіть число D , яке буде більшим за число С : ");
        int D = scan.nextInt();

        for (int i = C; i < D; i++) {
            if (i % 2 != 0) {
                System.out.println(i);

            }

        }
    }
}


