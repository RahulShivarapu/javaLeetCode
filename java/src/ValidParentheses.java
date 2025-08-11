
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "{[]]";
        boolean isValid = isValid(s);
        System.out.println(isValid);
        // System.out.println("true");
    }

    // public static boolean isValid(String s) {

    //     while (true) {
    //         if (s.contains("()")) {
    //             s.replace("()", "");
    //         } else if (s.contains("{}")) {
    //             s.replace("{}", "");
    //         } else if (s.contains("[]")) {
    //             s.replace("[]", "");
    //         } else {
    //             return s.isEmpty();
    //         }
    //     }
    // }

    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for(char ch: s.toCharArray()){
            if(ch == '('||ch == '{'||ch == '[' ){
                stack.push(ch);
            }else{
                if(stack.isEmpty()) return false;
                char top = stack.pop();
                if(ch==')'&& top != '('||
                ch=='}' && top != '{'||
                ch == ']' && top != '['){
                    return false;

                }
            }
        }
        return true;
    }


}
