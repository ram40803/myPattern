import java.util.Scanner;

public class Ram {

    public static void main(String args[]) {
        System.out.print("enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = 3 * sc.nextInt();
        System.out.println();

        for (int i = 0; i <= n / 2; i++) {
            for (int j = 0; j <= 2 * n; j++) {
                if ((j == 2 * n || j == 3 * n / 2) && i >= n / 4
                        || j > 3 * n / 2 && j < 2 * n && (j + i == 7 * n / 4 || j - i == 7 * n / 4 + 1)) {
                    System.out.print("ram ");
                } else {
                    System.out.print("    ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i < 3 * n / 4; i++) {
            System.out.print("    ");
        }
        for (int i = 3 * n / 4; i <= 2 * n; i++) {
            System.out.print("ram ");
        }
        for (int i = 2 * n; i < 5 * n / 2; i++) {
            System.out.print("    ");
        }
        for (int i = 0; i < 3 * n + 3; i++) {
            System.out.print("ram ");
        }
        System.out.println();

        for (int i = 0; i < 3 * n; i++) {

            for (int j = 0; j <= 5 * n / 2; j++) {
                if (j == 2 * n || j == 3 * n / 2 || (j == 3 * n - i - n % 2 || j == i && j > 3 * n / 8) && j < 3 * n / 2
                        || j + i == 3 * n / 4 && j >= 3 * n / 8
                        || (j - i == 3 * n / 4 || j + i == 3 * n / 2) && j <= 9 * n / 8) {
                    System.out.print("ram ");
                } else {
                    System.out.print("    ");
                }
            }

            for (int j = 0; j < n; j++) {
                if ((i == j || i + j == 2 * n) && j <= 2 * n / 3 || j == 2 * n / 3 && i > 2 * n / 3 && i < 4 * n / 3
                        || i - j == 2 * n) {
                    System.out.print("ram ");
                } else {
                    System.out.print("    ");
                }
            }
            for (int j = 0; j < 3; j++) {
                if (j == 1) {
                    System.out.print("ram ");
                } else {
                    System.out.print("    ");
                }
            }
            for (int j = 0; j < 2 * n; j++) {
                if (j == 2 * n - 1 || i == 3 * n / 2 || (j == 3 * n / 4 || i - j == 3 * n / 2) && i < 9 * n / 4) {
                    System.out.print("ram ");
                } else {
                    System.out.print("    ");
                }
            }
            System.out.println();
        }

        System.out.println();
    }
}
