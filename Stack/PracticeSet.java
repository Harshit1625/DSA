package Stack;
import java.util.*;

// ---------------------------------------------------------------
// Q1 :- Push at the bottom of the stack + Reversing the stack

public class PracticeSet {

    public void pushAtBottom(int data , Stack<Integer> s){
        if(s.isEmpty()){
          s.push(data);
          return;
        }
        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);

    }

    //firstly recursively it will pop all the elements then we will pushAtBottom fn which will at the elements in reverse order
    public void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverse(s);
        pushAtBottom(top, s);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        PracticeSet ps = new PracticeSet();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        ps.reverse(st);

        while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }   
    }
}
