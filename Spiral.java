import java.util.Scanner;

public class Spiral {
    public static void main(String[] args) {
        int r, ns, n = 0;
        System.out.print("enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        r = (int) Math.ceil(Math.sqrt(num));
        int d = 0;
        System.out.println();
        for (int i = num; i > 0; i = i / 10) {
            d++;
        }
        for (int i = 0; i < r; i++) {

            for (int j = 0; j < r; j++) {
                if (j <= i - 1 && i <= r - 1 - j) {
                    n = num - (int) Math.pow(r - 2 * (1 + j), 2) + j + 1 - i;
                } else if (i == 0) {
                    n = j + 1 - r * r + num;
                } else if (j >= r - i && i < j) {
                    n = num - (int) Math.pow(1 - r + 2 * j, 2) + i - j;
                } else if (i < Math.ceil(r / 2) + r % 2) {
                    n++;
                } else if (i >= Math.ceil(r / 2) + r % 2) {
                    n--;
                }
                if ((j < r * r - num && i == 0) || (i <= r * r - num - r && j == r - 1)) {
                    System.out.print(" ");
                } else {
                    System.out.print(n);
                }
                ns = d;
                for (int k = n; 10 <= k; k = k / 10) {
                    ns--;
                }
                for (int k = 0; k < ns; k++) {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
        sc.close();
    }
}