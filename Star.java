import java.util.Scanner;

public class Star {

    public static void printNSpace(int n){
        for(int i = 0 ; i < n ; i++){
            System.out.print("  ");
        }
    }

    public static void printNumber(int n){
        if(n%2 == 0)
            System.out.print(" " + n/2);
        else
            System.out.print("  ");
    }

    public static void main(String[] args){
        System.out.print("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int n = 2*sc.nextInt() + 1;

       for(int i = 2; i <= 2*n; i++){
            if(i <= n)
                printNSpace(2*n - 1);
            else
                printNSpace(2*(2*n - i));

            for(int j = 2*n; j < 2*i - 1; j++){
                printNumber(i - n);
            }

            for(int j = 0; j < i/2; j++){
                printNumber(n - j);
            }
            System.out.println();
       }

       for(int i = 2*n; i >= 2; i--){
            printNSpace(2*n - i/2 - 1);

            for(int j = i/2 - 1; j >= 0; j--){
                printNumber(n - j);
            }

            for(int j = 2*n; j < 2*i - 1; j++){
                printNumber(i - n);
            }
            System.out.println();
       }
    }
}