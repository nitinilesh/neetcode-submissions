class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int arr[] = new int[len];
        for (int left = 0; left < len; left++) {
            int right = left + 1;
            while (right < len && temperatures[right] <= temperatures[left]) {
                right++;
            }
            if (right < len) {
                arr[left] = right - left;
            }
        }
        return arr;
    }
}
