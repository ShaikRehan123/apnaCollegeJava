package Arrays;

import java.util.Arrays;

public class TrappingRainWaterSlowWay {
    public static void main(String[] args){
        int[] bars = {4,2,0,6,3,2,5};

        int waterTrapped = 0;

        for (int k=0;k<bars.length;k++){
            int[] leftArray = Arrays.copyOfRange(bars , 0,k + 1);
            int[] rightArray = Arrays.copyOfRange(bars , k , bars.length);

            int maxLeft = maxNum(leftArray);
            int maxRight = maxNum(rightArray);

            int minNumber = Math.min(maxLeft,maxRight);

            int trappedWater = minNumber - bars[k];

            waterTrapped+=trappedWater;
        }

        System.out.println(waterTrapped);
    }

    public static int maxNum(int[] numbers){
        int max = Integer.MIN_VALUE;

        for (int i =0;i<numbers.length;i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
        }

        return max;
    }


}
