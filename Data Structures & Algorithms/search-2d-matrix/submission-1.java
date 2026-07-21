class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int start = 0;
        int end = rows*cols-1;  // Flatening the 2d array
        while(start<=end){
            int mid = start+(end-start)/2;
            int row = mid/cols; // // Every 'cols' elements, we move to the next row, isiliye factor se poori row k elements cross ho jayenge
            int col = mid%cols; // We need the remainders i.e 0,1,2,...
            if(matrix[row][col]==target) return true;
            else if(matrix[row][col]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return false;
    }
}
