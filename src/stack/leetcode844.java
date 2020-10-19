package stack;

import java.util.Stack;

public class leetcode844 {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> stack1=new Stack<>();
        Stack<Character> stack2=new Stack<>();
        for(char c:S.toCharArray()){
            if(c!='#'){
                stack1.push(c);
            }else{
                if(!stack1.isEmpty()){
                    stack1.pop();
                }
            }
        }
        for(char c:T.toCharArray()){
            if(c!='#'){
                stack2.push(c);
            }else{
                if(!stack2.isEmpty()){
                    stack2.pop();
                }
            }
        }
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        while(!stack1.isEmpty())sb1.append(stack1.pop());
        while(!stack2.isEmpty())sb2.append(stack2.pop());
        return sb1.toString().equals(sb2.toString());
    }
}
