
import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

    public static void main(String[] args) {
        String s = "foo", t = "baa";
        System.out.println(isIsomorphic(s, t));
    }
// O(n2)
    // public static boolean isIsomorphic(String s, String t) {

    //     if (s.length() != t.length()) {
    //         return false;
    //     }
    //     Map<Character, Character> map = new HashMap<>();
    //     for (int c = 0; c < s.length(); c++) {

    //         char schar = s.charAt(c);
    //         char tchar = t.charAt(c);

    //         if (map.containsKey(schar)) {
    //             if (map.get(schar) != tchar) {
    //                 return false;
    //             }
    //         } else if (map.containsValue(tchar)) {
    //             return false;
    //         } else {
    //             map.put(schar, tchar);
    //         }

    //     }

    //     return true;

    // }



    // -------------------O(n)----------------------
    public static boolean isIsomorphic(String s, String t) {

    if (s.length() != t.length()) {
        return false;
    }
    Map<Character, Character> mapST = new HashMap<>();
    Map<Character, Character> mapTS = new HashMap<>();
    for (int c = 0; c < s.length(); c++) {

        char schar = s.charAt(c);
        char tchar = t.charAt(c);

        if (mapST.containsKey(schar)) {
            if (mapST.get(schar) != tchar) {
                return false;
            }
        } else {
            if (mapTS.containsKey(tchar)) {
                if (mapTS.get(tchar) != schar) {
                    return false;
                }
            }
            mapST.put(schar, tchar);
            mapTS.put(tchar, schar);
        }
    }

    return true;
}
}
