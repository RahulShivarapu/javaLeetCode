
import java.util.Arrays;

public class ValidAnagram {

    public static void main(String[] args) {
     
        String  s = "zebra", t = "abrez";
        System.out.println(isAnagram(s, t));
        
    }
    public static boolean isAnagram(String s, String t) {
        
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        // System.out.println(s+t);
        if(Arrays.equals(arr1, arr2)){
            return true;
        }
        return false;
    
    //----0(n)------------//

        // if(s.length()!=s.length()){
        //     return false;
        // }
        // int[] freq = new int[26];
        // for(int i =0; i< s.length(); i++){
        //     freq[s.charAt(i)-'a']++;
        //     freq[t.charAt(i)-'a']--;
        // }

        // for(int count: freq){
        //     if (count!=0) {
        //         return false;
        //     }
        // }
        // return true;
    }
}
