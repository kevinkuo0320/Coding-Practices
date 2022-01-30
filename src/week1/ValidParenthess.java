package week1;

import java.util.Stack;

public class ValidParenthess {
    class Solution {
        public boolean isValid(String s) {

            //classical stack problems O(n) time

            Stack<Character> stack = new Stack<>();

            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '('){
                    stack.push('(');
                } else if(s.charAt(i) == '{'){
                    stack.push('{');
                } else if(s.charAt(i) == '['){
                    stack.push('[');
                } else if(s.charAt(i) == ')'){
                    if(!stack.isEmpty() && stack.peek() == '('){
                        stack.pop();
                    } else {
                        return false;
                    }
                }  else if(s.charAt(i) == ']'){
                    if(!stack.isEmpty() && stack.peek() == '['){
                        stack.pop();
                    } else {
                        return false;
                    }
                } else if(s.charAt(i) == '}'){
                    if(!stack.isEmpty() && stack.peek() == '{'){
                        stack.pop();
                    } else {
                        return false;
                    }
                }

            }
            return stack.isEmpty();

        }
    }
}
