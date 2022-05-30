import java.util.Scanner;

public class Delivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть кількість клієнтів, яким треба доставити товар : ");
        int deliveryNum = scan.nextInt();
        int counter = 1;

        do {
            deliveryNum *= counter--;
        }while (counter > 0);


        System.out.println("Машина повинна здійснити " + deliveryNum  + " доставки!");
    }
}
