public class Figures {
    public static void main(String[] args) {
//        Прямокутник

        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 14; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

//       Прямокутний трикутник
        System.out.println();

        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

//     Рівнобедриний трикутник
        System.out.println();

        int num = 10;
        for(int i = 0; i<num; i++)
        {
            for(int j = 0; j < num-i-1; j++)
            {
                System.out.print(" ");
            }
            for(int k=0; k < (i*2+1); k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
//     Ромб
        System.out.println();

// Верхня частина ромба
        for (int i = 1; i <= 5; i += 2) {
            for (int j = 5; j >= i; j -= 2) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" ∗");
            }
            System.out.println();
        }

// Друга чатина ромба

        for (int i = 1; i <= 5; i += 2) {
            for (int j = 1; j <= i; j += 2) {
                System.out.print("  ");
            }
            for (int k = 5; k >= i; k--) {
                System.out.print(" ∗");
            }
            System.out.println();
        }

    }
}

