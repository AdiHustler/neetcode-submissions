class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            switch (token) {
                case "+":
                    int rightAdd = stack.pop();
                    int leftAdd = stack.pop();
                    stack.push(leftAdd + rightAdd);
                    break;

                case "-":
                    int rightSub = stack.pop();
                    int leftSub = stack.pop();
                    stack.push(leftSub - rightSub);
                    break;

                case "*":
                    int rightMul = stack.pop();
                    int leftMul = stack.pop();
                    stack.push(leftMul * rightMul);
                    break;

                case "/":
                    int rightDiv = stack.pop();
                    int leftDiv = stack.pop();
                    stack.push(leftDiv / rightDiv);
                    break;

                default:
                    stack.push(Integer.parseInt(token));
                    break;
            }
        }

        return stack.pop();
    }
}