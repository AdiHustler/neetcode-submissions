class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maximum=0;
        for(int pile:piles){
            maximum=Math.max(pile,maximum);
        }
        int start = 1;
        int end = maximum;
        int mini = maximum;
        while(start<=end){
            int k = start+(end-start)/2;
            int total = 0;
            for(int pile:piles){
                int finish = (int)Math.ceil((double)pile/k);
                total+=finish;
            }
            if(total<=h){
                mini = k;
                end = k-1;
            }
            else{
                start = k+1;
            }
        }
        return mini;
    }
}
