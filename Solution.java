public class Solution {
    
    public static void main(String[] args) {
        int[] arr = { 2, 4 };
        System.out.println(largestRectangleArea(arr));
    }

    public static int largestRectangleArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxArea = 0;

        while (left <= right) {
            int height = Math.min(heights[left], heights[right]);
            int width = right - left + 1;
            maxArea = Math.max(maxArea, height * width);

            // Move the pointer with the smaller height
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
