import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How much length of characters you want: ");
        int n = sc.nextInt();
        char alphabet = 'A';
        for(int i =1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(alphabet + " ");
                alphabet++;
            }
            System.out.println();
        }
    }
}