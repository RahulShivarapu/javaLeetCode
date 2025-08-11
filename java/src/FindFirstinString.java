
// import java.util.LinkedList;
import java.util.*;

public class FindFirstinString {

    public static void main(String[] args) {
        String str = "swiss";
        System.out.println(findFirstRepeatingChar(str));

    }


    public static Character findFirstRepeatingChar(String str){

        Set<Character> setStr = new HashSet<>();
        for(char c : str.toCharArray()){
            if(setStr.contains(c)){
                return c;
        }else{
            setStr.add(c);
        }
    }
        return null;
    }
}
