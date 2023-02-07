package litecode;

import java.util.Stack;

public class Solution {

    public boolean isValid(String s) {


        int counta = 0;
        int countb = 0;
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> st = new Stack();
        char[] chars = new char[s.length()];
        System.out.println("s.length{}?==>:" + s.length());
        System.out.println("s?==>:" + s);
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);

            if (chars[i] == '[' || chars[i] == '(' || chars[i] == '{') {

                counta++;
                st.push(chars[i]);

                System.out.println("5");
            }
            if (chars[i] == '}') {
                if (st.size() == 0) {
                    return false;

                }
                if (st.peek() != '{') {
                    st.remove(st.peek());
                    System.out.println("4");
                    return false;

                } else {
                    st.remove(st.peek());

                }
                System.out.println("4??");
                countb++;
            }
            if (chars[i] == ']') {
                if (st.size() == 0) {
                    return false;

                }
                if (st.peek() != '[') {
                    return false;
                } else {
                    System.out.println("2");
                    st.remove(st.peek());
                    countb++;
                    System.out.println("2?");
                    return false;
                }

            }
            if (chars[i] == ')') {
                if (st.size() == 0) {
                    return false;

                }
                if (st.peek() != '(') {
                    System.out.println("1");
                    st.remove(st.peek());

                    return false;
                } else {
                    st.remove(st.peek());

                }

                System.out.println("1?");
                countb++;
            }

        }
        if (counta - countb != 0) {
            return false;

        }

        return true;
    }
}
