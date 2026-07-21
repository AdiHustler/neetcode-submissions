class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int[] flat = Arrays.stream(matrix)
                            .flatMapToInt(Arrays::stream)
                            .toArray();
        int start=0;
        int end=flat.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(flat[mid]==target) return true;
            else if(flat[mid]>target) end = mid-1;
            else{
                start =mid+1;
            }
        }
        return false;
    }
}
