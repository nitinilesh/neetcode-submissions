class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int prefix[] = new int[n];
        int postfix[] = new int[n];
        int maxprefix = 0;
        int maxpostfix = 0;
        int result = 0;
        for (int i = 0; i < n; i++) {
            maxprefix = Math.max(maxprefix, height[i]);
            prefix[i] = maxprefix;
            maxpostfix = Math.max(maxpostfix, height[n - i - 1]);
            postfix[n - i - 1] = maxpostfix;
        }
        for (int i = 0; i < n; i++) {
            int temp = Math.min(prefix[i], postfix[i]);
            result += temp - height[i];
        }
        return result;
    }
}
