
import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);

    }

    public int pop() {
        if(!stack2.isEmpty()){
            return stack2.pop();
        }else if(!stack1.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }else
            return -1;
    }
    public static void main(String[] args) {
        Solution a=new Solution();
        a.push(1);
        a.push(2);
        System.out.println(a.pop());
        a.push(3);
        System.out.println(a.pop());
    }
}


