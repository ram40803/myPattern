import java.util.Scanner;

public class Square {
    public static void main(String[] args){
        System.out.print("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int n = 2 * sc.nextInt();

        for(int i = 1-n; i < n; i++){
            int mi = i < 0 ? -i : i;

            for(int j = n; j > mi; j--){
                if(j%2 == 0)
                    System.out.print("  ");
                else
                    System.out.print(" " + (j/2 + 1));
            }

            for(int j = 0; j < 2*mi; j++){
                if((mi + 1)%2 == 0)
                    System.out.print("  ");
                else
                    System.out.print(" " + ((mi + 1)/2 + 1));
            }

            for(int j = mi + 2; j <= n; j++){
                if(j%2 == 0)
                    System.out.print("  ");
                else
                    System.out.print(" " + (j/2 + 1));
            }

            System.out.println();
        }
    }
}