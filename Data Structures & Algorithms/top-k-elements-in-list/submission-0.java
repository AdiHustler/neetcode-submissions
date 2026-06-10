class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> result = new ArrayList<>(map.keySet());
        result.sort((a,b)->Integer.compare(map.get(b),map.get(a)));
        int[] ans = new int[k];
        for(int i=0;i<k;i++){
            ans[i]=result.get(i);
        }
        return ans;
    }
}
