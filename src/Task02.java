import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        System.out.println("Задание 2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк треугольника: ");
        int rous = scanner.nextInt();

        // Заполненный треугольник
        for (int i = 0; i < rous; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k < rous; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        // Пустой треугольник
        for (int i = 0; i < rous; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k < rous; k++) {
                if (i == 0 || k == i || k == rous - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
