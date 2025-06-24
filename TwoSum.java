public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        // Try every pair of numbers
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // Check if the sum matches the target
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        // If no solution found (as per problem, this won't happen)
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println("Indices: " + result[0] + " and " + result[1]);
    }
}
