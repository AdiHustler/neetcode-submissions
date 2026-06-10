class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length();
        int m = t.length();
        if(m!=n) return false;
        for(int i = 0;i<n;i++){
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for(int i = 0;i<n;i++){
            char c = t.charAt(i);
            map.put(c, map.getOrDefault(c,0)-1);
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()!=0) return false ;
        }
        return true;
    }
}
