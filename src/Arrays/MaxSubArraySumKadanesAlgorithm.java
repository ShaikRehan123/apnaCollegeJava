package Arrays;

public class MaxSubArraySumKadanesAlgorithm {
    public static void main(String[] args){
        int[] elements = {5,4,-1,7,8};

        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i=0;i<elements.length;i++){
            cs = cs + elements[i];
            if(cs<0){
                cs = 0;
            }

            ms = Math.max(ms,cs);
        }

        System.out.println(ms);
    }
}
