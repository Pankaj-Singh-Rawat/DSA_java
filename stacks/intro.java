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
    }

    public static void usingStacks(){
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
