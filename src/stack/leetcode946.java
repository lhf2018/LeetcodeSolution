package stack;

import java.util.Stack;

/**
 * 依次把pushed压入栈，遇到栈顶与popped，就弹出栈
 * 最后判断poped是否能操作完
 */
public class leetcode946 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack=new Stack<>();
        int index=0;
        for(int i=0;i<pushed.length;i++){
            stack.push(pushed[i]);
            while(index<popped.length&&stack.size()!=0
                    &&popped[index]==stack.peek()){
                index++;
                stack.pop();
            }
        }
        if(index==popped.length){
            return true;
        }else{
            return false;
        }
    }
}
