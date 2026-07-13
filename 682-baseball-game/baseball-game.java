class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack();
        for (String i : operations) {
            if (i.equals("C"))
                stack.pop();
            else if (i.equals("D")) {
                stack.push(stack.peek() * 2);
            } else if (i.equals("+")) {
                int temp = stack.pop();
                int res = stack.peek() + temp;
                stack.push(temp);
                stack.push(res);
            } else {
                stack.push(Integer.parseInt(i));
            }
            System.out.println(stack);
        }

        int sum = 0;
        for (int i : stack) {
            sum += i;
        }
        return sum;
    }
}