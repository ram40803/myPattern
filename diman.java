import java.util.Scanner;

public class diman {
    public static void main(String[] args){
        System.out.println("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = -3*n ; i <= 3*n ; i++){
            int mi = i < 0 ? -i : i;
            
            for(int j = -3*n ; j <= 3*n - mi ; j++){
                int mj = j < 0 ? -j : j;
            
                if(mi + mj < 3*n - 1){
                    if((mi + mj)%3 == 0)
                        System.out.print(((mi + mj)/3 + 1));
                    else
                        System.out.print(" ");
                }
                else if (mi + mj == 3*n){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}