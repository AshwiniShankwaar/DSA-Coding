package Target100In30DaysEnd16JanLeetCode.QueueAndStack;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String []argh)
    {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//            String input=sc.next();
//            //Complete the code
//            System.out.println(check(input));
//
//        }
        List<String> lines = List.of("[({})(())]",
        "(({()})))[[",
        "({(){}()})()({(){}()})(){()}{}((()))",
        "{}()))(()()({}}{}",
"}}}}",
        "))))",
        "{{{",
        "(((",
        "{}(){()}((())){{{}}}{()()}{{}{}}",
        "{{{{{{{)))))))))))))))))))",
        "{}{}(",
        "{}}}{}",
        "()()()())))",
        "(((((()()()",
        "(){}{{}}()(()){{()()}}",
        "{}{{{}}}{{{((()))}}}",
        "((()))[]",
        "{{}}(()[])");
        lines.forEach(x-> System.out.println(check(x)));

    }
    public static boolean check(String input){
        Stack<Character> s = new Stack<>();
        char[] arr = input.toCharArray();
        for(char c:arr){
            if(c == '{') s.push('}');
            else if(c == '[') s.push(']');
            else if(c == '(') s.push(')');
            else {
                if(s.size()>0){
                    char out = s.pop();
                    if(c == out){
                        continue;
                    }else{
                        return false;
                    }
                }else{
                    return false;
                }
            }
        }
        if(s.size() != 0) return false;
        return true;
    }
}
