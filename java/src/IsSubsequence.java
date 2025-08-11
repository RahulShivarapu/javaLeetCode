
public class IsSubsequence {
    public static void main(String[] args){
        String s = "axc", t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }
    public static boolean isSubsequence(String s, String t) {
        int sp=0,tp=0;
        while(sp<s.length() && tp<t.length()){
            if(s.charAt(sp)==t.charAt(tp)){
                sp++;
            }
            tp++;
        }
       return sp == s.length();
    }
}
