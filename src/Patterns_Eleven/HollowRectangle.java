package Patterns_Eleven;
import java.util.Scanner;

public class HollowRectangle {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many columns do you want: ");
        int no_of_columns = sc.nextInt();

        for(int i=1;i<=no_of_columns;i++){
            for(int j=1;j<=no_of_columns;j++){
                if(i==1 || i == no_of_columns){
                    System.out.print("* ");
                }else{
                    if(j==1 || j== no_of_columns){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
