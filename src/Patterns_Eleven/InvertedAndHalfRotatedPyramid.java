package Patterns_Eleven;

import java.util.Scanner;

public class InvertedAndHalfRotatedPyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many columns do you want: ");
        int no_of_columns = sc.nextInt();

        for(int i=1;i<=no_of_columns;i++){
            int no_of_spaces = no_of_columns-i;
            for(int j=1;j<=no_of_spaces;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

