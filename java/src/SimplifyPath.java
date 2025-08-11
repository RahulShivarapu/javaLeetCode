
import java.util.Stack;

public class SimplifyPath {

    public static void main(String[] args) {
        String path = "/.../a/../b/c/../d/./";
        String res =simplifyPath(path);
        System.out.println(res);

    }
    public static String simplifyPath(String path) {
        
        Stack<String> stack = new Stack<>();
        String[] parts = path.split("/");
        for(String s: parts) {
            if(s.equals("")||s.equals(".")||s.equals("//")){
                continue;
            }else if(s.equals("..")){
                if(!stack.isEmpty()){
                stack.pop();
                }
            }else{
                stack.push(s);
            }
        }
        String res = "/"+String.join("/",stack);
        return res;
     }
}
