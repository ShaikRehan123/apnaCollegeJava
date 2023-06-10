package Assignment.Arrays;

public class SecondQuestion {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Check which side is sorted
            if (nums[left] <= nums[mid]) { // Left side is sorted
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1; // Search in the left side
                } else {
                    left = mid + 1; // Search in the right side
                }
            } else { // Right side is sorted
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1; // Search in the right side
                } else {
                    right = mid - 1; // Search in the left side
                }
            }
        }

        return -1; // Target element not found
    }
}
