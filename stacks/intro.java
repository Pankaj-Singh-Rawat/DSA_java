package stacks;

import java.util.Stack;

public class intro {
    // Stack
    // 1. It is a linear data structure.
    // 2. Follows Last IN First OUT principle.

    // it has 4 opertaions in total :
    // push()
    // pop()
    // peek()
    // IsEmpty()

    public static void main(String[] args) {
        usingStacks();

        // Question 1:
        String input1 = "([])";
        System.out.println(validParenthesis(input1));

    }

    public static boolean validParenthesis(String s) {

        // Question 1 (Valid Parentheses)

        // Task:
        // Given a string s containing just the characters '(', ')', '{', '}', '[' and
        // ']', determine if the input string is valid.

        // Input: "()[]{}"
        // Output: true

        Stack<Character> st = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if(c == '{' || c == '(' || c == '['){
                st.push(c);
            }else{
                if(st.isEmpty()){
                    return false;
                }
                char top = st.pop();
                if(c == '}' && top != '{'){
                    return false;
                }else if(c == ']' && top != '['){
                    return false;
                }else if(c == ')' && top != '('){
                    return false;
                }
            }
            
        }

        
        return st.isEmpty();

    }

    public static void usingStacks() {
        Stack<Integer> st = new Stack<>();

        st.push(5);
        st.push(32);
        st.push(55);
        st.push(35);

        System.out.println(st);

        st.pop();
        System.out.println(st);

        System.out.println(st.peek());

        System.out.println(st.isEmpty());
    }

}
