import java.util.Scanner;

public class Vanshika {
  public static void main(String[] args) {
    System.out.print("enter a number:");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println();

    for (int j = n + 3; j >= -n - 3; j--) {
      for (int i = -25 - n; i <= 25 + n; i++) {
        if (Math.abs(i) < 25 + Math.abs(j) && Math.abs(j) < 4) {
          if (j + 1 == Math.abs(i + 20)) {
            System.out.print("v");
          } else if (j - 1 == -Math.abs(i + 15) || i == -15 && j == -1) {
            System.out.print("A");
          } else if ((Math.abs(i + 9) == 2 || j == -8 - i) && j > -2) {
            System.out.print("N");
          } else if (i + 1 == -Math.abs(j + 2) && j < 0
              || i + 5 == Math.abs(j) && Math.abs(j) < 2
              || i == -2 && j == 1 || i == -4 && j == -3) {
            System.out.print("S");
          } else if (Math.abs(i - 3) == 2 &&j > -2 || i == 3 && j == 1) {
            System.out.print("H");
          } else if (Math.abs(j + 1) == 2 && Math.abs(i - 9) < 3 && i % 2 == 1
              || i == 9 && j < 2) {
            System.out.print("I");
          } else if ((i - 14 == Math.abs(j - 1) || i == 13) && j > -2) {
            System.out.print("K");
          } else if (j - 1 == -Math.abs(i - 20) || i == 20 && j == -1) {
            System.out.print("A");
          } else {
            System.out.print(" ");
          }
        } else if (Math.abs(i) + Math.abs(j - (n + 3) / 2) == 3 * (n + 3) / 2 + (j > (n + 3) / 2 ? 1 : 0)
            || j - (n + 3) / 2 == Math.abs(i)
            || (Math.abs(i) + Math.abs(j - (n + 3) / 2) >= 3 * (n + 3) / 2 + (j > (n + 3) / 2 ? 1 : 0)
                || j - (n + 3) / 2 >= Math.abs(i)
                || j == n + 3)
                && Math.abs(i % 5) != Math.abs(j % 5)) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }

    sc.close();

  }
}
