package TwoDArrays;

public class SpiralMatrix {
    public static  void  main (String[] args){
        int elements[][] = {{1,2,3,4,5} , {6,7,8,9,10} , {11,12,13,14,15} , {16,17,18,19,20} , {21,22,23,24,25}};

        int top = 0 , bottom = elements.length - 1 , left = 0 , right = elements[0].length - 1;
        int direction = 1;

        while (top <= bottom && left <= right){
            if(direction == 1){
                for (int i = left; i <= right; i++) {
                    System.out.print(elements[top][i] + " ");
                }
                top++;
                direction = 2;
            } else if (direction == 2){
                for (int i = top; i <= bottom; i++) {
                    System.out.print(elements[i][right] + " ");
                }
                right--;
                direction = 3;
            } else if (direction == 3){
                for (int i = right; i >= left; i--) {
                    System.out.print(elements[bottom][i] + " ");
                }
                bottom--;
                direction = 4;
            } else if (direction == 4){
                for (int i = bottom; i >= top; i--) {
                    System.out.print(elements[i][left] + " ");
                }
                left++;
                direction = 1;
            }
        }


    }
}
