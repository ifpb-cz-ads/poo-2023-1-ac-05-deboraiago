import java.util.Scanner;

public class BMExercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int y;

        System.out.print("Escolha um número: ");
        x = sc.nextInt();

        y = x;

        while (y > 1) {
            if (y % 2 == 0) {
                y = y / 2;
            } else {
                y = 3 * y + 1;
            }
            System.out.print(y + " -> ");
        }

        sc.close();

    }
}
