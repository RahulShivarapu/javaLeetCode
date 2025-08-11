import java.util.*;

public class WordPatten {
    public static void main(String[] args) {
        // wordPattern("abba", "dog cat cat fish");
        System.out.println(wordPattern("abba", "dog dog dog dog"));
    }
    public static boolean wordPattern(String pattern, String s) {
        Map<Character,String> map = new HashMap<>();

        String[] words= s.split(" ");
        if(pattern.length()!=words.length){
            return false;
        }
        
        for(int i=0;i<pattern.length();i++){
            if(map.containsKey(pattern.charAt(i))){
                if(!map.get(pattern.charAt(i)).equals(words[i])){
                    return false;
                }
            }else{
                if(map.containsValue(words[i])){
                    return false;
                }
                map.put(pattern.charAt(i), words[i]);
            }
        }

        return true;
    }

    


}
