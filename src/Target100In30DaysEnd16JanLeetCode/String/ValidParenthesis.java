package Target100In30DaysEnd16JanLeetCode.String;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.*/
public class ValidParenthesis {
    public boolean isValid(String s) {

        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='{')
            {
                st.push('}');
            }
            else if(s.charAt(i)=='(')
            {
                st.push(')');
            }
            else   if(s.charAt(i)=='[')
            {
                st.push(']');
            }
            else if( st.isEmpty() ||st.pop()!=s.charAt(i) )
            {

                return false;
            }
        }
        return st.empty();

        //my logic

//        if(s.length()%2!=0) return false;
//        Stack<Character> openBrackets = new Stack<Character>();
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if(c=='{') openBrackets.add('}');
//            if(c=='(') openBrackets.add(')');
//            if(c=='[') openBrackets.add(']');
//
//            if(i == 0 && (c==')' || c== '}' || c== ']') ) return false;
//            if(openBrackets.size() == 0 && (c==')' || c== '}' || c== ']') ) return false;
//            if(openBrackets.size()>0 && (c!='(' && c!='{'&& c!='[' && c != openBrackets.pop())) return false;
//
//        }
//        if(openBrackets.size() != 0) return false;
//        return true;
    }
}
