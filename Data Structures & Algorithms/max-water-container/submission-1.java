class Solution {
    public int maxArea(int[] heights) {

        int l = 0;
        int r = heights.length - 1;
        int result = 0;

        while (l < r) {

            int height = Math.min(heights[l], heights[r]);
            int base = r - l;

            int area = height * base;

            result = Math.max(result, area);

            if (heights[l] > heights[r]) {
                r--;
            } else {
                l++;
            }
        }

        return result;
    }
}