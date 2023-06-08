package Arrays;

public class TrappingRaintWaterFastWay {
    public static void main(String[] args) {
        int[] bars = {4, 2, 0, 6, 3, 2, 5};

        // sum of every bar water level
        int trappedWater = 0;

        // max height of left side for every bar
        int[] leftMaxHeight = new int[bars.length];

        // max height of right side for every bar
        int[] rightMaxHeight = new int[bars.length];


        // calculating leftMaxHeight
        leftMaxHeight[0] =  bars[0];
        for (int i =1;i<bars.length;i++){
            leftMaxHeight[i] = Math.max(leftMaxHeight[i-1] , bars[i]);
        }


        // calculating rightMaxHeight
        rightMaxHeight[bars.length - 1] = bars[bars.length - 1];

        for (int i = bars.length-2;i>=0;i--){
            rightMaxHeight[i] = Math.max(rightMaxHeight[i+1] , bars[i]);
        }

        // calculating water for each bar
        for (int k = 0;k<bars.length;k++){
            int minHeight = Math.min(leftMaxHeight[k] , rightMaxHeight[k]);

            int waterLevel = minHeight - bars[k];

            trappedWater+=waterLevel;
        }

        System.out.println(trappedWater);
    }
}
