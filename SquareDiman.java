import java.util.Scanner;

public class SquareDiman {
    public static void main(String[] args) {
        System.out.println("enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = n / 2 + n % 2 - 1;
        int[] arr = new int[l + 1];
        arr[0] = 5;

        for (int i = 1; i <= l; i++) {
            arr[i] = 2 * arr[i - 1] - 1;
        }

        for (int i = arr[l] - 1; i >= -arr[l] + 1; i--) {
            int a = l;
            for (int j = -arr[l] + 1; j <= arr[l] - 1; j++) {
                if ( a < l && Math.abs(i) + Math.abs(j) == arr[a + 1] - 1) {
                    a++;
                }
                if (Math.abs(i) + Math.abs(j) == arr[a] - 1) {
                    System.out.print(" *");
                } else if ((Math.abs(i) == arr[a] - 1 || Math.abs(j) == arr[a] - 1)
                        && (a != l || n % 2 == 0)) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
                if (a > 0 && Math.abs(i) + Math.abs(j) == arr[a] - 1 && j <= -arr[0] + 1) {
                    a--;
                }
            }
            System.out.println();
        }
    }
}
