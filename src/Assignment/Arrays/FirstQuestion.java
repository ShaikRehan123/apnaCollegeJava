package Assignment.Arrays;

public class FirstQuestion {
    public boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true; // Found a duplicate value
                }
            }
        }
        return false; // No duplicates found
    }
}
