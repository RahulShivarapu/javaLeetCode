
public class FirstOccurenceinString {
    public static void main(String[] args) {
        String haystack = "leetcode", needle = "leeto";
        System.out.println(strStr(haystack, needle));
    }
     public static int strStr(String haystack, String needle) {
        int needleLen = needle.length();
        int haystackLen = haystack.length();

        for(int i =0; i < haystackLen ; i++){
            String sub = haystack.substring(i, Math.min(i+needleLen , haystackLen));
        if(needle.equals(sub)){
            return i;
        }
        }
        return -1;
    }

}
