package Assignment.Arrays;

public class FourthQuestion {
    public int trap(int[] heights) {
            int len = heights.length;
            int result = 0, left = 0, right = len - 1;
            int rightMax = heights[right], leftMax = heights[left];

            while (left < right) {
                if (leftMax < rightMax) {
                    left++;
                    leftMax = Math.max(leftMax, heights[left]);
                    result += leftMax - heights[left];
                } else {
                    right--;
                    rightMax = Math.max(rightMax, heights[right]);
                    result += rightMax - heights[right];
                }
            }

            return result;
    }
}


