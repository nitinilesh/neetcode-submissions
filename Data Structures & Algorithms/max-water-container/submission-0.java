class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int l = 0;
        int r = n - 1;
        long result = 0;
        while (l < r) {
            int height = Math.min(heights[l], heights[r]);
            int base = r - l;
            long area = (long) height * base;
            result = Math.max(result, area);
            if (heights[l] > heights[r]){
                r--;
            }
            else{
                l++;
            }
        }
        return (int) result;
    }
}
