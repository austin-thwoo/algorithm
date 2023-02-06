import programers.Jan26_2023;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {


        class Solution {
            public boolean isValid(String s) {

                int len = s.length();

                if(len % 2 != 0) {return false;}

                Stack<Character> stack = new Stack<>();

                for(int i = 0; i < len; i++) {
                    char curn = s.charAt(i);

                    if(curn == '(' || curn == '{' || curn == '[') {
                        stack.push(curn);
                    }

                    else if(stack.size() == 0) {return false;}

                    else if(curn == ')') {
                        if(stack.pop() != '(') {return false;}
                    }
                    else if(curn == '}') {
                        if(stack.pop() != '{') {return false;}
                    }
                    else if(curn == ']') {
                        if(stack.pop() != '[') {return false;}
                    }
                }
                return stack.size() == 0;
            }
        }



    }
}
