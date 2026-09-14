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
        }
        for (int i = n - 1; i >= 0; i--) {
            maxpostfix = Math.max(maxpostfix, height[i]);
            postfix[i] = maxpostfix;
        }
        for (int i = 0; i < n; i++) {
            int temp = Math.min(prefix[i], postfix[i]);
            result += temp - height[i];
        }
        return result;
    }
}
