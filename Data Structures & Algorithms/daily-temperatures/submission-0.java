class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int n=temperatures.length;
        int[] res = new int[n];
        for(int end= n-1;end>=0;end--){
            while(!stack.isEmpty() && temperatures[end] >= temperatures[stack.peek()]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                res[end] = stack.peek()-end;
            }
            stack.push(end);
        }
        return res;
    }
}
