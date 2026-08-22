class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mpp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!mpp.containsKey(nums[i])){
                mpp.put(nums[i],1);
            }
            else mpp.put(nums[i], mpp.get(nums[i])+1);
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(mpp.entrySet());
        list.sort((a,b) -> b.getValue() - a.getValue());
        int result[] = new int[k];
        for(int i=0;i<k;i++){
            result[i] = list.get(i).getKey();
        }
        return result;
    }
}