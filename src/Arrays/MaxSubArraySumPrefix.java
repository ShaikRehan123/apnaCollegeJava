package Arrays;

public class MaxSubArraySumPrefix {
    public static void main(String[] args){
        int[] elements = {-2,-3,4,-1,-2,1,5,-3};
        int[] prefix = new int[elements.length];

        for (int i =0;i<elements.length;i++){
            if(i == 0){
                prefix[i] = elements[0];
            } else{
                prefix[i] = prefix[i-1] + elements[i];
            }
        }

        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<elements.length;i++){
            int start = i;
            for(int j =i;j<elements.length;j++){
                int end = j;
                int currSum;

                if(start == 0){
                    currSum = prefix[end];
                }else{
                    currSum = prefix[end] - prefix[start-1];
                }


                if(maxSum < currSum){
                    maxSum = currSum;
                }

            }
        }


        System.out.println(maxSum);
    }
}
