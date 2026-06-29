class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        int longest = 1;
        int start = 0;
        int end = start+1;
        HashSet<Character> set = new HashSet<>();
        set.add(s.charAt(0));
        while(end<s.length()){
            if(!set.contains(s.charAt(end))){
                set.add(s.charAt(end));
                longest = Math.max(longest, end - start + 1);
                end++;
            }
            else{
                set.remove(s.charAt(start));
                start++;
            }
        }
        return longest;
    }
}
