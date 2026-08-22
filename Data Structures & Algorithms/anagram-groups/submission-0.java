class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> mpp = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if(!mpp.containsKey(key)){
                mpp.put(key, new ArrayList<>());
            }
            mpp.get(key).add(strs[i]);
        }
        return new ArrayList<>(mpp.values());
    }
}
