package Arrays;

public class MaxSubArraySumBruteForce {

    public static int MaxSubArray(int[] nums) {

        if(nums == null || nums.length == 0)
            return 0;

        int maxSum = nums[0];

        for(int i = 0; i < nums.length; i++)
        {
            for(int j = i; j < nums.length; j++)
            {
                int currSum = 0;

                for(int k = i; k <= j; k++)
                {
                    currSum += nums[k];
                }

                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }

        return maxSum;
    }


    public static void main(String[] args){
        int[] elements = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println(MaxSubArray(elements));
    }

}

